import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name balance password to create an account");
        String name = sc.next();
        double balance=sc.nextDouble();
        String password=sc.next();
        sbiuser user=new sbiuser(name,balance,password);
        String message=user.addMoney(0);
        System.out.println("your account no is: "+user.getAccountNo());
        System.out.println(message);
        System.out.println("Please enter amount that you to withdraw");
        int money=sc.nextInt();
        System.out.println("Please enter your password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));
        System.out.println("Your current balance is "+user.balance);
        System.out.println(user.calculateInterest(10));
    }
}