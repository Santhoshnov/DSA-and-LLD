

class RemoveCharacter
{
    public static void main(String args[])
    {
        String str1 = "computer";
        String str2 = "cat";

        String res = "";

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        for (char c : str1Arr) 
        {
            if (!contains(str2Arr, c)) 
            {
                res += c;
            }
        }



        System.out.print(res);
    }

    private static boolean contains(char[] arr, char target)
    {
        for(char c: arr)
        {
            if(c==target)
            {
                return true;
            }
        }
        return false;
    }

    
}