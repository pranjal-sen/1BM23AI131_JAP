public class program_1b {
    public static void main (String args[])
    {
        int i, j;
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("B ");
                }
                else
                {
                    System.out.print("W ");
                }
            }
            System.out.println("");
        }
    }
}
