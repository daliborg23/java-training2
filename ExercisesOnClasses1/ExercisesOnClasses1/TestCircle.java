package ExercisesOnClasses1;

public class TestCircle {
	public static void main(String[] args) {
		System.out.println("-------------------------------------Circle------------------------------------------");
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
		//System.out.println("The circle has radius of " + String.format("%.2f", c1.getRadius()) + " and area of " + String.format("%.2f", c1.getArea()));
		Circle c2 = new Circle(2.3);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
		//System.out.println("The circle has radius of " + String.format("%.2f", c2.getRadius()) + " and area of " + String.format("%.2f", c2.getArea()));
		
		Circle c3 = new Circle(3.22,"green");
		System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());
		System.out.println("Circle c3 has " + c3.getColor() + " color.");
		
		Circle c4 = new Circle();
		System.out.println("Circle c4 = new Circle();");
		c4.setRadius(4.23);
		System.out.println("c4 radius is: " + c4.getRadius());
		c4.setColor("blue");
		System.out.println("c4 color is: " + c4.getColor());
		
		Circle c5 = new Circle(5.55,"yellow");
		System.out.println(c5);
		System.out.println(c5);
		System.out.println("Operator '+' invokes toString() too " + c5);
		
		System.out.println("--------------------------------------Simplified-Circle-------------------------------");
		SimplifiedCircle sc1 = new SimplifiedCircle();
		SimplifiedCircle sc2 = new SimplifiedCircle(2.34);
		
		System.out.println(sc1);
		System.out.println(sc2);
		
		System.out.println(sc2 + " has Circumference " + sc2.getCircumference() + "cm and Area " + sc2.getArea() + "cm2");
		
		System.out.println("-------------------------------------Rectangle------------------------------------");
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(1.55f,1.79f);
		
		System.out.println("r1 " + r1);
		System.out.println("r2 " + r2);
		
		r1.setLength(2.38f);
		r1.setWidth(2.99f);
		System.out.println("r1 " + r1 + " - Perimeter: " + r1.getPerimeter() + ", Area: " + r1.getArea());
		System.out.println("r2 " + r2 + " - Perimeter: " + r2.getPerimeter() + ", Area: " + r2.getArea());
		
		System.out.println("--------------------------------------Employee-----------------------------------------");
		Employee e1 = new Employee(1,"Jan","Novak",30000);
		System.out.println(e1);
		System.out.println("Annual salary: " + e1.getAnnualSalary());
		System.out.println("Very unexpected salary raise by 15%!");
		e1.raiseSalary(15);
		System.out.println(e1);
		System.out.println("Annual salary: " + e1.getAnnualSalary());
		
		System.out.println("--------------------------------------InvoiceItem-----------------------------------------");
		InvoiceItem i1 = new InvoiceItem("Sroub", "M4x8-8.8", 50, 1.4);
		System.out.println(i1);
        System.out.println("Predmet: " + i1.getID() + ", Popis: " + i1.getDesc() + ", Pocet kusu: " + i1.getQty() + ", Cena/kus: " + i1.getUnitPrice() + ",- | Cena celkem: " + i1.getTotal() + ",-");
        System.out.println("Omyl pri pocitani a zaroven i zdrazime proc ne..");
        i1.setQty(100);i1.setUnitPrice(1.9);
        System.out.println("Predmet: " + i1.getID() + ", Popis: " + i1.getDesc() + ", Pocet kusu: " + i1.getQty() + ", Cena/kus: " + i1.getUnitPrice() + ",- | Cena celkem: " + i1.getTotal() + ",-");
        
        System.out.println("--------------------------------------Account-----------------------------------------");
        Account a1 = new Account("u1","ucet1", 100000);
        Account a2 = new Account("u2", "ucet2", 50000);
        Account a3 = new Account("u3", "ucet3");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1.getID() + " " + a1.getName() + " " + a1.getBalance() + ",-");
        a1.credit(10000);
        System.out.println("Pridan kredit 10000,-");
        System.out.println(a1);
        a1.debit(15000);
        System.out.println("Debit 15000");
        System.out.println(a1);
        System.out.println("Odeslani 20000 z u1 na u3");
        a1.transferTo(a3, 20000);
        System.out.println(a1);
        System.out.println(a3);
        
        System.out.println("--------------------------------------Date-----------------------------------------");
        Date d1 = new Date(4,6,1992);
        System.out.println(d1);
        System.out.println("Den: " + d1.getDay() + " Mesic: " + d1.getMonth() + " Rok: " + d1.getYear());
        System.out.println("Zmena datumu na 08/08/2024 - dohromady");
        d1.setDate(8, 8, 2024);
        System.out.println("Den: " + d1.getDay() + " Mesic: " + d1.getMonth() + " Rok: " + d1.getYear());
        System.out.println("Zmena datumu na 24/12/2024 - zvlast");
        d1.setDay(24); d1.setMonth(12); d1.setYear(2024);
        System.out.println("Den: " + d1.getDay() + " Mesic: " + d1.getMonth() + " Rok: " + d1.getYear());
        
        System.out.println("--------------------------------------Time-----------------------------------------");
        Time t1 = new Time(16,20,00); // s 00 sekundama nejede (pri -1 spocte na 99 [neosetreno])]
        System.out.println(t1);
        System.out.println("Zmena casu na 23:23:23");
        t1.setHour(23);t1.setMinute(23);t1.setSecond(23);
        System.out.println(t1);
        System.out.print("Pridana sekunda ");
        t1.nextSecond();
        System.out.println(t1);
        System.out.print("Odebrana sekunda ");
        t1.previousSecond();
        System.out.println(t1);
        System.out.print("Odebrana sekunda ");
        t1.previousSecond();
        System.out.println(t1);
	}
}
