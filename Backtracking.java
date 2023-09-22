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
	public static boolean isSafe(int row,int col,int N)
	{
		return ((row>=0 && row<N) && (col>=0 && col<N));
	}
	public static void knightTour(int[][] chess,int row,int col,int move,int N)
	{
		if(!isSafe(row,col,N)) return;

		if(chess[row][col]!=0) return;
		
		if(move==0){
			chess[row][col] = -1;
			move++;
		}
		else{
			chess[row][col] = move++;
		}

		knightTour(chess,row+2,col+1,move,N);
		knightTour(chess,col+2,row+1,move,N);
		knightTour(chess,col+2,row-1,move,N);
		knightTour(chess,row-2,col+1,move,N);
		knightTour(chess,row-2,col-1,move,N);
		knightTour(chess,col-2,row+1,move,N);
		knightTour(chess,row-2,col+1,move,N);
		knightTour(chess,col-2,row-1,move,N);

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

		int N = 8;
		int[][] chess  = new int[N][N];
		int row =0,col=0,move=0;
		knightTour(chess,row,col,move,N);

		printChess(chess);
	}
}