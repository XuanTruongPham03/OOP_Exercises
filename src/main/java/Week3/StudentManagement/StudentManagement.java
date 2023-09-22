package Week3.StudentManagement;

import java.util.ArrayList;

public class StudentManagement {
    private Student[] students;
    private int cnt;

    /**
     * Constructor for StudentManagement.
     */
    public StudentManagement() {
        students = new Student[100];
        cnt = 0;
    }

    /**
     * Method add new Student.
     *
     * @param newStudent new Student who need added.
     */
    public void addStudent(Student newStudent) {
        if (cnt < students.length) {
            students[cnt] = newStudent;
            cnt++;
        } else {
            return;
        }
    }

    /**
     * Method compare two Students if they're in the same Group.
     *
     * @param s1 The first Student.
     * @param s2 The second Student.
     * @return True if both in one Group, otherwise return False.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Method print List of Students by Group.
     *
     * @return List of Students.
     */
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();

        ArrayList<String> uniqueGroups = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            String className = students[i].getGroup();
            if (!uniqueGroups.contains(className)) {
                uniqueGroups.add(className);
            }
        }

        for (String className : uniqueGroups) {
            result.append(className).append("\n");
            for (int i = 0; i < cnt; i++) {
                if (students[i].getGroup().equals(className)) {
                    result.append(students[i].getInfo()).append("\n");
                }
            }
        }

        return result.toString();
    }

    /**
     * Method remove Student by ID.
     *
     * @param id Student"s ID.
     */
    public void removeStudent(String id) {
        for (int i = 0; i < cnt; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < cnt - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[cnt - 1] = null;
                cnt--;
                break;
            }
        }
    }
}