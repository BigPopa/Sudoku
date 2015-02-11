import java.util.*;
import java.util.HashSet;

public class SudokuGenerator
	{
	static int[] [] grid ={	{8, 1, 2, 7, 5, 3, 6, 4, 9},
							{9, 4, 3, 6, 8, 2, 1, 7, 5},
							{6, 7, 5, 4, 9, 1, 2, 8, 3},
							{1, 5, 4, 2, 3, 7, 8, 9, 6},
							{3, 6, 9, 8, 4, 5, 7, 2, 1},
							{2, 8, 7, 1, 6, 9, 5, 3, 4},
							{5, 2, 1, 9, 7, 4, 3, 6, 8},
							{4, 3, 8, 5, 2, 6, 9, 1, 7},
							{7, 9, 6, 3, 1, 8, 4, 5, 2}};
	
	public static void main(String[] args)
		{
		displayGrid();
		switchBlocks();
//		for(int i = 0; i < 100; i++);
//			{
//			transformBasicGridRow();
//			transformBasicGridColumn();
//			}
		displayGrid();
		}

	public static void transformBasicGridRow()
		{
		int [] rowToSwitch = {0, 3, 6};
		int row = (int)(Math.random() * 3);
		row = rowToSwitch[row];
		int [] temp = new int [9];
		temp = grid[row];
		grid[row] = grid[row + 2];
		grid[row + 2] = temp;	
		}
	
	public static void transformBasicGridColumn()
		{
		int [] colToSwitch = {0, 3, 6};
		int col = (int)(Math.random() * 3);
		col = colToSwitch[col];
		for(int i = 0; i < 9; i++)
			{
			int temp = grid[i][col];
			grid[i][col] = grid[i][col + 2];
			grid[i][col + 2] = temp;	
			}
		}
	
	public static void switchBlocks()
		{
		int [] temp1 = new int [9];
		int [] temp2 = new int [9];
		int [] temp3 = new int [9];
		temp1 = Arrays.copyOf(grid[0], 9);
		temp2 = Arrays.copyOf(grid[1], 9);
		temp3 = Arrays.copyOf(grid[2], 9);
		for (int i = 0; i < 9; i++)
			{
			grid[0][i] = grid[8][i];
			grid[1][i] = grid[7][i];
			grid[2][i] = grid[6][i];
			}
		grid[8] = Arrays.copyOf(temp1, 9);
		grid[7] = Arrays.copyOf(temp2, 9);
		grid[6] = Arrays.copyOf(temp3, 9);
		
		int [][] temp4 = new int [9][9];
		int [][] temp5 = new int [9][9];
		int [][] temp6 = new int [9][9];
		for (int i = 0; i < 9; i++)
			{
			temp4[i][8] = grid[i][8];
			temp5[i][7] = grid[i][7];
			temp6[i][6] = grid[i][6];

			grid[i][8] = grid[i][0];
			grid[i][7] = grid[i][1];
			grid[i][6] = grid[i][2];
			
			grid[i][0] = temp4[i][8];
			grid[i][1] = temp5[i][7];
			grid[i][2] = temp6[i][6];
			}
		}
	
	public static void displayGrid()
		{
		for (int r = 0; r < 9; r++)
			{
			for (int c = 0; c < 9; c++)
				{
				System.out.print(grid[r][c] + " ");
				}
			System.out.println();
			}
		System.out.println();
		}
	}
