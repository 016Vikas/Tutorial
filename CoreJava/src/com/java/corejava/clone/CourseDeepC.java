/*To create a deep copy of an object, you have to override the clone() method as demonstrated 
 * in the below example.
 */

package com.java.corejava.clone;


class Course implements Cloneable
{
    String subject1;
 
    String subject2;
 
    String subject3;
 
    public Course(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;
 
        this.subject2 = sub2;
 
        this.subject3 = sub3;
    }
 
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
 
class Student implements Cloneable
{
    int id;
    String name;
    Course course;
     public Student(int id, String name, Course course)
    {
        this.id = id;
        this.name = name;
        this.course = course;
    }
     //Overriding clone() method to create a deep copy of an object.
     protected Object clone() throws CloneNotSupportedException
    {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }
}