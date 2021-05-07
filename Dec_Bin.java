import java.util.Scanner;
public class Dec_Bin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int binary[]=new int[20];
int index=0;
//int n =10;
while(n>0)
{
	
binary [index++]=n%2;
n=n/2;
}
	for(int i=index;i>=0;i--)
	{
		System.out.print(binary[i]);
	}
	}
	
	
	
}