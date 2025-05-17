class TotalCount 
{
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 7};
        int k = 4;

        int count = 0;
        for (int num : arr) 
        {
            count += (num + k - 1) / k; 
        }

        System.out.println(count);
    }
}

/* alternative but inefficient
int count = 0;
for (int num : arr) {
    while (num > 0) {
        num -= k;
        count++;
    }
}
*/
