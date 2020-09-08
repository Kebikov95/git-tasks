package classes;

public enum Group {
    A1(Faculty.MTF), A2(Faculty.MTF), B1(Faculty.FAIS), B2(Faculty.FAIS), C1(Faculty.EF), C2(Faculty.EF);

    private Faculty faculty;

    Group(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}