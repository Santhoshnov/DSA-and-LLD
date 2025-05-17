//built-in

import java.util.*;
class Union
{
    public static void main(String args[])
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1,2,3};

        HashSet<Integer> set = new HashSet<>();

        for(int num:a)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
        }

        for(int num:b)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
        }

        System.out.print(set.size());

    }
}