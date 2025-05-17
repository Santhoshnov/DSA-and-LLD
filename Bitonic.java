class Bitonic
{
    public static void sortAsc(int[] arr,int n)
        {
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    } 
                }
            }
        }

    public static void sortDesc(int[] arr,int n)
        {
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(arr[j]<arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    } 
                }
            }
        }


    public static void main(String args[])
    {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] odd = new int[arr.length];
        int[] even = new int[arr.length];
        int oddCount = 0, evenCount = 0;

        for (int num : arr) 
        {
            if (num % 2 != 0) 
            {
                odd[oddCount++] = num;
            } 
            else 
            {
                even[evenCount++] = num;
            }
        }

        sortAsc(even, evenCount);
        sortDesc(odd, oddCount);

        int[] result = new int[evenCount + oddCount];
        int index = 0;

        for (int i = 0; i < evenCount; i++) 
        {
            result[index++] = even[i];
        }

        for (int i = 0; i < oddCount; i++) 
        {
            result[index++] = odd[i];
        }

        for (int num : result) 
        {
            System.out.print(num + " ");
        }
    }
}