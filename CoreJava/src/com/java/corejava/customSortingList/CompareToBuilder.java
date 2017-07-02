package com.java.corejava.customSortingList;


import java.util.Comparator;
 
//import org.apache.commons.lang3.builder.CompareToBuilder;
 
/**
 * This comparator sorts a list of Employees by job title, age and salary
 * into ascending order.
 * @author www.codejava.net
 *
 */
public class CompareToBuilder implements Comparator<Employee> {
 
    @Override
    public int compare(Employee o1, Employee o2) {
        return new CompareToBuilder()
                .append(o1.getJobTitle(), o2.getJobTitle())
                .append(o1.getAge(), o2.getAge())
                .append(o1.getSalary(), o2.getSalary()).toComparison();
    }
}

/*
 * Switching sort order: ascending to descending
To reverse sort order from ascending to descending of a particular attribute, simply swap the order of the two objects being compared in the comparator. For example, the following comparator sorts the list by job title and age in ascending order, but by salary in descending order:

	
public class EmployeeComparator implements Comparator<Employee> {
 
    @Override
    public int compare(Employee o1, Employee o2) {
        return new CompareToBuilder()
                .append(o1.getJobTitle(), o2.getJobTitle())
                .append(o1.getAge(), o2.getAge())
                .append(o2.getSalary(), o1.getSalary()).toComparison();
    }
}
 */
*/