import java.util.*;

 class Area_peri
{
	public static void main(String args[])
	{

float area=0;
float peri=0;
System.out.print("enter radius");
Scanner sc= new Scanner(System.in);
double r = sc.nextDouble();

area += Math.PI*r*r;
peri +=2*Math.PI*r;
System.out.println("area is"+ area );
System.out.print("peri is"+ peri );
	}
}