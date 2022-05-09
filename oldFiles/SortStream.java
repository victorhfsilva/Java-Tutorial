package Package5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SortStream {
	public static void main(String[] args) {
		
		//Create List
		System.out.println("List");
		List<Integer> list1 = Arrays.asList(1,4,6,9,3,5,6,3);
		//Iterate through list
		System.out.println("For Iteration");
		for (Integer i : list1) {
			System.out.print(i+"\t");
		}
		System.out.println();		
		
		//Collections Sort
		Collections.sort(list1);
		//Sorted List Stream Iteration 
		System.out.println("Stream Iteration");
		list1.stream().forEach(i -> System.out.print(i+"\t"));
		System.out.println();
		
		//Create List
		System.out.println("Stream Count");
		List<Double> list2 = Arrays.asList(1.2,1.3,3.2,4.2,5.2);
		long count2 = list2.stream().count();
		System.out.println(count2);
		System.out.println();
		
		//Minimum List and Comparator Order
		System.out.println("Reversed Array and Minimum");
		List<Double> list3 = Arrays.asList(1.2,1.3,3.2,4.2,5.2);
		Optional<Double> min3 = list3.stream().min(Comparator.naturalOrder());
		list3.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i+"\t"));
		System.out.println();
		System.out.println(min3);
		System.out.println();
		
		//Collect method to create list
		System.out.println("Collect to List Array");
		List<Double> list4 = Arrays.asList(1.2,1.3,3.2,4.2,5.2);
		List<Double> list5 = list4.stream()
								.sorted(Comparator.naturalOrder())
								.collect(Collectors.toList());
		list5.stream().map( i -> i*3).forEach(i -> System.out.print(i+"\t"));
		System.out.println("\n");
		
		//Collect method to create map
		System.out.println("Grouping By");
		System.out.println("Boolean Map");
		Map<Object, List<Integer>> map1 = list1.stream().collect(Collectors.groupingBy(e -> e % 2 == 0));
		System.out.println(map1);
		System.out.println("Integer Map");
		Map<Object, List<Integer>> map2 = list1.stream().collect(Collectors.groupingBy(e -> e % 2));
		System.out.println(map2+"\n");
		
		//Create ArrayList
		System.out.println("Array List");
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		int size = 0;
		//add stream of elements to two ArrayList
		IntStream.of(1,5,8,3,5,6,4,2)
				.forEach(i -> {arrayList1.add(i);
								arrayList2.add(i+2);});
		//Print Serial Stream of elements of ArrayList
		arrayList1.stream()
				.forEach(i -> System.out.print(i+"\t"));
		System.out.println();
		arrayList2.stream()
				.forEach(i -> System.out.print(i+"\t"));
		System.out.println();
		//Filter ArrayList for even numbers and multiply the result for 3
		arrayList1.stream()
				//filter
				.filter( i -> i % 2 == 0)
				//edit values
				.map(i -> i*3)
				//print
				.forEach(i -> System.out.print(i+"\t"));
		System.out.println("\n");
		
		//Create array
		System.out.println("Array");
		double[] array1 = {2.1,1.2,0.21,1.6};
		//sort using Arrays
		Arrays.sort(array1);
		
		//Create Stream Object and Print using DoubleStream
		DoubleStream stream1 = DoubleStream.of(array1);
		stream1.filter(i -> i > 1.3)
				.forEach(i -> System.out.print(i+"\t"));
		System.out.println();
				
		//Sort and Print using DoubleStream
		DoubleStream.of(2.0,1.4,6.7,8.2,3.2)
		.sorted().forEach(System.out::println);
		System.out.println();
		
		//Get stream maximum and minimum value
		System.out.println("Max and Min");
		OptionalDouble maximum = DoubleStream.of(1.0,2.3,5.4,3.1,4.1).max();
		OptionalDouble minimum = DoubleStream.of(1.0,2.3,5.4,3.1,4.1).min();
		System.out.println(maximum.getAsDouble());
		System.out.println(minimum.getAsDouble());
		
	}
}
