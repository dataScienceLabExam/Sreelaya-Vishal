package graphics;
interface shapes
{
	void rectangle(float x,float y);
	void triangle(float b,float h);
	void square(float a);
	void circle(float r);
}
public class figures implements shapes
{
public void rectangle(float x,float y)
{
	System.out.println("area of rectangle="+x*y);
}
public void triangle(float b,float h)
{
	System.out.println("area of triangle="+((b*h)/2));
}
public void square(float a)
{
	System.out.println("area of square="+a*a);
}
public void circle(float r)
{
	System.out.println("area of circle="+3.14*r*r);
}
}
