package ss19_string_and_regular_expression.exercise.validate_class_name;

public class ClassNameTest {
    private static ClassNameExample classNameExample;

    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String args[]) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class Name " + className + " is valid: " + isValid);
        }
        for (String className : invalidClassName) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class Name " + className + " is valid: " + isValid);
        }
    }
}
