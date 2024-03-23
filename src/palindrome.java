import java.io.InputStream;
import java.util.Scanner;

public class palindrome {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
		
int reversednumber = 0;  //remainder
int temp = num;
int rev = 0;

while (temp>0)
	  rev = num % 10;
reversednumber = reversednumber *10 + rev;
temp = temp/10;
}
if(num==temp)
System.out.println("its a palindrome");

private static Scanner Scanner(InputStream in) {
	// TODO Auto-generated method stub
	return null;
}
}