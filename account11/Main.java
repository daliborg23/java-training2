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
        Scanner sc = new Scanner(System.in);
        do {
        	System.out.print("Vklad/vyber penez na u1: ");
            amount = Integer.parseInt(sc.nextLine());
            try {
                u1.insertInto(amount);
                break;
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
            }
            catch (IllegalArgumentException e)
    		{
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
            amount = Integer.parseInt(sc.nextLine());
            try {
                u1.transferTo(u2, amount);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                ok = false;
            }
        } while (!ok);
        sc.close();
        System.out.println("Na ucte u1: " + u1.writeBalance() + ",-");
        System.out.println("Na ucte u2: " + u2.writeBalance() + ",-");
        System.out.println("-----------");
        int[] poleKurzuInt = new int[] { 19, 20, 21, 22, 23, 35, 0, -10 };
        Double[] poleKurzuDouble = new Double[] { 19.99, 20.99, 21.23, 22.44, 23.77, 35.66, 0.00, -10.33 };
        
        for (int n : poleKurzuInt) {
        	System.out.println("Na ucte u1: " + u1.writeBalanceInDolars(n) + "$");
        }
        System.out.println("-----------");
        for (Double n : poleKurzuDouble) {
        	System.out.println("Na ucte u2: " + String.format("%.2f", u2.writeBalanceInDolarsDouble(n)) + "$ (double)");
        }
    }
}
