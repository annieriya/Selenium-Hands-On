import java.util.List;
import java.util.stream.Stream;

public class convertarraystreams {
public static void main (String[] args) {
	//Stream.of("Annie", "Balram" , "Danny").filter(s  ->s.startsWith("a")).forEach(s-> System.out.println(s));
	List<String> name = Arrays.asList("Annie","Balram","Danny");
	name.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
}
}
