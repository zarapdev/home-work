import java.util.HashSet;
import java.util.Set;

public class ShareNumber {
    public void elements(int [] arr1 , int[] arr2){
    //arr otaq element tapmaq
        Set<Integer> set = new HashSet<>(); // dublicatlari aradan cixarmaq ucun collection
        for (Integer reqem : arr1) { // burada arr set menimsedirik
            set.add(reqem); // regem (sozu) set menimsetmek
        }
        Set<Integer> ortaqElementler = new HashSet<>(); // ortaq elemetleri tapmaq
        for (Integer num : arr2) { //ortaq elemetleri tapiriq
            if (set.contains(num)) {
                ortaqElementler.add(num);
            }


        }

        System.out.println(ortaqElementler);

    }
}
