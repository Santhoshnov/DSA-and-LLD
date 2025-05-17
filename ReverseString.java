

class ReverseString
{
    public static void main(String args[])
    {
        String S= "Help Others";
        char[] arr = S.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) 
        {
            if (arr[left] == ' ') 
            {
                left++;
            } 
            else if (arr[right] == ' ') 
            {
                right--;
            } 
            else 
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.print(new String(arr));
    }
}