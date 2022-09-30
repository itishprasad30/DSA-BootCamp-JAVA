package PraticeProgram.StringPrograms;



public class RepeatedCharTo$ {

    static int findRepeatFirstN2(String s)
    {


        int p = -1, i, j;
        for (i = 0; i < s.length(); i++)
        {
            for (j = i + 1; j < s.length(); j++)
            {
                if (s.charAt(i) == s.charAt(j))
                {
                    p = i;
                    break;
                }
            }
            if (p != -1)
                break;
        }

        return p;
    }

    // Driver code
    public static void main (String[] args)
    {
        String str = "apple";

        int pos = findRepeatFirstN2(str);

        if (pos == -1)
            System.out.println("Not found");
        else {
           char ch = str.charAt(pos);
            System.out.println(str.replace(ch,'$'));
        }
    }


}