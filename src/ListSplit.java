
public class ListSplit {
	public static void main (String[] args)
	{
		String s1 =new String("Snehasini");
		String s2 =new String("Snehasini");
		
		String s3=new String("Australia Canberra SanFrancisco");  
		//since it has a sequence as String can be considered as an array hence the below object is declared with [] braces
		String[] splitString = s3.split(s3);
		{
			System.out.println(splitString[1]);
		}
			}
}
