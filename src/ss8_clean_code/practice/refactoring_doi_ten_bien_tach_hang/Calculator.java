package ss8_clean_code.practice.refactoring_doi_ten_bien_tach_hang;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBSTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int fisrtOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return fisrtOperand + secondOperand;
            case SUBSTRACTION:
                return fisrtOperand - secondOperand;
            case MULTIPLICATION:
                return fisrtOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return fisrtOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}

