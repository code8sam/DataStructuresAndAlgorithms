package streamapiquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdHighestEvenUsingSpreamApi {
//    List<Integer> numbers = Arrays.asList(22,12,22,34,89,75,90,90,46);
//    //3rd highest even number using stream API. don't consider duplicate numbers.
public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(22,12,22,34,89,75,90,90,46);
    Optional<Integer> thirdHighestNumber = numbers.stream()
            .filter(n->n%2==0)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(2)
            .findFirst();
    thirdHighestNumber.ifPresentOrElse(
            n -> System.out.println("Answer : " +n),
            () -> System.out.println("Sorry !")
    );


}

}
