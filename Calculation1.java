
 class Calculation1
{

public static void main (String args[])
{

int m,n,add,sub,mul,opt;
Scanner s= new Scanner (System.in);
System.out.print("enter first num");
a = s.nextInt();
System.out.print("enter second num");
b = s.nextInt();
while(true)
{
System.out.println("enter 1 for add");
System.out.println("enter 2 for sub");
System.out.println("enter 3 for mul");
System.out.println("enter 4for division");
System.out.println("enter 5 exit");
opt=s.nextInt();
switch(opt)
{

case 1:
add = m+n;
System.out.println(add);

break;
case 2:
sub= m-n;
System.out.println(sub);

break;case 3:
mul = m*n;
System.out.println(mul);

break;case 4:
div = (double)m/n;
System.out.println(div);

break;
case 5:

System.exit(0);

}



}

}





}











