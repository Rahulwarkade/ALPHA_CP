import java.util.*;
import java.util.Arrays;

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

	public static void printChess(int[][] chess)
	{
		int n = chess.length;

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(chess[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[] moveX = {1,-1,2,2,1,-1,-2,-2};
	public static int[] moveY = {2,2,1,-1,-2,-2,-1,1};
	public static int N = 8;

	public static boolean isSafe(int[][] chess,int move,int row,int col)
	{
		return (row>=0 && row<N && col>=0 && col<N && chess[row][col]==-1);
	}
	public static boolean KnightTour(int[][] chess,int move,int row,int col)
	{
		if(move>=64)
		{
			return true;
		}


		for(int i=0; i<N; i++)
		{
			int nextX = col+moveX[i];
			int nextY = row + moveY[i];
			if(isSafe(chess,move+1,nextY,nextX))
			{
				chess[nextY][nextX] = move;
				if(KnightTour(chess,move+1,nextY,nextX))
				{
					return true;
				}
				else 
				{
					chess[nextY][nextX] = -1;
				}
			}
		}

		return false;
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
		// lettersCombinations(0,len,new StringBuilder(),digit);

		int[][] chess  = new int[N][N];

		for(int i=0; i<N; i++)
		{
			Arrays.fill(chess[i],-1);
		}

		int move =0,col=0,row=0;
		chess[row][col] = 0;
		KnightTour(chess,move,row,col);
		printChess(chess);
	}
}