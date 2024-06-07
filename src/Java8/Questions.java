package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questions {
    public static void main(String[] args) {

        /*List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        //seprate even and odd
        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));

        System.out.println(oddEvenNumbersMap);*/
        findFrequency();

        findOfEachFrequency();
        Jonining();
    }

    public void removeDuplicate()
    {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueStrngs);
    }

    public static void findFrequency()
    {
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> frequencyMap = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
    public static void findOfEachFrequency()
    {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> collected = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collected);

    }

    public static void decimalListSorted()
    {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

    public static void Jonining()
    {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(listOfStrings);
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);
    }

    public static void maxmin()
    {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Maximum Element : "+max);

        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Minimum Element : "+min);
    }
}
