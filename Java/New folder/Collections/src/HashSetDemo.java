import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("pune");
		set.add("goa");
		set.add("nagpur");
		set.add("Hello");
		set.add("pune");
		set.add("goa");
		set.add("nagpur");
		set.add("Hello");
		set.add("pune");
		set.add("goa");
		set.add("nagpur");
		set.add("Hello");
		set.add("pune");
		set.add("goa");
		set.add("nagpur");
		set.add("Hello");
		set.add("pune");

		for (String str : set)
			System.out.println(str);
	}
}
