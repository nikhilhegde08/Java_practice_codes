import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * 
 * Functional interface
 * Used by map function
 * Functional interface has apply function
 * Function<argType, retType>
 * 
 * */
 
public class FunctionTest
{
	public static void main(String[] args) {
		
		Function<Integer, Integer> squareOf = x -> x * x;
		
		// Test Function
		System.out.println("--Test Function--");
		System.out.println(squareOf.apply(5));
		
		List list1 = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		// Test Function in streams
		System.out.println("--Squared Numbers--");
		list1.stream().map(squareOf).forEach(System.out::println);
		
		// Function interface to construct map
		System.out.println("--Squared Numbers in Map--");
		System.out.println(list1.stream().collect(Collectors.toMap(x->x, squareOf)));
		
	}
}
