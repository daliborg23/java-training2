package account6;

public class Main {
    public static void main(String[] args) {
        //Date KarlovoNaroz = new Date(19, 4, 1964);
        //Date PavlovoNaroz = new Date(19,4,1950);
        Person o1 = new Person("Karel", new Date(19, 4, 1964));
        //Person o2 = new Person("Pavel", new Date(19, 4, 1950));
        //Account u1 = new Account(500, "Adam", 30);
        //Account u2 = new Account(300, "Eva", 30);
        //Account u3 = new Account();
        //Account u4 = new Account();
        Account u5 = new Account(100, o1);
        Account u6 = new Account(200, new Person("Pepa", new Date(20, 4, 1988)));
        System.out.println("----------------");
        System.out.println(o1.myAccounts.get(0));
        Account u10 = new Account(200, o1);
        Account u11 = new Account(333, o1);
        System.out.println("Ucet 10: " + u10.balance);
        System.out.println("Ucet 11: " + u11.balance);
        System.out.println("----------------");
        o1.writeAccounts();
        System.out.println("----------------");
        System.out.println(o1.toString());
        System.out.println("----------------");
        u5.writeBalance();
        System.out.println(u5.owner.dateOfBirth.year);
        System.out.println(u6.toString());
        System.out.println("----------------");
        System.out.println(o1.getAge());
        System.out.println(u6.owner.getAge());
        System.out.println("----------------");
        Person o2 = new Person("Kristyna",22,3,2011);
        System.out.println(o2.toString());
        Person o3 = new Person("Alice", 1, 2, 1999);
        System.out.println(o3.toString());
        System.out.println("----------------");
    }
}