
import java.util.Date;
import java.util.Objects;

public class Person {


    private String ssn;
    private Date dateOfBirth;
    private String firstName;
    private String lastName;
    private Double heightIn;
    private Double weightLb;

    public Person(final String ssn, final Date dateOfBirth, final String firstName,
                  final String lastName, final Double heightIn, final Double weightLb) {
        this.ssn = ssn;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightIn = heightIn;
        this.weightLb = weightLb;
    }

    public String getSSN() {
        return ssn;
    }

    public Date getDOB() {
        return dateOfBirth;
    }

    public String getFN() {
        return firstName;
    }

    public String getLN() {
        return lastName;
    }

    public Double getHeight() {
        return heightIn;
    }

    public Double getWeight() {
        return weightLb;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return Objects.equals(ssn, person.ssn) && Objects
                .equals(dateOfBirth, person.dateOfBirth) && Objects
                .equals(firstName, person.firstName) && Objects
                .equals(lastName, person.lastName) && Objects
                .equals(heightIn, person.heightIn) && Objects
                .equals(weightLb, person.weightLb);
    }





}