/*
 * This software was written by John Slowik
 * Please don't do anything he wouldn't do
 *
 */
package SlowikLab;

import common.Employee;
import java.util.*;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Activity2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(3,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(4,"Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee(1,"Mallay", "Fred", "111-11-1111");
        
        
        HashMap<String, Employee> employeeMap = new HashMap<>();
        
        employeeMap.put(e1.getSsn(), e1);
        employeeMap.put(e2.getSsn(), e2);
        employeeMap.put(e3.getSsn(), e3);
        employeeMap.put(e4.getSsn(), e4);
        
        System.out.println(employeeMap.get("111-11-1111"));
        
        //Set keys = employeeMap.keySet();
        System.out.println("");
        
      
       Iterator it = employeeMap.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); 
    }
    }
    
}
