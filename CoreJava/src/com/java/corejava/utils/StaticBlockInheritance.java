package com.java.corejava.utils;

//In what order do static blocks and initialization blocks execute when using inheritance?
public class StaticBlockInheritance {
	
	    public StaticBlockInheritance() {
	        System.out.println("Parent Constructor");
	    }    
	    
	    static {
	        System.out.println("Parent static block");    
	    }
	    
	    {
	        System.out.println("Parent initialisation  block");
	    }
	}