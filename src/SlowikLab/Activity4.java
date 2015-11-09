/*
 * This software was written by John Slowik
 * Please don't do anything he wouldn't do
 *
 */
package SlowikLab;

import common.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Activity4 {

    public static void main(String[] args) {

        Employee e1 = new Employee(3, "Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2, "Smith", "Sally", "111-11-1112");
        Employee e3 = new Employee(4, "Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee(1, "Mallay", "Fred", "111-11-1111");

        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);

        for (Employee e : employeeSet) {
            System.out.println(e);
        }

        System.out.println("");
        System.out.println("Order by first name:");
        System.out.println("");

        List<Employee> list = new ArrayList<>(employeeSet);
        Collections.sort(list, new EmployeeByFirstName());
        for (Employee e : list) {
            System.out.println(e);
        }
    }

}
