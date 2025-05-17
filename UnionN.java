//no-built-in

class UnionN
{
    public static void main(String args[])
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1,2,3};

        int[] union = new int[a.length+b.length];
        int unionSize = 0;

        for(int i=0; i<a.length;i++)
        {
            if(!contains(union,unionSize,a[i]))
            {
                union[unionSize] = a[i];
                unionSize++;
            }
        }

        for(int i=0; i<b.length;i++)
        {
            if(!contains(union,unionSize,b[i]))
            {
                union[unionSize] = b[i];
                unionSize++;
            }
        }

        for (int i = 0; i < unionSize; i++) 
        {
            System.out.print(union[i] + " ");
        }

    }

    private static boolean contains(int[] arr,int size, int val)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i] == val) return true;
        }
        return false;
    }
}