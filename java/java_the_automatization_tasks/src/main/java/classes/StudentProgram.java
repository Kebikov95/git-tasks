package classes;

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