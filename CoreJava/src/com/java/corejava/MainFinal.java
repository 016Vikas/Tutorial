package com.java.corejava;

    class Base {
            public final void doSomething(Object o) {
                    System.out.println("Object");
            }
    }

    class Derived extends Base {
            public void doSomething(Integer i) {
                    System.out.println("Int");
            }
    }

    public class MainFinal {
            public static final void main(String[] args) {
                    Base b = new Base();
                    Derived d = new Derived();
                    b.doSomething(new Integer(0));
                    d.doSomething(new Integer(0));
                    
                    Base b1 = new Derived();
                    b1.doSomething(new Integer(0));
            }
    }
