// Adrián Navarro Gabino

import java.util.*;

public class EscapingTheImperialForces
{
    public static boolean enterAsteroidsField(
        char[][] maze, int row, int column)
	{
		if (row < 0 || row >= maze.length || column < 0 ||
            column >= maze[0].length || maze[row][column] == '*')
			return false;
        else if(maze[row][column] == 'F')
            return true;
		else
		{
			maze[row][column] = '*';
			return  enterAsteroidsField(maze, row-1, column) 
			         || enterAsteroidsField(maze, row+1, column)
			         || enterAsteroidsField(maze, row, column-1)
			         || enterAsteroidsField(maze, row, column+1);
		}
	}
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        
        while(sc.hasNextLine())
        {
            rows = sc.nextInt();
            columns = sc.nextInt();
            sc.nextLine();
            
            int row = 0;
            int column = 0;
            
            char[][] maze = new char[rows][columns];
            String auxMaze;
            
            for(int i = 0; i < rows; i++)
            {
                auxMaze = sc.nextLine();
                for(int j = 0; j < columns; j++)
                {
                    maze[i][j] = auxMaze.charAt(j);
                    if(maze[i][j] == 'S')
                    {
                        row = i;
                        column = j;
                    }
                }
            }
            
            if(enterAsteroidsField(maze, row, column))
            {
                System.out.println("SI");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
