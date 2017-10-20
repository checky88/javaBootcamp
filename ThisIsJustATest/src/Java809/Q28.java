package Java809;

import java.util.Set;
import java.util.TreeSet;

class Q28 {
 
    int vno;
    String name;
 
    public Q28(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }
 
    public String toString() {
        return vno + ":" + name;
    }
    
	
    public static void main(String[] args) {


    	Set<Q28> vehicles = new TreeSet<>();
    	vehicles.add(new Q28(10123, "Ford"));
    	vehicles.add(new Q28(10124, "BMW"));
    	System.out.println(vehicles);
    }

}//https://magiclen.org/ocpjp-treeset/