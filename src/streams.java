import java.util.ArrayList;
public class streams {
public static void main(String[] args)
{
	ArrayList<String> names = new ArrayList<String>();
	names.add("Annie");
	names.add("Santiago");
	names.add("Remo");
	names.add("Randy");
	names.add("Revin");
	names.stream().filter(s-> s.startsWith("R")).limit(1).forEach(s->System.out.println(s));
	names.stream().filter(s-> s.startsWith("R")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	names.stream().filter(s-> s.endsWith("e")).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
}
}
