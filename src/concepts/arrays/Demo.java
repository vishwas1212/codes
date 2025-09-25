package concepts.arrays;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C");

        for(String s : list){
            if(s.equals("B")){
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
