package ss5_accessmodifier_static_getter_setter.exercise.student;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.toString());

        s.setName("Nghia");
        s.setClasses("C04");
        System.out.println(s.toString());
    }
}
