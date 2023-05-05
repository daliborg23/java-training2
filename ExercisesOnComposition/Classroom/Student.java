package Classroom;

public class Student {
    private String firstName;
    private String lastName;
    private double age;
    private double average;
    //region GETTERANDSETTER
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public double getAverage() {
        return average;
    }
    public void setAverage(double average) {
        this.average = average;
    }
    //endregion
    public Student(String firstName, String lastName, double age, double average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.average = average;
    }
    @Override
    public String toString() {
        return String.format("| Name: %-9s %-8s | Age: %2.0f | Average: %2.2f |",firstName,lastName,age,average); // predelat
    }
    public void zkouska(double znamka) throws SpatnyPrumerException {
        average = (((average + znamka) / 2.00) * 100.00) / 100.00;
        if (average > 4.00) {
            System.out.println(firstName + " " + lastName + " prumer znakem: " + average);
            throw new SpatnyPrumerException("Spatny prumer. ");
        }
    }

}
