import java.time.LocalDate;

public class transactionInfo { 
    String transID;
    String senderName;
    String receiverName; 
    float amount;
    String status;
    LocalDate transDate;

    public transactionInfo(String transID, String senderName, String receiverName, 
                           float amount, String status, LocalDate transDate) {
        this.transID = transID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
        this.status = status;
        this.transDate = transDate;
    }

    public void displayDetails() {
        System.out.println("Transaction ID: " + transID);
        System.out.println("Sender's Name: " + senderName);
        System.out.println("Receiver's Name: " + receiverName);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
        System.out.println("Transaction Date: " + transDate);
    }

    public static void main(String[] args) {
        transactionInfo t1 = new transactionInfo("1", "Bcd", "Xyz", 50000, "Success", LocalDate.now());
        t1.displayDetails(); 
    }
}
