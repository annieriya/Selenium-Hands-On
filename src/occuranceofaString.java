
public class occuranceofaString {
public static void main (String[] args) {
	String s = "Your grace is sufficient for me";
	int totalcount= s.length();
	System.out.println(totalcount);
	String totalcountremovespace = s.replaceAll(" ", "");
	System.out.println(totalcountremovespace);
	String totalcountremovea= totalcountremovespace.replaceAll("a", "");
	System.out.println("No.of characters in the String without a : " + totalcountremovea.length());
	int totalcountofa=totalcountremovespace.length() - totalcountremovea.length();
	System.out.println("Total no.of a" + totalcountofa); 
}
}
