import java.util.Arrays;
import java.util.stream.IntStream;

class SumOfMultiples {

    private int number;
    private int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        return IntStream.range(1,number).filter(multiple -> Arrays.stream(this.set)
                .anyMatch(multipleDivisor -> multipleDivisor!=0 && multiple % multipleDivisor == 0)).sum();
     }

}
