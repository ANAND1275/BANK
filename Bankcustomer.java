public class Bankcustomer {
    String custname;
    int accNo;
    int custAge;

    public Bankcustomer(String custname, int accNo, int custAge) {
        this.custname = custname;
        this.accNo = accNo;
        this.custAge = custAge;
    }

    public void DisplayDetails() { 
        System.out.println("Name of the customer: " + custname);
        System.out.println("Account Number : " + accNo); 
        System.out.println("Age of customer: " + custAge);
    }

    public static void main(String[] args) {
        Bankcustomer B = new Bankcustomer("Anand", 123456789, 25);
        B.DisplayDetails();
    }
}
