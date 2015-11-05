/*
 * This software was written by John Slowik
 * Please don't do anything he wouldn't do
 *
 */
package SlowikLab;
import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class ListOfMapsDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(3,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1112");
        Employee e3 = new Employee(4,"Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee(1,"Mallay", "Fred", "111-11-1111");
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        
        
        List<Map<String,Object>> records = new ArrayList<>();
        
        Map<String, Object> genericObject = new HashMap<>();
        genericObject.put("empID", 1);
        genericObject.put("lastName", "Doe");
        genericObject.put("firstName","John");
        genericObject.put("ssn", "333-33-3333");
        
        records.add(genericObject);
        
        
        
        
        /*
        //wrong approach
        //most basic use of a map
        Employee e1 = new Employee(3,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1112");
        Employee e3 = new Employee(4,"Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee(1,"Mallay", "Fred", "111-11-1111");
        
        Map<String, Employee> employees = new HashMap<>();//this is rigid (only employee)
        employees.put(e1.getSsn(), e1);
        employees.put(e2.getSsn(), e2);
        employees.put(e3.getSsn(), e3);
        employees.put(e4.getSsn(), e4);
        
        Employee e = employees.get("333-33-3333");
        
        System.out.println("Found employee: " + e);
                */
    }
}
