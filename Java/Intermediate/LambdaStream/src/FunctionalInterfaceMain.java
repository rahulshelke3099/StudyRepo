import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceMain
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> sayHello();   //sysout should not be used because it return void 
		System.out.println("supplier data = "+supplier.get());
		
		@SuppressWarnings("rawtypes")
		Consumer consume = (str)->System.out.println(str);
		consume.accept(supplier.get());
		
		Predicate <String> predicate = (str) -> str.length() >= 5;
		System.out.println(predicate.test(supplier.get()));
		
		Function<String, Integer> function = (str) -> {return str.length();};
		System.out.println("length of the inpur= ");
		System.out.println(function.apply(supplier.get()));
		}
	
	public static String sayHello()
	{
		return "Hello";
	}
}
