import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //программа в функциональном стиле т.к. реализован интерфейс Function и монада
        String aboriginalText = "PARRAMATTA WAHROONGA TATHRA BINOWEE DULILI KALIMNA";
        Function<String, List<String>> functions = (a) ->
                Arrays.stream(a.split(" ")).sorted().distinct().collect(Collectors.toList());
        functions.apply(aboriginalText).forEach(System.out::println);
    }
}
