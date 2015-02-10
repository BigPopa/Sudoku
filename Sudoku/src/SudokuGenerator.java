import java.util.*;
import java.util.HashSet;

public class SudokuGenerator
	{
	static int[] [] grid ={	{1, 2, 3, 4, 5, 6, 7, 8, 9},
							{4, 5, 6, 7, 8, 9, 1, 2, 3},
							{7, 8, 9, 1, 2, 3, 4, 5, 6},
							{2, 3, 4, 5, 6, 7, 8, 9, 1},
							{5, 6, 7, 8, 9, 1, 2, 3, 4},
							{8, 9, 1, 2, 3, 4, 5, 6, 7},
							{3, 4, 5, 6, 7, 8, 9, 1, 2},
							{6, 7, 8, 9, 1, 2, 3, 4, 5},
							{9, 1, 2, 3, 4, 5, 6, 7, 8}};
	
	public static void main(String[] args)
		{
		displayGrid();
		for(int i = 0; i < 100; i++);
			{
			transformBasicGridRow();
			transformBasicGridColumn();
			}
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
