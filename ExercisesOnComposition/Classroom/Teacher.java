package Classroom;

public class Teacher {
    private String firstName;
    private String lastName;
    private double age;
    private int salary;
    private int pupilsInClass;

    public Teacher(String firstName, String lastName, double age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = 15000; // zaklad
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public void salaryBonus() {
        salary += (salary * pupilsInClass * 5) / 100;
        System.out.println("Salary Bonus: " + salary);
    }
    @Override
    public String toString() {
        return "| Tridni ucitel: " + this.getFullName() + "                         |\n";
    }
}
