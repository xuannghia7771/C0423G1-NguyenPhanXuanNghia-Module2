package ss5_accessmodifier_static_getter_setter.practice.static_method;

public class Student {
    private final int rollno;
    private final String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "Codegym";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }


}
