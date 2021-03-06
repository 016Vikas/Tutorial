package com.java.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import com.java.corejava.utils.Employee;

/*
 * In below java program we are going to create Employee objects in all 5 ways, You can also found the complete 
 * source code at Github.
 */

public class ObjectCreation5Ways {
    public static void main(String... args) throws Exception {

        // By using new keyword
        Employee emp1 = new Employee();
        emp1.setName("Naresh");

        System.out.println(emp1 + ", hashcode : " + emp1.hashCode());


        // By using Class class's newInstance() method
        Employee emp2 = (Employee) Class.forName("com.java.corejava.utils.Employee")
                               .newInstance();

        // Or we can simply do this
        // Employee emp2 = Employee.class.newInstance();

        emp2.setName("Rishi");

        System.out.println(emp2 + ", hashcode : " + emp2.hashCode());


        // By using Constructor class's newInstance() method
        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee emp3 = constructor.newInstance();
        emp3.setName("Yogesh");

        System.out.println(emp3 + ", hashcode : " + emp3.hashCode());

        // By using clone() method
        Employee emp4 = (Employee) emp3.clone();
        emp4.setName("Atul");

        System.out.println(emp4 + ", hashcode : " + emp4.hashCode());


        // By using Deserialization

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));

        out.writeObject(emp4);
        out.close();

        //Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Employee emp5 = (Employee) in.readObject();
        in.close();

        emp5.setName("Akash");
        System.out.println(emp5 + ", hashcode : " + emp5.hashCode());
            }
}


/*This program will give following output

Employee Constructor Called...
Employee [name=Naresh], hashcode : -1968815046
Employee Constructor Called...
Employee [name=Rishi], hashcode : 78970652
Employee Constructor Called...
Employee [name=Yogesh], hashcode : -1641292792
Employee [name=Atul], hashcode : 2051657
Employee [name=Akash], hashcode : 63313419

*/

