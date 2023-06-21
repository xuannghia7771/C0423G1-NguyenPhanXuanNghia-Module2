package mvc_management_people.repository;

import mvc_management_people.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> dislay();

    void addTeacher(Teacher teacher);

    void deleteTeacher(int id);
}
