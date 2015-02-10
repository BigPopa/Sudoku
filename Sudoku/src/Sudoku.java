import java.util.*;
import java.util.HashSet;

public class Sudoku
	{
	static ArrayList<Integer>numbers = new ArrayList<Integer>();
	static int [] [] grid = new int [9][9];
	public static void main(String[] args)
		{
		fillRandomGrid();
		}
	
	public static void fillRandomGrid()
		{
		for (int r = 0; r < 9; r++)
			{
			ArrayList<Integer>numbers = new ArrayList<Integer>();
			for(int i = 1; i <= 9; i++)
				{
				numbers.add(i);
				}
			Collections.shuffle(numbers);
			
			for (int c = 0; c < 9; c++)
				{
				grid[r][c] = numbers.get(c);
				}
			}
		checkColumns();
		}
	
	public static void checkColumns()
		{
		for (int r = 0; r < 9; r++)
			{
			HashSet hs = new HashSet();
			for (int c = 0; c < 9; c++)
				{
				hs.add(grid[r][c]);
				}
			System.out.println("HashSet size = " + hs.size());
			if (hs.size() !=9)
				{
				fillRandomGrid();
				}
			}
		System.out.println("It works!");
		displayGrid();
		}
	
	
	public static void displayGrid()
		{
		for(int r = 0; r < 9; r++)
			{
			for(int c = 0; c < 9; c++)
				{
				System.out.print(grid[r][c] + " ");
				}
			System.out.println();
			}
		}

	}
