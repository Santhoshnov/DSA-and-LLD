
class Stock
{
    public static void main(String args[])
    {
        int prices[] = {7, 10, 1, 3, 6, 9, 2};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices)
        {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max((price-minPrice),maxProfit);
        }
        System.out.print(maxProfit);
    }
}