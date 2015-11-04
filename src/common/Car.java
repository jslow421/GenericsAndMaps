/*
 * This software was written by John Slowik
 * Please don't do anything he wouldn't do
 *
 */
package common;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author John Slowik <jslowik@my.wctc.edu>
 */
public class Car implements Comparable {

    private int vinNumber;

// this is the string version compareTo method
//    public int compareTo(Object o) {//automatically throws null and class exceptions per documentation
//        Car targetCar = (Car)o; // cast o to car object
//        
//        return this.getVinNumber().compareTo(targetCar.getVinNumber());
//    }
    //this is the int version of the compareTo method -- much more complex
//    @Override
//    public int compareTo(Object o){
//        Car targetCar = (Car)o;
//        final int EQUAL = 0;
//        final int BEFORE = -1;
//        final int AFTER = 1;
//        
//        if (this.equals(targetCar)){
//            return EQUAL;
//        }if (targetCar.getVinNumber() < this.vinNumber){
//            return BEFORE;
//        }else{
//            return AFTER;
//        }
//        
//    }
    public int compareTo(Object other) {

        Car targetCar = (Car) other;

        return new CompareToBuilder()
                .append(this.vinNumber, targetCar.vinNumber)
                .toComparison();
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.vinNumber;
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
        final Car other = (Car) obj;
        if (this.vinNumber != other.vinNumber) {
            return false;
        }
        return true;
    }

}
