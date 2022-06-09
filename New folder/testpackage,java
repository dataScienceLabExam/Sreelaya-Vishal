package graphics;
import java.util.Scanner;
import graphics.figures;
public class testpackage 
{
	public static void main(String[] args)
	{
		figures fr=new figures();
		int ch;
		do
		{
			System.out.println("1.AREA OF RECTANGLE");
			System.out.println("2.AREA OF TRIANGLE");
			System.out.println("3.AREA OF SQUARE");
			System.out.println("4.AREA OF CIRCLE");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			     System.out.println("Enter the length:");
			     float x=sc.nextInt();
			     System.out.println("Enter the breadth:");
			     float y=sc.nextInt();
			     fr.rectangle(x,y);
			     break;
			case 2:
				System.out.println("Enter the base:");
				float b=sc.nextInt();
				System.out.println("Enter the height:");
				float h=sc.nextInt();
				fr.triangle(b,h);
				break;
			case 3:
				System.out.println("Enter the side of the square:");
		        float a=sc.nextInt();
				fr.square(a);
				break;
			case 4:
	            System.out.println("Enter the radius of the circle:");
				float r=sc.nextInt();
				fr.circle(r);
				break;
			}
		}while(ch>4);
		
	}

}
