package mvc.model;

public class Teacher {
    private int id;
    private String name;
    private String date;
    private boolean gender;
    private String role;

    public Teacher() {
    }

    public Teacher(int id, String name, String date, boolean gender, String role) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", role='" + role + '\'' +
                '}';
    }
}
