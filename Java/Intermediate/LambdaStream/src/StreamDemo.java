import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream<String> stream = Stream
				.of("Persistent", "Pune", "Goa", "Nagpur");
		//stream.forEach((str)->System.out.println(str));
		//stream.filter((str)->str.length()>=4).forEach((str)->System.out.println(str));
		//stream.sorted().forEach((str)->System.out.println(str));
		
		//System.out.println(st
			//	ream.reduce((str1,str2)->str1.concat(str2)).get());
		
		//Stream<String> newStream = 
		stream.map((str)->str.substring(0,2)).forEach((str)->System.out.println(str));
	}

}
