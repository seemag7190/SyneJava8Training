import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lab1 {

	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(10,55,26,58,95);
		//intStream.forEach(System.out::println);
		//intStream.forEach(System.out::println); //error: stream has already been operated upon or closed

		List<Integer> intList = Stream.of(10,55,68,97,41,27).collect(Collectors.toList());
		intList.stream().forEach(System.out::println); 
		//intList.stream().forEach(System.out::println); //with the help of list we can call stream multiple times
		
		//Find out max using Stream
		Optional<Integer> max = intStream.max((x,y)->x.compareTo(y));
		if(max.isPresent())
			System.out.println("Max = "+max.get());
		else
			System.out.println("No Value");
		
		//Find out max using IntStream
		IntStream str = IntStream.of(152,147,185,169,201,235);
		System.out.println("Max = "+ str.max().getAsInt());
		//System.out.println("Min = "+ str.min().getAsInt()); //error: stream has already been operated upon or closed
		
		//Find out max using IntStream List
		
		
	}

}
