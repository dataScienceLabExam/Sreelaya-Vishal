package arithmetic;
import java.util.Scanner;
import arithmetic.operations;
public class test 
{
	public static void main(String[] args)
	{
		operations fr=new operations();
		int ch;
		do
		{
			System.out.println("1.SUBTRACTION");
			System.out.println("2.ADDITION");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			     System.out.println("Enter the first number:");
			     float x=sc.nextInt();
			     System.out.println("Enter the second number:");
			     float y=sc.nextInt();
			     fr.subtract(x,y);
			     break;
			case 2:
				 System.out.println("Enter the first number:");
			     float a=sc.nextInt();
			     System.out.println("Enter the second number:");
			     float b=sc.nextInt();
			     fr.add(a,b);

				break;
			case 3:
				 System.out.println("Enter the first number:");
			     float m=sc.nextInt();
			     System.out.println("Enter the second number:");
			     float n=sc.nextInt();
			     fr.multiply(m,n);
			     break;

			case 4:
				 System.out.println("Enter the first number:");
			     float p=sc.nextInt();
			     System.out.println("Enter the second number:");
			     float q=sc.nextInt();
			     fr.division(p,q);
;
			}
		}while(ch>4);
		
	}

}
