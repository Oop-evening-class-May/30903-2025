package prince;

public class person{

private String name;
private String city;
private int age;
private double height;
private static int totalPeople;
public person(String name, String city, int age, double height) {
this.name = name;
this.city = city;
this.age = age;
this.height = height;

totalPeople++;
}


public void displayinfo() {
System.out.println(" name :  "+this.name);
System.out.println(" city :  "+this.city);
System.out.println(" age :  "+this.age);
System.out.println(" height :  "+this.height+" m");

}
public void heightnew( double h) {
double oldheight = this.height;
this.height = h;
System.out.println("\n[UPDATE] "+this.name+
"'s height has changed from "+oldheight+" to "+this.height);

}
public void havebirthday() {
this.age +=1;
System.out.println(" happy birth day "+ this.name+" you are now "+ this.age);
}
public static void showtotalpeople() {
System.out.println(" \ntotal number of people created : "+ totalPeople);
}
public static void main() {
person p1 = new person("eric","kigali",21,1.75);
person p2 = new person("mugisha","MUSANZE",23,1.76);
p1.displayinfo();
p1.heightnew(1.78);
p1.havebirthday();
p2.displayinfo();
p2.heightnew(1.77);
p2.havebirthday();
System.out.println("\n--- Create 5 more people ---");
for (int i = 1; i<=5; i++) {
person temp = new person("person "+i," city "+1,21,1.75);
if (i == 1) {
temp.displayinfo();
System.out.println(" ...(4 more people)...");

}
}
person.showtotalpeople();

}
}
