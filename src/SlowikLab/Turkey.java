/*
 * This software was written by John Slowik
 * Please don't do anything he wouldn't do
 *
 */
package SlowikLab;

import common.Employee;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Turkey implements Comparable{
    private String name;
    private double weight;
    private String tagNumber;

    public Turkey(String name, double weight, String tagNumber) {
        this.name = name;
        this.weight = weight;
        this.tagNumber = tagNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.tagNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (!Objects.equals(this.tagNumber, other.tagNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turkey{" + "name=" + name + ", weight=" + weight + ", tagNumber=" + tagNumber + '}';
    }

    @Override
    public int compareTo(Object obj) {
        Turkey t = (Turkey)obj;
        
        return new CompareToBuilder()
               .append(this.tagNumber, t.tagNumber)
               .toComparison();
    }
    

    
    
    
    public static void main(String[] args) {
        
        Turkey turkey1 = new Turkey("Gina", 10, "2");
        Turkey turkey2 = new Turkey("Harriet", 20, "3");
        Turkey turkey3 = new Turkey("Bob", 15, "1");
        
        HashMap<String, Turkey> turkeyMap = new HashMap<>();
        
        turkeyMap.put(turkey1.getTagNumber(), turkey1);
        turkeyMap.put(turkey2.getTagNumber(), turkey2);
        turkeyMap.put(turkey3.getTagNumber(), turkey3);
        
        Iterator it = turkeyMap.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove(); // avoids a ConcurrentModificationException
    }
    }
    
}
