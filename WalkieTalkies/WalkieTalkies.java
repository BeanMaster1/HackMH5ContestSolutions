import java.io.*;
import java.util.*;

public class WalkieTalkies
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t = 0; t < T; t++)
        {
            int N = in.nextInt();
            /*Alternate, unsimplified solution
            int sum = 0;
            for(int numWalkies = N - 1; numWalkies > 0; numWalkies--)
            {
                sum+=numWalkies;
            }
            System.out.println(sum);*/
            
            System.out.println( (N)*(N-1)/2 );
        }
    }
}
