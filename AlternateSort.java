//built-in

import java.util.*;

class AlternateSort
{
    public static void main(String args[])
    {
        int arr[] = {7, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> res = new ArrayList<>(); 

        int left = 0;
        int right = arr.length - 1;

        Arrays.sort(arr);

        while(left<=right)
        {
            if(left!=right)
            {
                res.add(arr[right]);
                res.add(arr[left]);
            }
            else
            {
                res.add(arr[left]);
            }
            right--;
            left++;
        }

        System.out.println(res);

    }
}