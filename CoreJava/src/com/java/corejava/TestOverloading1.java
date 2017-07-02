package com.java.corejava;

//1) Method Overloading: changing no. of arguments

class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}} 

//2) Method Overloading: changing data type of arguments
/*class Adder{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}} */ 

//Q) Why Method Overloading is not possible by changing the return type of method only?
/*    class Adder{  
    static int add(int a,int b){return a+b;}  
    static double add(int a,int b){return a+b;}  
    }  
    class TestOverloading3{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11));//ambiguity  
    }}
    
      //Compile Time Error: method add(int,int) is already defined in class Adder
       //System.out.println(Adder.add(11,11)); //Here, how can java determine which sum() method should be called?
    */


//Can we overload java main() method?
//Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only. Let's see the simple example:
/*
class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
} */

//Example of Method Overloading with TypePromotion
/*
 *     class OverloadingCalculation1{  
      void sum(int a,long b){System.out.println(a+b);}  
      void sum(int a,int b,int c){System.out.println(a+b+c);}  
      
      public static void main(String args[]){  
      OverloadingCalculation1 obj=new OverloadingCalculation1();  
      obj.sum(20,20);//now second int literal will be promoted to long  
      obj.sum(20,20,20);  
      
      }  
    }  
 */
//Example of Method Overloading with Type Promotion if matching found
/*
If there are matching type arguments in the method, type promotion is not performed.

class OverloadingCalculation2{  
  void sum(int a,int b){System.out.println("int arg method invoked");}  
  void sum(long a,long b){System.out.println("long arg method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation2 obj=new OverloadingCalculation2();  
  obj.sum(20,20);//now int arg sum() method gets invoked  
  }  
}  
*/

//Example of Method Overloading with Type Promotion in case of ambiguity

//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.
/*
    class OverloadingCalculation3{  
      void sum(int a,long b){System.out.println("a method invoked");}  
      void sum(long a,int b){System.out.println("b method invoked");}  
      
      public static void main(String args[]){  
      OverloadingCalculation3 obj=new OverloadingCalculation3();  
      obj.sum(20,20);//now ambiguity  
      }  
    }
    */  