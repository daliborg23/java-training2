package ExercisesOnClasses2;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("-----------------------MyDate-----------------------");
        System.out.println("------------------------Test------------------------");
        MyDate mdTest = new MyDate(2012, 2, 29);
        System.out.println(mdTest);
        System.out.println(mdTest.nextYear());
        System.out.print(mdTest.getDayOfWeek(2023, 4, 19));
        System.out.println(" = 3");
        System.out.println(mdTest);
        System.out.println("Zmena dne na 31. (ve 2. mesici neni)");
        mdTest.setDay(31);
        System.out.println(mdTest);
        System.out.println("Zmena dne na 28. (ve 2. mesici je)");
        mdTest.setDay(28);
        System.out.println(mdTest);
        //region DoKonceSichty
        LocalDateTime casTed = LocalDateTime.now();
        LocalDateTime fajront = LocalDateTime.parse("2023-05-02T22:00:00"); // jede pouze s dnesnim datumem
        Duration duration = Duration.between(casTed, fajront);
        System.out.println(casTed.toLocalTime() + " " + fajront.toLocalTime() + " -> Do Konce sichty zbyva: " + duration.getSeconds() + "sekund"); // duration..toSeconds()
        //endregion
        MyDate mdTest1 = new MyDate(2012, 2, 28);
        System.out.println(mdTest1);
        System.out.println(mdTest1.nextDay());
        System.out.println(mdTest1.nextDay());
        System.out.println(mdTest1.nextMonth());
        System.out.println(mdTest1.nextYear());
        System.out.println();
        MyDate mdTest2 = new MyDate(2012, 1, 2);
        System.out.println(mdTest2);
        System.out.println(mdTest2.previousDay());
        System.out.println(mdTest2.previousDay());
        System.out.println(mdTest2.previousMonth());
        System.out.println(mdTest2.previousYear());
        System.out.println();
        MyDate mdTest3 = new MyDate(2012, 2, 29);
        System.out.println(mdTest3.previousYear());
        System.out.println();
        MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
        MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
        System.out.println();
        char YesNo;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Loop through dates from 28/12/2011 to 2/3/2012? y/n");
            YesNo = sc.next().charAt(0);
        } while (YesNo != 'y' && YesNo != 'n');
        if (YesNo == 'y') {
            MyDate mdOd = new MyDate(2011, 12, 27);
            MyDate mdDo = new MyDate(2012, 3, 2);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println(sdf.parse(mdOd.getYear()+"/"+ mdOd.getMonth()+"/"+mdOd.getDay()).before(sdf.parse(mdDo.getYear()+"/"+ mdDo.getMonth()+"/"+ mdOd.getDay())));
            int vysl = 1;
            do {
                System.out.println(mdOd.nextDay());
                vysl = CharSequence.compare(mdOd.toString(), mdDo.toString()); // asi neni nejidealnejsi

            } while (vysl != 0); //mozna porovnat dohromady rok, mesic a den
        } else {
            System.out.println("Tak treba jindy.");
        }
        ////////////////////////////////////////////////////////////////
    }
}