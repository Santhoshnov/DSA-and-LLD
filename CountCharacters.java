//built-in
import java.util.*;

class CountCharacters
{
    public static void main(String args[])
    {
        String s = "geeksforgeeks";
        int N = 2;

        HashMap<Character,Integer> hashmap = new HashMap<>();

        char prev = '\0';

        for(char c:s.toCharArray())
        {
            if(c!=prev)
            {
                hashmap.put(c,hashmap.getOrDefault(c,0)+1);
                prev = c;
            }
        }
        int count = 0;

        for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() == N) {
                count++;
            }
        }
        
        System.out.print(count);

    }
}