package ss17_io_binary_file_serialization.practice.read_and_write_studentlist;
import java.io.*;
import java.util.*;
public class Main {
    private final static String WRITING_PATH = "src/ss17_io_binary_file_serialization/practice/read_and_write_studentlist/student.txt";
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        }catch(Exception ex){
            System.err.println("File Không có nội dung để đọc!");
        }

        return students;
    }
    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
//        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
//        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
//        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
//        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
//        writeDataToFile(WRITING_PATH, students);
        List<Student> studentDataFromFile = readDataFromFile(WRITING_PATH);
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
