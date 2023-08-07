package hashmap.leetcode;

import java.util.HashSet;
import java.util.Set;
//using hashset
//2716:
//Input: s = "aaabc"
// Output: 3
public class MinimizeStringLength {
    public static int minimizedStringLength(String s) {
       Set<Character> set= new HashSet<>();
       for(int i=0;i<s.length();i++)
       {
           set.add(s.charAt(i));
       }
       return set.size();
    }

    public static void main(String[] args) {
        String s = "aaabc";
       int size = minimizedStringLength(s);
        System.out.println(size);
    }
}
