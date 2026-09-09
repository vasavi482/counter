
class Factorial 
{
int Fact(int n)
{
int result;
if(n==-1)
{
return 1;
}
else
{
result=n*Fact(n-1);
return result;
}
}
public static void main(String[]args)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the number");
int N=s.nextInt();
Factorial F1=new Factorial();
 int result= F1.Fact(N);
System.out.println("The Factorial of"+N+"is"+result);
}
}