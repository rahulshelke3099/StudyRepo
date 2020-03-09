import java.util.ArrayList;
import java.util.Collections;


public class PersonList {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		Person obj1 = new Person("hema", "Mumbai");
		Person obj2 = new Person("ankita", "Mumbai");
		Person obj3 = new Person("rima", "Pune");
		Person obj4 = new Person("vaishali", "Pune");

		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		System.out.println("Before sort :: ");
		for (Person obj : list)
			System.out.println(obj);

		Collections.sort(list);

		System.out.println("After sort :: ");
		for (Person obj : list)
			System.out.println(obj);
	}
}
