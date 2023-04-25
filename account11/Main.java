package account11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Account u1 = new Account();
        Account u2 = new Account();
        u1.balance = 500; // startovne
        int amount = 0;
        Boolean ok;
        System.out.println("Na ucte u1: " + u1.writeBalance() + ",-");
        System.out.println("Na ucte u2: " + u2.writeBalance() + ",-");
        do {
        	System.out.print("Vklad/vyber penez na u1: ");
            amount = Integer.parseInt(new Scanner(System.in).nextLine());
            try {
                u1.insertInto(amount);
                break;
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
            }
        } while (true);
        System.out.println("Zadano: " + amount + ",-");
        System.out.println("Na ucte u1: " + u1.writeBalance() + ",-");
        System.out.println("Na ucte u2: " + u2.writeBalance() + ",-");
        do {
            ok = true;
            System.out.println("Kolik penez chcete poslat z 1. uctu na 2. ucet?");
            amount = Integer.parseInt(new Scanner(System.in).nextLine());
            try {
                u1.transferTo(u2, amount);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                ok = false;
            }
        } while (!ok);
        System.out.println("Na ucte u1: " + u1.writeBalance() + ",-");
        System.out.println("Na ucte u2: " + u2.writeBalance() + ",-");
        
        System.out.println("Na ucte u1: " + u1.writeBalanceInDolars(0)+ "$");
        System.out.println("Na ucte u2: " + u2.writeBalanceInDolarsDouble(0) + "$ (double)");
    }
}
