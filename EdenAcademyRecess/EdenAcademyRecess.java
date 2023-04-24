import java.io.*;
import java.util.*;

public class EdenAcademyRecess 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t = 0; t < T; t++)
        {
            int numStudents = in.nextInt();
            int numClaps = in.nextInt();
            
            //binary representation of students, i will demonstrate by using fingers or classmates
            int allStudentsRaisingHands = (int)Math.pow(2, numStudents) - 1;
            
            /* 
            This section uses a bitwise AND operator. 
            This takes both numbers and applies the AND logical operator to each bit, resulting in the new number.
            For example:
            int a = 26;  (0001 1010 in binary)
            int b = 51;  (0011 0011 in binary)
            int c = a&b; (0001 0010 in binary)
            print(c) -> 18
            */
            
            if( (numClaps&allStudentsRaisingHands) == allStudentsRaisingHands)
            {
                System.out.println("ELEGANT!!!");
            }else
            {
                System.out.println("NOT ELEGANT!!!");
            }
            
        }
    }
}
