package ExercisesOnClasses2;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private static String[] strMonths = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }; // 0-11
    private static String[] strDays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }; // 0-6
    private static int[] daysInMonths = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int year, int month, int day) {
        //isLeapYear(year);
        setDate(year, month, day);
    }
    public static Boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; // A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
    }
    public Boolean isValidDate(int year,int month, int day) {
        Boolean prestupny;
        prestupny = isLeapYear(year); // ?
        if (year >= 1 && year <= 9999) {
            if (month == 1 || month > 2) {
                if (day > daysInMonths[month - 1] || day <= 0) {
                    System.out.println(String.format("Invalid day. Valid day is in range 1 - 30/31, depending on the month. -- %02d/%02d/%4d --",day,month,year));
                    return false;
                } else {
                    return true;
                }
            } else if (month == 2) {
                if (prestupny == false && (day >= 29 || day <= 0)) {
                    System.out.println(String.format("Invalid day. Valid day is in range 1 - 28, it is not leap year. -- %02d/%02d/%4d --",day,month,year));
                    return false;
                } else if ((prestupny == true) && (day > 29)) {
                    System.out.println(String.format("Invalid day. Valid day is in range 1 - 29, it is leap year. -- %02d/%02d/%4d --",day,month,year));
                    return false;
                } else {
                    return true;
                }
            } else {
                System.out.println(String.format("Invalid month. Valid month is in range 1-12. -- %02d/%02d/%4d --",day,month,year));
                return false;
            }
        } else {
            System.out.println(String.format("Invalid year. Valid year is in range 1-9999. -- %02d/%02d/%4d --",day,month,year));
            return false;
        }
        //return false; //
    }
    public int getDayOfWeek(int year, int month, int day) {
        int[] t = new int[] { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (month < 3) {
            year -= 1;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7; // 0 = Sunday
    }
    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println(String.format("Zadano nespravne datum. setDate"));
        }
        //try {
        //    this.year = year;
        //    this.month = month;
        //    this.day = day;
        //}
        //catch (ArgumentOutOfRangeException e) {
        //    System.out.println(String.format(("Invalid year, month, or day!");
        //    throw;
        //}
    }
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public void setYear(int year) {
        if (year > 0 && year < 10000) {
            this.year = year;
        } else {
            System.out.println(String.format("Spatny rok. set"));
        }
    }
    public void setMonth(int month) {
        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            System.out.println(String.format("Spatny mesic. set"));
        }
    }
    public void setDay(int day) {
        int daysInOneMonth = daysInMonths[this.month - 1];
        if (isLeapYear(year) && month == 2) {
            daysInOneMonth += 1;
        }
        else if (day > 0 && day <= daysInOneMonth) {
            this.day = day;
        } else {
            System.out.println(String.format("Spatny den. set"));
        }
    }
    @Override
    public String toString() {
        //return "{strDays[getDayOfWeek(year, month, day)]} {day} {strMonths[month - 1]} {year}";
        return String.format("%9s %02d %2s %4d",strDays[getDayOfWeek(year, month, day)], day, strMonths[month-1], year); // "xxxday d mmm yyyy", e.g., "Tuesday 14 Feb 2012". {day,0:D2} s nulou na zacatku
    }
    public MyDate nextDay() {
        // pokud bude posledni den v mesici tak 1, mesic++, jestli bude mesic 12 tak rok++.
        int day = this.getDay();
        int daysInOneMonth = daysInMonths[this.month - 1];
        if (month == 2 && isLeapYear(year)) {
            daysInOneMonth += 1;
        }
        if (day > 0 && day < daysInOneMonth) {
            this.day = day + 1;
            return this;
        }
        if (day == daysInOneMonth && month == 12) {
            year++;
            month = 1;
            this.day = 1;
            return this;
        }
        if (day == daysInOneMonth && month != 12) {
            month++;
            this.day = 1;
            return this;
        }
        System.out.println(String.format("nextDay bez if"));
        return this;
    }
    public MyDate nextMonth() {
        int day = this.getDay();
        int daysInOneMonth = daysInMonths[this.month - 1];
        if (day == daysInOneMonth) {
            if (month != 12 && daysInMonths[this.month - 1] > daysInMonths[this.month]) {
                this.day = daysInMonths[this.month];
                this.month += 1;
                return this;
            } else {
                month = 1;
                year++;
            }
        } else {
            // neosetreno na 31.1. nextMonth -> 28.2.???
            this.month++;
            return this;
        }
        return this;
    }
    public MyDate nextYear() {
        int day = this.getDay();
        int daysInOneMonth = daysInMonths[this.month - 1];
        if (month == 2 && isLeapYear(this.year)) {
            daysInOneMonth += 1;
        }
        if (isLeapYear(this.year) && month == 2 && day == daysInOneMonth) { // ???
            this.day = 28;
            this.year++;
            return this;
        }
        int year = this.getYear();
        this.setYear(year + 1);
        return this;
    }
    public MyDate previousDay() {
        int day = this.getDay();
        int daysInOneMonth = daysInMonths[this.month - 1];
        if (day > 1 && day <= daysInOneMonth) { // normalni - od 2 do posledniho, jednoduse -1
            this.day--;
            return this;
        }
        if (month == 3 && isLeapYear(year) && day == 1) { // z brezna na unor prestupny
            daysInOneMonth += 1;
            this.day = daysInOneMonth;
            month--;
            return this;
        }
        if (day == 1 && month != 1) { // 1.2.-1.12. -> posl. den v predchozim mesici.
            month--;
            this.day = daysInMonths[this.month - 1];
            return this;
        }
        if (day == 1 && month == 1) { // novy rok z 1.1. na 31.12.
            this.day = daysInMonths[11];
            this.month = 12;
            this.year--;
            return this;
        }
        System.out.println(String.format("previousDay bez if"));
        return this;
        //return new MyDate(year, month, day + 1); // ?? poradil naseptavac
    }
    public MyDate previousMonth() {
        int day = this.getDay();
        int daysInOneMonth = daysInMonths[this.month - 1];
        if (month > 1 && month <= 12) {
            month--;
            this.day = daysInMonths[this.month - 1];
            return this;
        }
        if (month == 1) {
            year--;
            month = 12;
            this.day = daysInMonths[this.month - 1];
            return this;
        }
        if (day == daysInOneMonth) {
            if (month != 1 && daysInMonths[this.month - 1] < daysInMonths[this.month]) {
                this.day = daysInMonths[this.month];
                this.month -= 1;
                return this;
            }
            else {
                month = 12;
                year--;
            }
        }
        else {
            this.month--;
            return this;
        }
        // neosetreno na 31.3. previousMonth -> 28.2.???
        System.out.println(String.format("previousMonth bez if"));
        return this;
    }
    public MyDate previousYear() { // toto se mi uplne nezda
        int day = this.getDay();
        int daysInOneMonth = daysInMonths[this.month - 1];
        if (month == 2 && isLeapYear(this.year)) {
            daysInOneMonth += 1;
        }
        if (isLeapYear(this.year) && month == 2 && day == daysInOneMonth) { // ???
            this.day = 28;
            this.year--;
            return this;
        }
        int year = this.getYear();
        this.setYear(year - 1);
        return this;
    }

}
