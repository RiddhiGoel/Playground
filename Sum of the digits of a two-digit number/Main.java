import java.util.Scanner;
class Main 
{
	public static void main (String[] args) 
    {
		Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int n1=number/10;
        int n2=number%10;
        int sum=n1+n2;
        System.out.println(sum);
	}
}