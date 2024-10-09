import Arrays.ArrayProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
        HashMap<Character, Character> res = new HashMap<>();
        res.put('b','b');
        res.put('a','a');
        for(Map.Entry<Character, Character> result: res.entrySet()  ){
            System.out.println(result.getKey()+"="+result.getValue());
        }
        ArrayProblems a=new ArrayProblems();
        a.reverseArray();
    }


}
