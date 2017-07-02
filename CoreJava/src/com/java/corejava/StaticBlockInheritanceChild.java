package com.java.corejava;

import com.java.corejava.utils.StaticBlockInheritance;

	public class StaticBlockInheritanceChild extends StaticBlockInheritance {    
	    
		{
	        System.out.println("Child initialisation block");
	    }
	    
	    static {
	        System.out.println("Child static block");
	    }

	    public StaticBlockInheritanceChild() {
	        System.out.println("Child Constructor");
	    }    
	    
	    public static void main(String[] args) {
	        new StaticBlockInheritanceChild();    
	    }
	}
	/*	The output of the above code will be

	Parent static block
	Child static block
	Parent initialization  block
	Parent Constructor
	Child initialization block
	Child Constructor
*/