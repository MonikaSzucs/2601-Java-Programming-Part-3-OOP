import java.util.ArrayList;
import java.util.List;

abstract class School {
    final String student;

    School(final String student) {
        this.student = student;
    }

    public void register(final Student student) {
        List<Student> students;
        students = new ArrayList<>();

        students.add(student);
    }
}
