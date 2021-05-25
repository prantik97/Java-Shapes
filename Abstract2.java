abstract class Account{
    public long account_number;
    public String name;
    public int balance;
    abstract int showBalance();
    public void show(){
        System.out.println("Account Number: "+account_number);
        System.out.println("Account Holder: "+name);
    }
}
class SavingsAccount extends Account{
    public int interest;
    SavingsAccount(int balance,int interest,long account_number,String name){
        this.balance=balance;
        this.interest=interest;
        this.account_number=account_number;
        this.name=name;

    }

    @Override
    int showBalance() {
        System.out.print("Account balance :");
        return balance;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Account type: Savings Account");
        System.out.println("Interest rate(%) : "+ this.interest);
    }
}
class FixedAccount extends Account{
    public int interest;
    public int duration;
    FixedAccount(int interest,int duration,int balance,long account_number,String name){
        this.interest=interest;
        this.duration=duration;
        this.balance=balance;
        this.account_number=account_number;
        this.name=name;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Account type : Fixed Deposit");
        System.out.println("Interest rate(%) : "+ this.interest);
        System.out.println("Time duration(year) : "+ this.duration);

    }

    @Override
    int showBalance() {
        System.out.print("Account balance :");
        return balance;
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(12000,8,123456789,"Prantik Ghosh");
        savings.show();
        System.out.println(savings.showBalance());
        System.out.println("\n");
        FixedAccount fixed= new FixedAccount(9,12,120000,987654321,"Sumit Ghosh");
        fixed.show();
        System.out.println(fixed.showBalance());

    }
}
