package ss5_accessmodifier_static_getter_setter.exercise.student;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {

    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                "', classes='" + classes + "'" +
                '}';
    }
}
