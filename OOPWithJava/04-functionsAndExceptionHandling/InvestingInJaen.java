// Adrián Navarro Gabino

import java.util.*;

public class InvestingInJaen
{
    public static int calculateArea(char[][] maze, int x, int y)
    {
        if(x < 0 || x > maze.length - 1 || y < 0 ||
                y > maze[0].length - 1)
        {
            return 0;
        }
        else if(maze[x][y] == ' ')
        {
            return 0;
        }
        else
        {
            maze[x][y] = ' ';
            return 1 + calculateArea(maze, x - 1, y)
                        + calculateArea(maze, x + 1, y)
                        + calculateArea(maze, x, y + 1)
                        + calculateArea(maze, x, y - 1);
        }
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int rows, columns;
        char[][] maze;
        
        while(sc.hasNext())
        {
            rows = sc.nextInt();
            columns = sc.nextInt();
            sc.nextLine();
            
            maze = new char[rows][columns];
            
            for(int i = 0; i < rows; i++)
            {
                String line = sc.nextLine();
                for(int j = 0; j < columns; j++)
                {
                    maze[i][j] = line.charAt(j);
                }
            }
            
            int max = 0;
            
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < columns; j++)
                {
                    if(maze[i][j] == '#')
                    {
                        int result = calculateArea(maze, i, j);
                        if(result > max)
                        {
                            max = result;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}
