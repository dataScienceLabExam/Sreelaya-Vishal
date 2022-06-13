package q1;
import java.util.Scanner;

public class exep4{
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		int balance=s.nextInt();
		System.out.println("Enter the amount to be withdrawed");
		int t=s.nextInt();
		
		
			try{
				
				if(t<balance){
					
					throw new UserDefinedException("amount withdrawed");
				}
				else{
					throw new UserDefinedException("Not Sufficient Fund Exception");
				}
			}catch(UserDefinedException e){
				System.out.println(e.getMessage());
			}
		
		
		
	}
}

class UserDefinedException extends Exception{
	UserDefinedException(String msg){
		super(msg);
	}
}
