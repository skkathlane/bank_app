import java.util.Objects;
import java.util.UUID;

public class sbiuser implements Bankinterfaces {
    private String name;
   private String accountNo;
   double balance;
   private String password;
   private double rateOfInterest;


  public sbiuser(String name, double balance, String password ){
        this.name=name;
        this.balance=balance;
        this.password=password;
        this.rateOfInterest=6.5;
        this.accountNo= String.valueOf(UUID.randomUUID());
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
    @Override
    public double checkBalance() {
        return balance ;
    }

    @Override
    public String addMoney(int amount) {
         balance=balance+amount;
         return "Your current balance is:"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enterPassword) {
        if(Objects.equals(password,enterPassword)){
            if(amount>balance){
                return "insufficient balance";
            }
            else{
                balance=balance-amount;
                return "your account has been debited"+amount;
            }
        }
        else{
            return "please enter correct password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*rateOfInterest*years)/100;
    }
}
