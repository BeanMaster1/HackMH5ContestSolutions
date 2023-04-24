import java.io.*;
import java.util.*;

public class TowersOfAnya 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        move(n, 'A', 'C', 'B');
    }
    public static void move(int n, char start, char end, char pivot)
    {
        if(n==0)
        {
            return;
        }
        move(n-1, start, pivot, end);
        System.out.println("Move " + start + " to " + end);
        move(n-1, pivot, end, start);
    }
    
}
