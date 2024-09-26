
package hotelbookingsystem;

import java.util.Date;

public class Payments {
    
  private String paymentId;
    private double amount;
    private Date paymentDate;
    private String paymentMethod; // e.g., Credit Card, Cash

    // Constructor for Payment.
    public Payments(String paymentId, double amount, Date paymentDate, String paymentMethod) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    // Getter and setter methods for Payment-specific attributes.
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Process the payment.
    public void processPayment() {
        System.out.println("Processing payment of " + amount + " using " + paymentMethod);
        System.out.println("Payment successful. Payment ID: " + paymentId);
    }
}  
