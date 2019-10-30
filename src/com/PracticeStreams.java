package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeStreams {
	public static void main(String[] args) throws IOException {

		System.out.println("Print all element in a list");
		IntStream str = IntStream.rangeClosed(1, 10);
		str.forEach(System.out::print);
		str.close();
		System.out.println();

		System.out.println("Skip first 3 elements from the list");
		str = IntStream.rangeClosed(1, 10);
		str.skip(3).forEach(System.out::print);
		str.close();
		System.out.println();

		System.out.println("Sum all emement in the list");
		str = IntStream.rangeClosed(1, 10);
		System.out.println(str.sum());
		str.close();

		System.out.println("Average square of sum of all emement in the list");
		str = IntStream.rangeClosed(1, 10);
		str.map(x -> (x * x)).average().ifPresent(System.out::print);
		str.close();

		System.out.println("Sorting array of string in acsending order");
		Stream<String> str1 = Stream.of(" Rolling Stones", " Lady Gaga", " Jackson Browne", " Maroon 5",
				" Arijit Singh", " Elton John", " John Mayer");
		str1.sorted().forEach(System.out::print);
		str1.close();
		System.out.println();

		System.out.println("First element in the Sorting array of string in acsending order");
		str1 = Stream.of(" Rolling Stones", " Lady Gaga", " Jackson Browne", " Maroon 5", " Arijit Singh",
				" Elton John", " John Mayer");
		str1.sorted().findFirst().ifPresent(System.out::print);
		str1.close();
		System.out.println();

		System.out.println(" Sorting array of string in decsending order");
		str1 = Stream.of(" Rolling Stones", " Lady Gaga", " Jackson Browne", " Maroon 5", " Arijit Singh",
				" Elton John", " John Mayer");
		str1.sorted(Collections.reverseOrder()).forEach(System.out::print);
		str1.close();
		System.out.println();

		System.out.println("Filter file data more then 13 char length");
		Stream<String> f = Files.lines(Paths.get("files/bands.txt"));
		f.sorted().map(String::toLowerCase).filter(x -> x.length() >= 13).collect(Collectors.toList()).forEach(x -> {
			System.out.print(x + " ");
		});

		f.close();
		System.out.println();

		System.out.println("Filter Csv file data that has all the 3 columns");
		f = Files.lines(Paths.get("files/data.txt"));
		long i = f.map(x -> x.split(",")).filter(x -> x.length == 3).count();
		f.close();
		System.out.println(i);

		System.out.println("Load data from the csv file parse the data");
		f = Files.lines(Paths.get("files/data.txt"));
		f.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
				.forEach(x -> System.out.println(x[0] + " , " + x[1] + " , " + x[2]));

		double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, Double::sum);
		System.out.println("Total = " + total);

		// 14. Reduction - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
		System.out.println(summary);

	}
}
