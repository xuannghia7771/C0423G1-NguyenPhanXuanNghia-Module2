package mvc.repository;

import mvc.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> dislay();

    void addTeacher(Teacher teacher);

    void deleteTeacher(int id);
}
