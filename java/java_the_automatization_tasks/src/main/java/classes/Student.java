package classes;

public class Student {
    static int counter = 0;
    private long id;
    Person person;
    private String address;
    private String phoneNumber;
    Faculty faculty;
    int course;
    Group group;

    public Student(Person person, String address, String phoneNumber, Faculty faculty, int course, Group group) {
        this.id = counter++;
        this.person = person;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(Person person, Faculty faculty, int course, Group group) {
        this.id = counter++;
        this.person = person;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", person" + person +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty=" + faculty +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}