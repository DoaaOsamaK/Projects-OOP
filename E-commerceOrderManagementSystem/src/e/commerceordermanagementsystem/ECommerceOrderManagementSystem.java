
package e.commerceordermanagementsystem;

   // Abstract class Payment
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

// Class for CreditCard Payment
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Class for PayPal Payment
class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Interface for Discount Strategy
interface DiscountStrategy {
    double applyDiscount(double price);
}

// Concrete Discount Strategy for Electronics
class ElectronicsDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.90; // 10% off
    }
}

// Class for Product
class Product {
    private String name;
    private double price;
    private DiscountStrategy discountStrategy;

    public Product(String name, double price, DiscountStrategy discountStrategy) {
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public double getPrice() {
        return discountStrategy.applyDiscount(price);
    }

    public String getName() {
        return name;
    }
}

// Class for Customer
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class for Order
class Order {
    private Product product;
    private Customer customer;

    public Order(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
    }

    public void placeOrder() {
        System.out.println("Order placed by " + customer.getName() + " for " + product.getName());
    }
}

// Main class to demonstrate
public class ECommerceOrderManagementSystem {
    public static void main(String[] args) {
        DiscountStrategy electronicsDiscount = new ElectronicsDiscount();
        Product laptop = new Product("Laptop", 1000, electronicsDiscount);
        Customer customer = new Customer("John Doe");

        Order order = new Order(laptop, customer);
        order.placeOrder();

        Payment payment = new CreditCardPayment(laptop.getPrice(), "1234-5678-9876-5432");
        payment.processPayment();
    }
}

    
