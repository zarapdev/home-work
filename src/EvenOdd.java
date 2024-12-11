import java.util.HashMap;

public class EvenOdd {
    public void calculateNumbers(Integer[] arr) {
        //tek ve cut edelerin sayin hashmapda saxlayin

        HashMap<String, Integer> numbers = new HashMap<>();
        int evenCount = 0;
        int oddCount = 0;
        for (Integer num : arr) {
            if (num % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;

            }
        }
        numbers.put("cut eded" , evenCount);
        numbers.put("tek eded" , oddCount);
        System.out.println(numbers);

    }

}
