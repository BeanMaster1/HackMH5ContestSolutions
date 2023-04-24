import java.io.*;
import java.util.*;

public class YorIsLost 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //read maze dimensions
        String dimensions = in.nextLine();
        Scanner dimensionScanner = new Scanner(dimensions);
        int R = dimensionScanner.nextInt(); int C = dimensionScanner.nextInt();
        //read maze
        char[][]maze = new char[R][C];
        for(int i = 0; i < R; i++)
        {
            maze[i] = in.nextLine().toCharArray();
        }
        //find starting position
        int startR = -1;
        int startC = -1;
        for(int r = 0; r < R; r++)
        {
            for(int c = 0; c < C; c++)
            {
                if(maze[r][c] == 'Y')
                {
                    startR = r;
                    startC = c;
                }
            }
        }
        //check if maze is solvable
        if(solve(startR, startC, maze))
        {
            System.out.println("May I have the honor of taking your life?");
        }else
        {
            System.out.println("Another traitorous scumbag got away");
        }
    }
    public static boolean solve(int r, int c, char[][]maze)
    {
        //check if out of bounds
        if(r < 0 || r >= maze.length || c < 0 || c >= maze[r].length)
            return false;
        //check if in wall
        if(maze[r][c] == '#')
            return false;
        //check if win
        if(maze[r][c] == 'T')
            return true;
        //make sure this spot isnt revisited
        maze[r][c] = '#';
        //check all surrounding spots
        return
            solve(r+1, c, maze) ||
            solve(r-1, c, maze) ||
            solve(r, c+1, maze) ||
            solve(r, c-1, maze);
    }
}
