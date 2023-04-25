package accoun6;

public class Account {
    public int balance;
    public Person owner;
    public Account() { }
    public Account(int amount, Person owner) {
        this.balance = amount;
        this.owner = owner;
        owner.myAccounts.add(this);
    }
    //public Account(int amount, string name, int age) {
    //    age = DateTime.Now.Year - owner.dateOfBirth.year;
    //    this.balance = amount;
    //    this.owner = new Person(name, new Date(1,1,age));
    //    this.owner.myAccounts.Add(this);
    //}
    public void insertInto(int amount) {
        balance += amount; // +vklad -vyber
    }
    public void writeBalance() {
        int age =  - owner.dateOfBirth.year;
        System.out.println("Na uctu od: " + owner.name + " (" + age +  " let) je: " + balance + ",-");
    }
    public void transferTo(Account account, int amount) {
        this.balance -= amount;
        account.balance += amount;
    }
    @Override
    public String toString() {
        return "Jmeno: " + this.owner.name + " (Rok nar. " + this.owner.dateOfBirth.year + " \t Stav uctu: " + balance + ",-";
    }
}