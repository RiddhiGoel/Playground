import java.util.Scanner;
class Main 
{
	public static void main (String[] args) 
    {
		Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        int secondlast=(number%100)/10;
        System.out.println(secondlast);
	}
}