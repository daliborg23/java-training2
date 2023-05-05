package Classroom;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Classroom c1 = new Classroom(10);
        Teacher t1 = new Teacher("Igor","Hnizdo",40);
        Teacher t2 = new Teacher("Tomas","Majer",40);
        c1.addTeacher(t1);
        System.out.println(t1.toString());
        c1.addTeacher(t2);
        c1.removeTeacher(t1);
        c1.addTeacher(t2);
        System.out.println(t2.toString());

        Student s1 = new Student("Jasmine","Jimenez", 22,4.49);
        Student s2 = new Student("Artturi","Birgitta", 23,2.11);
        Student s3 = new Student("Saiful","Fareeha", 24,1.29);
        Student s4 = new Student("Stu","Nastasya", 22,3.33);
        Student s5 = new Student("Cornell","Thomas", 25,1.01);
        Student s6 = new Student("Kyle","Waters", 20,3.89);
        Student s7 = new Student("Hassan","Brady", 20,3.89);
        Student s8 = new Student("Chung","Potts", 20,3.89);
        Student s9 = new Student("Alec","Gallegos", 20,3.89);
        Student s10 = new Student("Kate","Mullins", 20,3.89);
        Student s11 = new Student("Alvaro","Finley", 20,4.89);

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        c1.addStudent(s5);
        c1.addStudent(s6);
        c1.addStudent(s7);
        c1.addStudent(s8);
        c1.addStudent(s9);
        c1.addStudent(s10);
        c1.addStudent(s11);
        c1.removeStudent(s10);
        c1.addStudent(s11);

        // vypis vyplaty zaklad a pak s premiame za zaky
        //System.out.println(t1.Salary);
        //t1.salaryBonus();

        System.out.println(c1.toString());

        //System.out.println(c1.Teacher.FullName()); // tridni ucitel
        //System.out.println(c1.Teacher.FirstName + " " + c1.Teacher.LastName);

        //System.out.println(c1.Students[2].ToString()); // treti zak
        //System.out.println(c1.Students[2].FirstName + " " + c1.Students[2].LastName);

        // zkouska // nahodne znamky
        Random random = new Random();
        double[] poleZnamek = new double[c1.getCurrentNumberOfStudents()];
        //double[] poleZnamek = new double[]{1,1,1,1,1,1,1,1,1,5}; // test
        for (int i = 0; i < 10; i++) {
            poleZnamek[i] = random.nextInt(1,6);
        }
        int ii = 0; String s = "";
        for (double d : poleZnamek) {
            s += String.format("%1.0f",d) + ", ";

        }
        System.out.println("Znamky z testu: " + s);

        do {
            try {
                if (c1.getStudents().length == ii) throw new ArrayIndexOutOfBoundsException();
                if (c1.getStudents()[ii] == null) throw new NullPointerException();
                c1.getStudents()[ii].zkouska(poleZnamek[ii]); // nezachyti se mi vyjimka???
            }
            catch (ArrayIndexOutOfBoundsException e) { // konec pole
                break;
            }
            catch (NullPointerException e) {
                System.out.println("A je po zkousce. Ve tride je momentalne nejake misto. ");
                System.out.println("Pocet volnych mist: " + (c1.getStudents().length - c1.getCurrentNumberOfStudents()));
                break;
            }
            catch (SpatnyPrumerException e) {
                System.out.println(e.getMessage() + "Vyhodit ze tridy? y/n");
                Scanner sc = new Scanner(System.in);
                char YesNo = sc.next().charAt(0);
                if (YesNo == 'y') {
                    System.out.println(c1.getStudents()[ii].getFirstName() + " " + c1.getStudents()[ii].getLastName() + " je nejslabsi a dostava padaka.");
                    c1.removeStudent(c1.getStudents()[ii]);
                } else {
                    System.out.println("Tak ale musi zabrat, uvidime po dalsi zkousce.");
                }
                if (ii == c1.getStudents().length-1) {
                    ii--;
                }
                //throw;
            }
            ii++;
        } while (c1.getStudents()[ii-1] != null || c1.getStudents().length != ii);
        System.out.println(c1.toString());
    }
}
