package account6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Person {
    public String name;
    public Date dateOfBirth;
    //public int age;
    public ArrayList<Account> myAccounts = new ArrayList<Account>();
    public Person() { }
    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public Person(String name, int day, int month, int year) { this (name, new Date(day,month,year));
        //this.name = name;
        //dateOfBirth = new Date(day, month, year);
    }
    //public Person(string name, int day, int month, int year) {
    //    this.name = name;
    //    dateOfBirth = new Date(day, month, year);
    //}
    public int getAge() {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String str = dateOfBirth.year + "-" + String.format("%02d",dateOfBirth.month) + "-" + String.format("%02d",dateOfBirth.day);
        LocalDate birthDay = LocalDate.parse(str,formatter);
        int age;
        //Console.WriteLine(DateTime.Now.CompareTo(birthDay));
        if (LocalDateTime.now().getDayOfYear() < birthDay.getDayOfYear()) {
            age = LocalDateTime.now().getYear() - dateOfBirth.year;
        }
        else {
            age = LocalDateTime.now().getYear() - dateOfBirth.year - 1;
        }
        return age;
    }
    public void writeAccounts() {
        for (Account acc : this.myAccounts) {
            System.out.println("Majitel: " + acc.owner.name + " (" + (LocalDateTime.now().getYear() - acc.owner.dateOfBirth.year) + " let) Ucet: " + acc.getClass().getName() + " Stav uctu: " + acc.balance + ",-");
        }
    }
    @Override
    public String toString() {
        return name + " (" + getAge() + " let) \t Pocet zalozenych uctu: " + myAccounts.size();
    }
}