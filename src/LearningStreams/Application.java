package LearningStreams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) throws IOException {

        //Integer stream with Skip
        IntStream
                .range(1,10)
                .skip(5)       //skip the five elements from the stream
                .forEach((x) -> System.out.println(x));
        System.out.println();
        System.out.println("#############################################");

        int val = IntStream
                .range(1,5)
                .sum();
        System.out.println(val);

        System.out.println("#############################################");

        //Stream of sorted and findFirst
        Stream.of("hello","my","name","africa")
                .sorted()
                .findFirst()
                .ifPresent((x)-> System.out.println(x));

        System.out.println("#############################################");

        //stream of items sorted based on index char
        String[] items = {"car","akash","nishu","box","cencil","toy","cuccy"};
        Stream.of(items)
                .filter((x) -> x.startsWith("c"))
                .sorted()
                .forEach(x -> System.out.println(x + ","));
        System.out.println();


        //Average of square of int array..
        System.out.println("#############################################");
        Arrays.stream(new int[] {2,3,6,7,8,9,11})
                .map((x) -> x*x)
                .average()
                .ifPresent((n) -> System.out.println(n));
        System.out.println();

        System.out.println("#############################################");
//Stream from a list , filter, print
        List<String> listOfItems = Arrays.asList("akash","nishu","cake","box","pencil","car");
        listOfItems.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(x-> System.out.println(x + " ,"));

        System.out.println("#############################################");

        //Stream files
        Stream<String> lines = Files.lines(Paths.get("src/LearningStreams/wordFile.txt"));
        lines.sorted()

                .filter(l -> l.contains("th")) //only the words containing "th"
                .collect(Collectors.toList())
                .forEach(x -> System.out.println(x + ", "));
        lines.close();

        System.out.println("#############################################");

        Stream<String> lines2 = Files.lines(Paths.get("src/LearningStreams/stockDataCsv.txt"));
        lines2.sorted()
                .filter(l -> l.length() > 6)
                .forEach(x -> System.out.println(x + ", "));
        lines2.close();

        System.out.println("#############################################");

        Stream<String> rows = Files.lines(Paths.get("src/LearningStreams/stockDataCsv.txt"));
        int rowCount = (int) rows
                .map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .count();//terminal operation
        System.out.println(rowCount + " good rows ");
        rows.close();

        System.out.println("#############################################");

        Stream<String> rows2 = Files.lines(Paths.get("src/LearningStreams/stockDataCsv.txt"));
        rows2.map(x-> x.split(",")) //mapping it in to a array
                .filter(x -> x.length > 3)
                .filter(x -> Integer.parseInt(x[1].trim()) >15)
                .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));

        rows.close();

    }



}
