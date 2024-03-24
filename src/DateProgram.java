import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram {
public static void main(String[] args) {
	Date d = new Date();
	SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy");
	SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
	System.out.println(d.toString());
	System.out.println(sd.format(d));
	System.out.println(sdf.format(d));
	
	
}
}
