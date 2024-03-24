
public class palindromeString {
public static void main (String[] args) {
	String str = "Anna";
	int strlength = str.length();
	String rev="";
	for (int i= (strlength- 1);i>=0; i--) 
	{
		 rev = rev + str.charAt(i);
	}
	if(str.toUpperCase().equals(rev.toUpperCase())) {
		System.out.println("String is a palindrome");
		System.out.println(rev);
	}
	else
	{
		System.out.println("String is not a palindrome");	
	}
		
}
}
