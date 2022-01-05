import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;
/**
 * Predicate usage
 * Predicate makes use of test function
 * Predicate is used for filter
 *
 * */
 
public class PredicateTest
{
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = x -> (x % 2 == 0);
		Predicate<Integer> isOdd = x -> (x % 2 != 0);
		Predicate<Integer> divisibleBy3 = x -> (x % 3 == 0);
		
		// test method uses the function lambda function assigned
		System.out.println("--Predicate Test--");
		System.out.format("%s \n",isEven.test(5));
		
		List list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		// Filtering even numbers
		System.out.println("--Even Numbers--");
		list1.stream().filter(isEven).forEach(System.out::println);
		
		// Filtering odd numbers
		System.out.println("--Odd Numbers--");
		list1.stream().filter(isOdd).forEach(System.out::println);
		
		// combining predicates
		System.out.println("--Odd Numbers and Divisible by 3--");
		list1.stream().filter(isOdd.and(divisibleBy3)).forEach(System.out::println);
		
	}
}
