import java.util.Scanner;
public class Polydrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n =sc.nextInt();
int x=n;
int a,c=0;
while(n>0)
{
a=n%10;
//n=n/10;
//c=c+(a*a*a);
c=c*10+a;
n=n/10;
}
if(x==c)
System.out.println(x+"Polydrome no ");
else

System.out.println(x+"this is not Polydrome no ");

}
}