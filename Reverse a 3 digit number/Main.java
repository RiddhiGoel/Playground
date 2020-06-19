import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int number=in.nextInt();
    int n1=number/100;
    int n2=(number/10)%10;
    int n3=number%10;
    int finish=n3*100+n2*10+n1;
    System.out.println(finish);  
  }
}