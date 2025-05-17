//no-built-in
class DistinctN
{
    public static void main(String args[])
    {
        //int[] nums = {131,11,48};
        int[] nums = {111, 222, 333, 4444, 666};
        boolean[] digitPresent = new boolean[10];

        for(int num:nums)
        {
            while(num>0)
            {
                int digit = num%10;
                digitPresent[digit] = true;
                num = num/10;
            }
        }

        for(int i=0;i<10;i++)
        {
            if(digitPresent[i])
            {
                System.out.print(" " + i);
            }
        }
    }
}