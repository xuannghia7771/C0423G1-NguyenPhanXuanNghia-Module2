package mvc_management_people.repository;

import mvc_management_people.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(1, "TrungTH", "20/01/1999", true, "Tutor"));
        teacherList.add(new Teacher(2, "ChánhTV", "21/02/1992", true, "Instructor"));
        teacherList.add(new Teacher(3, "HảiTT", "22/03/1997", true, "Coach"));
    }

    @Override
    public List<Teacher> dislay() {
        return teacherList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void deleteTeacher(int id) {
        teacherList.remove(id);
    }
}
