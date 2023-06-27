package ss19_string_and_regular_expression.exercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
- Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
    x là ký tự số
    Không chứa các ký tự đặc biệt
- Ví dụ:
     - Số điện thoại hợp lệ: (84)-(0978489648)
     - Số điện thoại không hợp lệ: (a8)-(22222222), (84)-(22b22222), (84)-(9978489648)
 */
public class PhoneNumberExample {
    private static final String PHONE_NUMBER_REGEX = "^\\([0-9]{2}\\)\\-\\(0[0-9]{9}\\)";

    public PhoneNumberExample() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
