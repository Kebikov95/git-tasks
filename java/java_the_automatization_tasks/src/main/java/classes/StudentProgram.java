package classes;

//  The following methods were used in this class:
//    a) a list of students of a given faculty;
//    b) a list of student for each faculty and course;
//    c) a list of students born after a given year;
//    d) a list of study group.
public class StudentProgram {
    public static void main(String[] args) {
        CreateStudentLibrary studentLibrary = new CreateStudentLibrary();

        studentLibrary.displayAllStudent();
        studentLibrary.displayStudentsByFaculty(Faculty.FAIS);
        studentLibrary.displayStudentsByFacultyAndCourse(Faculty.FAIS, 4);
        studentLibrary.displayStudentsAfterBornYear(2000);
        studentLibrary.displayStudentsByGroup(Group.A1);
    }
}