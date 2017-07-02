package com.java.corejava;

/*If the return in the try block is reached, it transfers control to the finally block, and the function 
 * eventually returns normally (not a throw).

If an exception occurs, but then the code reaches a return from the catch block, control is transferred to 
the finally block and the function eventually returns normally (not a throw).

In your example, you have a return in the finally, and so regardless of what happens, the function will 
return 34, because finally has the final (if you will) word.
Although not covered in your example, this would be true even if you didn't have the catch and if an 
exception were thrown in the try block and not caught. By doing a return from the finally block, you 
suppress the exception entirely. Consider:
*/

public class FinallyReturn {
  public static final void main(String[] args) {
 
	  try {
	    	System.out.println("In try block @main");
	    	System.out.println(foo(args));  	
	    }catch(Exception ex){
	    	System.out.println("In catch block @main");	
	    }
	    finally {
	    	System.out.println("In finally @main");
	    }
  }

public static int foo(String[] args) throws Exception 
  {
    try {
    	System.out.println("In try block @foo");
      int n = Integer.parseInt(args[0]);
      return n;
    }catch(Exception ex){
    	System.out.println("In catch block @foo");	
    	throw ex;
    }
    finally {
    	System.out.println("In finally @foo");
      return 42;
    }
  }

/*
int Test()
{
    int result = 4;
    try
    {
        return result;
    }
    finally
    {
        // Attempt to subvert the result
        result = 1;
    }
}*/
}

/*If you run that without supplying any arguments:

$ java FinallyReturn

...the code in foo throws an ArrayIndexOutOfBoundsException. But because the finally block does a return, that exception gets suppressed.

This is one reason why it's best to avoid using return in finally.
*/