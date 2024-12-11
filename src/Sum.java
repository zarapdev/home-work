import java.util.TreeSet;

public class Sum {

    //bir massive ededleri cemleyin, ancaq ededler yalniz tresetdeki yalniz 3 eded arasindadirsa toplayin
    public int calculateSum(Integer[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(8);
        set.add(1);
        set.add(4);
        Integer[] arraySet = set.toArray(new Integer[0]);
        Integer largestNumber = arraySet[arraySet.length - 1];
        Integer largestThirdNumber = arraySet[arraySet.length - 3];


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestThirdNumber && arr[i] < largestNumber) {

                sum += arr[i];

            }
        }
        return sum;


    }
}
