

class Subsequence
{
    public static void main(String args[])
    {
        String A = "gksrek";
        String B = "geeksforgeeks";

        int i=0;
        int j=0;

        int m = A.length();
        int n = B.length();

        while(j<n && i<m)
        {
            if(B.charAt(j) == A.charAt(i))
            {
                i++;
            }
            j++;
        }

        if(i==m)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}