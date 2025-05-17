

class SumMatrix
{
    public static void main(String args[])
    {
        int N = 2;
        int M = 3;

        int[][] Grid = {{1,0,1},{-8,9,-2}};

        int sum = 0;

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                sum+=Grid[i][j];
            }
        }
        System.out.print(sum);
    }
}