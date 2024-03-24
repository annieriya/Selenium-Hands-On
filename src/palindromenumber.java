
public class palindromenumber {
public static void main(String[] args) {
	int r ,temp,reverse=0;
	int n=4545;
	temp=n;
	while(n>0)
	{
		r = n%10;
		reverse = (reverse* 10) + r ;
		n = n/10;
	}
		if(temp == reverse) 
		{
			System.out.println("Number is a palindrome");
		}else 
				System.out.println("Number is not a palindrome");
	
}

}
