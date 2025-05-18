package SubsetPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String input = "abc";

        String[] perumutationArray = getPermutationsAsArray("",input);


        System.out.println("All permutations of " + input + " : ");
        System.out.println(Arrays.toString(perumutationArray));

    }


    static String[] getPermutationsAsArray(String processed,String unprocessed){
        List<String> resultList = new ArrayList<>();
        generatePermutations(processed,unprocessed,resultList);
        return resultList.toArray(new String[0]);
    }


    static void generatePermutations(String processed,String unprocessed,List<String> result){
        if(unprocessed.isEmpty()){
            result.add(processed);
            return;
        }

        char ch = unprocessed.charAt(0);


        //
        for (int i = 0; i <= processed.length(); i++) {

            String first = processed.substring(0,i);
            String second = processed.substring(i);
            generatePermutations(first + ch + second,unprocessed.substring(1),result);

        }

    }


}
