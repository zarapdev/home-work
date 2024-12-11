import java.util.HashSet;
import java.util.Set;

public class UniqueWord {
    public void findUniqueWord(String sentence){
        //bir cumle daxil edin, yalniz 1 defe ist olunan sozleri cap edon


        String [] arr = sentence.split(" ");
        Set<String> words = new HashSet<>();    //dublicata icaze vermir
        Set<String> repeatWords = new HashSet<>();
        for (String word : arr){
            if (words.add(word) == false){ //dublicati tapmaq
                repeatWords.add(word);
            }


        }
        for (String word : words){

            if (repeatWords.contains(word)== false) // (terkibinde yoxdursa)
                System.out.println(word);

        }


    }
}
