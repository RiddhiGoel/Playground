import java.util.Scanner;
class Main 
{
	public static void main (String[] args) 
    {
		Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        int first=number/100;
        System.out.println(first);
	}
}