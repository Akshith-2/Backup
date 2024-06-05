import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {

         Bank b=new Bank();
         b.add("Akshith","Savings",35000);

        Bank a=new Bank();
        a.add("Bot","Fd",89000);
        a.withdraw(12000);

        Account c=new Account("Akshith1","Savings",35989);
        c.withdraw(12000,1);
        c.display();


    }

}
class Bank{
    int amount;
    String name,Account_type;

    Bank(){}
    Bank(String n,String A,int a) {
        this.name = n;
        this.Account_type = A;
        this.amount = a;
        int i = 0;
        new Account(n,A,a);
        System.out.println("Account Created Successfully");
    }
    void withdraw(int n){
        if(n>=amount){
            System.out.println("Insuffcient Funds");
        }
        else{
            amount-=n;
            this.amount=amount;
            System.out.println("Withdrawal Successful");
        }

    }
    void add(String n,String A,int a){
        this.name=n;
        this.Account_type=A;
        this.amount=a;
        new Account(name,Account_type,amount);
        System.out.println("Account Added Successfully");
    }

}
class Account extends Bank{
    int amount;
    static ArrayList<String[]> k=new ArrayList<>();;
    String name,Account_type;

    Account(String n,String A,int a){
        this.name=n;
        this.Account_type=A;
        this.amount=a;

        String[] s=new String[3];
        s[0]=n;
        s[1]=A;
        s[2]=""+a;
        k.add(s);
        System.out.println("Account Created Successfully");
    }
    void withdraw(int n,int l){
        if(n>amount){
            System.out.println("Funds Insufficient");
        }
        else {

            String[] a=k.get(l);
            int o=Integer.parseInt(a[2]);
            o-=n;
            a[2]=""+o;
            System.out.println("Withdrawal Successful");
        }
    }
    void display(){
        System.out.println("Details of the Account are:");
        for (String[] m : k) {
            System.out.println(Arrays.toString(m));
        }
    }
}