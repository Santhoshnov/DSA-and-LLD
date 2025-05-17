//built-in
import java.util.*;

class Distinct
{
    public static void main(String args[])
    {
        //int[] nums = {131,11,48};
        int[] nums = {111, 222, 333, 4444, 666};
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums)
        {
            String str = String.valueOf(i);
            for (char ch : str.toCharArray()) {
                int digit = Character.getNumericValue(ch);
                set.add(digit);
            }
        }

        for(int i:set)
        {
            System.out.print(" "+i);
        }
    }
}