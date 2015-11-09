/*
 * This software was written by John Slowik
 * Please don't do anything he wouldn't do
 *
 */
package SlowikLab;

import common.Employee;
import java.util.Comparator;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class EmployeeByFirstName implements Comparator<Employee> {

    @Override
       public int compare(Employee e1, Employee e2) {
        return e1.getFirstName().compareTo(e2.getFirstName());
    }
}
