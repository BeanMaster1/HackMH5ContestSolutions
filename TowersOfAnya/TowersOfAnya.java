import java.io.*;
import java.util.*;

public class TowersOfAnya 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //Move all rings from A to C using B as a pivot
        move(n, 'A', 'C', 'B');
    }
    public static void move(int n, char start, char end, char pivot)
    {
        if(n==0)
        {
            return;
        }
        //Move everything but the bottom ring to the pivot
        move(n-1, start, pivot, end);
        //Move the bottom ring to the end
        System.out.println("Move " + start + " to " + end);
        //Move all the rings back onto the bottom ring, which is now at the end
        move(n-1, pivot, end, start);
    }
    
}
