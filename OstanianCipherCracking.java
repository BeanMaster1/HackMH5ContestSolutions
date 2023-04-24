import java.io.*;
import java.util.*;

public class OstanianCipherCracking 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        //fast way to parse first line, can be done the long way
        int[] nums = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        int n = nums[0];
        int m = nums[1];
        
        //take the hint and add it to the end of the plaintext char[]
        char[] plaintext = new char[m];
        char[] endOfPlaintext = in.nextLine().toCharArray();
        for(int i = 1; i <= n; i++)
        {
            plaintext[m-i] = endOfPlaintext[n-i];
        }
        //encrypted text
        char[] ciphertext = in.nextLine().toCharArray();
        
        //I will demonstrate this on the board, dont worry
        for(int i = 1; i <= m - n; i++)
        {
            //difference between plaintext and ciphertext
            int diff = ciphertext[m-i] - plaintext[m-i];
            //make sure number is positive
            diff = (diff+26)%26;
            //because of how data is encrypted, diff is the key[m-1], or the plaintext[m-n-i];
            plaintext[m-n-i] = (char)(diff + 'a');
        }
        
        //print plaintext
        for(int i = 0; i < m; i++)
        {
            System.out.print(plaintext[i]);
        }
        
    }
}
