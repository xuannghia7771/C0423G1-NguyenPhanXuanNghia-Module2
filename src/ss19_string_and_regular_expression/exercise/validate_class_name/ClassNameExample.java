package ss19_string_and_regular_expression.exercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
- Tên một lớp học hợp lệ cần đạt các yêu cầu sau:
    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
    Không chứa các ký tự đặc biệt
    Theo sau ký tự bắt đầu là 4 ký tự số
    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K
- Ví dụ:
     - Tên lớp hợp lệ: C0223G, A0323K
     - Tên lớp không hợp lệ: M0318G, P0323A
 */
public class ClassNameExample {
    private static final String CLASS_NAME_REGEX = "^(C|A|P)\\d{4}(G|H|I|K)$";

    public ClassNameExample() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
