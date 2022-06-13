package q1;
import java.util.Scanner;

public class shapes {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the height");
		int a=s.nextInt();
		s.nextLine();
		System.out.println("Enter the length");
		int b=s.nextInt();
		s.nextLine();
		System.out.println("Enter the breadth");
		int c=s.nextInt();
		s.nextLine();
		s.close();
		box3d t1 = new box3d(a,b,c);
		t1.volume();
		t1.Area();
	}
}
class box{
	
	int height,length;
	box(int a,int b){	
		this.height=a;
	
		this.length=b;
		
	}
}

class box3d extends box{
	int breadth;
	
	box3d(int c ,int a, int b){
			super(a,b);
			this.breadth=c;
	}
			 public void Area()
			    {
			        System.out.println("Area of the box "  + (6*length*breadth) );
			    }
			   
			  public void volume()
			    {
			        System.out.println("volume of the box  " +(2*height*length*breadth) );
			    }
	}


