import java.util.*;
public class multiarray
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int arr [][]=new int [2][3];
System.out.print("enter array element");
for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
	{
		arr[i][j]=sc.nextInt();
		
	}
}
//by using for loop multiArray
/*for(int i=0;i<2;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(arr[i][j]);
		
	}System.out.println();
}*/
//by using for each loop
for(int r[]:arr)
{
	for(int y:r)
	{
		System.out.print(y);
	}System.out.println();
}

}}