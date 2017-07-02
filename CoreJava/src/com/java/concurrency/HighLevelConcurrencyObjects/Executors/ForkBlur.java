package com.java.concurrency.HighLevelConcurrencyObjects.Executors;

import java.util.concurrent.RecursiveAction;

/*
Blurring for Clarity
To help you understand how the fork/join framework works, consider the following example. Suppose that you want to blur an image. The original source image is represented by an array of integers, where each integer contains the color values for a single pixel. The blurred destination image is also represented by an integer array with the same size as the source.
Performing the blur is accomplished by working through the source array one pixel at a time. Each pixel is averaged with its surrounding pixels (the red, green, and blue components are averaged), and the result is placed in the destination array. Since an image is a large array, this process can take a long time. You can take advantage of concurrent processing on multiprocessor systems by implementing the algorithm using the fork/join framework. Here is one possible implementation:*/
public class ForkBlur extends RecursiveAction {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8125148746913250584L;
	private int[] mSource;
    private int mStart;
    private int mLength;
    private int[] mDestination;
  
    // Processing window size; should be odd.
    private int mBlurWidth = 15;
  
    public ForkBlur(int[] src, int start, int length, int[] dst) {
        mSource = src;
        mStart = start;
        mLength = length;
        mDestination = dst;
    }

    protected void computeDirectly() {
        int sidePixels = (mBlurWidth - 1) / 2;
        for (int index = mStart; index < mStart + mLength; index++) {
            // Calculate average.
            float rt = 0, gt = 0, bt = 0;
            for (int mi = -sidePixels; mi <= sidePixels; mi++) {
                int mindex = Math.min(Math.max(mi + index, 0),
                                    mSource.length - 1);
                int pixel = mSource[mindex];
                rt += (float)((pixel & 0x00ff0000) >> 16)
                      / mBlurWidth;
                gt += (float)((pixel & 0x0000ff00) >>  8)
                      / mBlurWidth;
                bt += (float)((pixel & 0x000000ff) >>  0)
                      / mBlurWidth;
            }
          
            // Reassemble destination pixel.
            int dpixel = (0xff000000     ) |
                   (((int)rt) << 16) |
                   (((int)gt) <<  8) |
                   (((int)bt) <<  0);
            mDestination[index] = dpixel;
        }
    }
  
/*  ...
Now you implement the abstract compute() method, which either performs the blur directly or splits it into two smaller tasks.com.java.corejava.innerClass.A simple array length threshold helps determine whether the work is performed or split.
*/
    
    protected static int sThreshold = 100000;
protected void compute() {
	
    if (mLength < sThreshold) {
        computeDirectly();
        return;
    }
    
    int split = mLength / 2;
    
    invokeAll(new ForkBlur(mSource, mStart, split, mDestination),
              new ForkBlur(mSource, mStart + split, mLength - split,
                           mDestination));
}
}
/*If the previous methods are in a subclass of the RecursiveAction class, then setting up the task to run in a ForkJoinPool is straightforward, and involves the following steps:
1.	Create a task that represents all of the work to be done.
2.	// source image pixels are in src
3.	// destination image pixels are in dst
4.	ForkBlur fb = new ForkBlur(src, 0, src.length, dst);
5.	Create the ForkJoinPool that will run the task.
6.	ForkJoinPool pool = new ForkJoinPool();
7.	Run the task.
8.	pool.invoke(fb);
For the full source code, including some extra code that creates the destination image file, see the ForkBlur example.

*/