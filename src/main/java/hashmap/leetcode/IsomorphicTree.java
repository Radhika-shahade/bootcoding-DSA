package hashmap.leetcode;

import java.util.HashMap;
import java.util.Map;
//205
//Input: s = "egg", t = "add"
//Output: true
public class IsomorphicTree {
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if (!map.containsKey(original)) {
                if(!map.containsValue(replacement))
                {
                    map.put(original, replacement);
                }
                else
                {
                    return false;
                }
            }
            else {
                char mappedCharacter= map.get(original);
                if(mappedCharacter!=replacement)
                {
                    return false;
                }


            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bar"));
    }
}
