import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		System.out.println("size = " + obj.size());
		// System.out.println("capacity = "+obj.ca
		obj.add(12); // Integer obj = 12;
		obj.add(5);
		obj.add(20);
		obj.add(22);
		obj.add(2);
		obj.add(27);
		obj.add(27);
		obj.add(27);
		obj.add(27);
		obj.add(27);
		obj.add(27);
		System.out.println("size = " + obj.size());
		// System.out.println("capacity = "+obj.capacity());

		/*
		 * Iterator<Integer> iterator = obj.iterator();
		 * while(iterator.hasNext()) System.out.println(iterator.next());
		 */
		for (Integer ref : obj)
			System.out.println(ref);
	}
}
