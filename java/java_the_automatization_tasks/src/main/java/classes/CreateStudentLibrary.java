package classes;

import java.util.ArrayList;

public class CreateStudentLibrary {
    private Student[] students;

    public CreateStudentLibrary() {
        this.students = new Student[]{
                new Student(new Person("Ridkin", "Ivan", "Nikolaevich",
                        "22/02/2000"), "Novobelica 3/12", "+375259331233",
                        Faculty.FAIS, 4, Group.B1),
                new Student(new Person("Fedorov", "Nikolay", "Alexeevich",
                        "03/08/2001"), "Zukova 16/2", "+375292134123",
                        Faculty.FAIS, 5, Group.B1),
                new Student(new Person("Mecheev", "Victor", "Evgenievich",
                        "01/02/2000"), "Ermolenko 19/2", "+375339082731",
                        Faculty.FAIS, 3, Group.B2),
                new Student(new Person("Nechiferov", "Valeriy", "Alexandrovich",
                        "23/05/2001"), "Pobedi 1/9", "+375293231231",
                        Faculty.MTF, 1, Group.A1),
                new Student(new Person("Zinlov", "Vasily", "Maximovich",
                        "13/08/2000"), "Zukova 6/2", "+375292134213",
                        Faculty.MTF, 2, Group.A1),
                new Student(new Person("Karimov", "Alexey", "Denisovich",
                        "27/11/2000"), "Pobedi 24/5", "+375339831712",
                        Faculty.MTF, 5, Group.A1),
                new Student(new Person("Tinkov", "Roman", "Kirillovich",
                        "12/01/2001"), "Pobedi 34/5", "+375338973221",
                        Faculty.MTF, 4, Group.A2),
                new Student(new Person("Varlamov", "Fedor", "Sergeevich",
                        "30/05/2000"), "Fadeeva 24/2", "+375331129732",
                        Faculty.MTF, 3, Group.A2),
                new Student(new Person("Fetisov", "Mark", "Andreevich",
                        "10/05/2000"), "Mira 1/5", "+375335762111",
                        Faculty.EF, 4, Group.C1),
                new Student(new Person("Lemonov", "Artem", "Leonidovich",
                        "30/08/2001"), "Pobedi 12/3", "+375297873212",
                        Faculty.EF, 5, Group.C1),
                new Student(new Person("Tikhonov", "Amdrey", "Fedorovich",
                        "25/09/2001"), "Kozeya 98/123", "+375293762231",
                        Faculty.EF, 3, Group.C2),
                new Student(new Person("Egorov", "Maxim", "Nikolaevich",
                        "29/12/2001"), "Pobedi 12/1", "+375335478585",
                        Faculty.EF, 4, Group.C1)
        };
    }

    public CreateStudentLibrary(Student[] students) {
        this.students = students;
    }

    public void displayStudentsByFaculty(Faculty faculty) {
        ArrayList<Student> studentByFaculty = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            if (students[i].faculty == faculty) {
                studentByFaculty.add(students[i]);
            }
        }

        System.out.println("\nThe students by faculty='" + faculty + "':");
        for (Student student : studentByFaculty) {
            System.out.println(student);
        }
    }

    public void displayStudentsByFacultyAndCourse(Faculty faculty, int course) {
        ArrayList<Student> studentByFacultyAndCourse = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            if (students[i].faculty == faculty && students[i].course == course) {
                studentByFacultyAndCourse.add(students[i]);
            }
        }

        System.out.println("\nThe students by faculty='" + faculty +
                "' and course='" + course + "':");
        for (Student student : studentByFacultyAndCourse) {
            System.out.println(student);
        }
    }

    public void displayStudentsAfterBornYear(int year) {
        ArrayList<Student> studentByBornYear = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            if (students[i].person.getBornYear() > year) {
                studentByBornYear.add(students[i]);
            }
        }

        System.out.printf("\nThe students born after year='%d':\n", year);
        for (Student student : studentByBornYear) {
            System.out.println(student);
        }
    }

    public void displayStudentsByGroup(Group group) {
        ArrayList<Student> studentByBornYear = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            if (students[i].group == group && students[i].faculty == group.getFaculty()) {
                studentByBornYear.add(students[i]);
            }
        }

        System.out.println("\nThe students by group='" + group + "':");
        for (Student student : studentByBornYear) {
            System.out.println(student);
        }
    }

    public void displayAllStudent() {
        System.out.println("Display all students:");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}