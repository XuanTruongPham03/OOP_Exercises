package Week4.StudentManagement;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor 1.
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     *
     * @param name Student's Name.
     * @param id Student's Id.
     * @param email Student's Email.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        group = "K62CB";
        this.email = email;
    }

    /**
     * Constructor 3.
     *
     * @param s Student's info.
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Constructor 4.
     *
     * @param name Student's name.
     * @param id Student's id.
     * @param group Student's group.
     * @param email Student's email.
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}
