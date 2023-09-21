import java.util.*;


class Backtracking
{

	public static int[][] newMaze = new int[4][4];
	public static int n = 4;
	public static void ratMaze(int[][] maze, int r,int c)
	{
		if(r>=n || c>=n) return;
		if(r==n-1 && c==n-1) 
		{
			if(maze[r][c]==1)
			{
				newMaze[r][c] = 1;
				for(int i=0; i<n; i++){
					for(int j=0; j<n; j++){
					System.out.print(newMaze[i][j]+" ");
				}
				System.out.println();
			}
			}
			return;
		}
		if(maze[r][c]==1)
		{
			newMaze[r][c] = 1;
			ratMaze(maze,r+1,c);
			ratMaze(maze,r,c+1);
		}
	}

	public static String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


	public static void lettersCombinations(int pos,int len,StringBuilder combinations,String digit)
	{
		if(len==0)
		{
			System.out.println("");
			return;
		}

		if(len==pos)
		{
			System.out.print(combinations.toString()+ " ");
			return;
		}
		else
		{
			String letters = keypad[Character.getNumericValue(digit.charAt(pos))];

			for(int i=0; i<letters.length(); i++)
			{
				lettersCombinations(pos+1,len,new StringBuilder(combinations).append(letters.charAt(i)),digit);
			}
		}
	}

	public static void main(String args[])
	{
		int[][] maze = {{1,0,0,0},
						{1,1,0,1},
						{0,1,0,0},
						{1,1,1,1}};
        
        // ratMaze(maze,0,0);

		String digit = "234n";
		int len = digit.length();
		lettersCombinations(0,len,new StringBuilder(),digit);

	}
}