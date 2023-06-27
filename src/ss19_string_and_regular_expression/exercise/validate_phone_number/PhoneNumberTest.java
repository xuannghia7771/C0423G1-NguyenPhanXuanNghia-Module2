package ss19_string_and_regular_expression.exercise.validate_phone_number;

import ss19_string_and_regular_expression.exercise.validate_class_name.ClassNameExample;

public class PhoneNumberTest {
    private static PhoneNumberExample phoneNumberExample;

    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)", "(12)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String args[]) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : validPhoneNumber) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone Number " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone Number " + phoneNumber + " is valid: " + isValid);
        }
    }
}
