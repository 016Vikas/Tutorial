package com.java.corejava;

	// A sample Java program to demonstrate use and
	// working of blank final
	class Test1
	{
	    // We can initialize here, but if we initialize here, then all objects get
	    // the same value.  So we use blank final
	    final int i;
	 
	    Test1(int x)
	    {
	        // Since we have initialized above, we must initialize i in constructor.
	        // If we remove this line, we get compiler error.
	        i = x;
	    }
	}
	 
	// Driver Code
	class BlankFinalMembers
	{
	    public static void main(String args[])
	    {
	        Test1 t1 = new Test1(10);
	        System.out.println(t1.i);
	 
	        Test1 t2 = new Test1(20);
	        System.out.println(t2.i);
	    }
	}
