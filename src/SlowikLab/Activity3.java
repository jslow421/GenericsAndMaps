/*
 * This software was written by John Slowik
 * Please don't do anything he wouldn't do
 *
 */
package SlowikLab;

import common.Employee;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Activity3 {

    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2, "Smith", "Sally", "111-11-1112");
        Employee e3 = new Employee(4, "Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee(1, "Mallay", "Fred", "111-11-1111");

        Map<String, Employee> employeeMap = new TreeMap<String, Employee>();

        employeeMap.put(e1.getSsn(), e1);
        employeeMap.put(e2.getSsn(), e2);
        employeeMap.put(e3.getSsn(), e3);
        employeeMap.put(e4.getSsn(), e4);

        Set<String> keys = employeeMap.keySet();
        for (String key : keys) {
            Employee found = employeeMap.get(key);
            System.out.println(found);
        }

    }
}
