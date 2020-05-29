package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;


// A man class created to initialize human objects.
public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Date dateOfBirth;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(String strDate) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = format.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        return dateFormat.format(this.dateOfBirth).toUpperCase();
    }

    public Person(String lastName, String firstName, String patronymic){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Person(String lastName, String firstName, String patronymic, String strDate) {
        this(lastName, firstName, patronymic);
        setDateOfBirth(strDate);
    }

    public int getBornYear(){
        LocalDate localDate = this.dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getYear();
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + getDateOfBirth() +
                "'}";
    }
}