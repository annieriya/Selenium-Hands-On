
public class removeblankspace {
	public static void main(String[] args) {
		String s = "Your   grace  is   sufficient  for  me";
		String removeblankspace = s.replaceAll("\\s", "");
		System.out.println("No.of characters  without space " + removeblankspace.length());
		System.out.println(removeblankspace);
	String removechars=removeblankspace.replaceAll("s", "");
	System.out.println("No.of characters  without s "+ removechars.length());
int totalnos =removeblankspace.length()-removechars.length();
		System.out.println(totalnos);
	}
}
