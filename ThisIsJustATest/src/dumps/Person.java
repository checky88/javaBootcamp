package dumps;

import java.util.ArrayList;

class Alpha {
public String doStuff(String msg) {
return msg;
}
}

class Beta extends Alpha {
public String doStuff(String msg) {
return msg.replace('a', 'e');
}	
}

class Gamma extends Beta {
public String doStuff(String msg) {
return msg.substring(2);
}
}

public class Person {
public static void main(String[] args) {
ArrayList<Alpha> lst = new ArrayList<Alpha>();
lst.add(new Alpha());
lst.add(new Beta());
lst.add(new Gamma());

for (Alpha alpha : lst) {
System.out.println(alpha.doStuff("Java"));
}
}
}