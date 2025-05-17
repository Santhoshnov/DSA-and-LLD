//no-built-in

class AlternateSortN
{
     public static void sort(int[] arr,int n)
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

    public static void main(String args[])
    {
        int arr[] = {7, 1, 2, 3, 4, 5, 6};

        sort(arr,arr.length);

        int res[] = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int index = 0;

        while(left<=right)
        {
            if(left!=right)
            {
                res[index++] = arr[right--];
                res[index++] = arr[left++];
            }
            else
            {
                res[index++] = arr[left++];
            }
        }

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(res[i] + " ");
        }

    }
}