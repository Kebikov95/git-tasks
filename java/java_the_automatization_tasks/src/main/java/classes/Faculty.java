package classes;

public enum Faculty {
    MTF("mtf"), FAIS("fais"), EF("ef");

    private String faculty;

    Faculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }
}