class Stn 
{
    public static void main(String[] args) 
    {
    int[] arr1 = {2, 2, 7, 5, 3, 3};
    int[] arr2 = {4, 3, 3, 8};

    int n = arr1.length;
    int m = arr2.length;
    int k = Math.max(n,m);
    int[] result = new int[k + 1];
    int carry = 0;
    int i = n-1;
    int j = m-1;

    while(i>=0 || j>=0)
    {
        int sum = carry;
        if(i>=0)
        {
            sum+=arr1[i];
            i--;
        }
        if (j >= 0) 
        {
            sum += arr2[j];
            j--;
        }
        carry = sum/10;
        result[k] = sum % 10;
        k--;
    }

    if (carry != 0) 
    {
        result[k] = carry;
    }
    else
    {
        k++;
    }

    for (int index = k; index < result.length; index++) 
    {
        System.out.print(result[index]);
    }
    }
}