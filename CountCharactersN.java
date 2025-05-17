//no-built-in


class CountCharactersN
{
    public static void main(String args[])
    {
        String s = "geeksforgeeks";
        int N = 2;

       int[] frequency = new int[26];
       char prev = '\0';

       for(char c:s.toCharArray())
       {
        if(c!=prev)
        {
            frequency[c-'a']++;
            prev=c;
        }
       }
        
        int count = 0;
        for(int i=0;i<26;i++)
        {
            if(frequency[i] == N)
            {
                count++;
            }
        }

        System.out.print(count);
    }
}