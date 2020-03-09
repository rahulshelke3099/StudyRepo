import java.util.stream.Stream;


public class StreamEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(120,"Neha");
		Employee emp2 = new Employee(110,"Pulkit");
		Employee emp3 = new Employee(114,"Suhani");
		
		Stream<Employee> stream = Stream.of(emp1,emp2,emp3);
		//stream.forEach((emp)-> System.out.println(emp));
		stream.sorted().forEach((emp)->System.out.println(emp));
		
	}
}
