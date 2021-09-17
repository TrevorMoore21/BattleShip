
public class Grid_And_Spaces
	{

		static String [][] userGrid = new String[8][8];
		static String [][] compGrid = new String[8][8];
		
		
//		public static void main(String[] args)
//			{
//				fillWithSpaces();
//				displayGrid();
//				
//			}
		
		public static void displayUserGrid()
		{
			
			System.out.println();
			System.out.println("                     USER MAP");
			System.out.println();
			
			userGrid[1][1] = "ship2";
			userGrid[3][4] = "ship3";
			userGrid[4][7] = "ship4";
			userGrid[6][2] = "ship6";
			userGrid[5][1] = "ship5";
			userGrid[0][5] = "ship1";
			userGrid[6][6] = "ship7";
			
			
			
			System.out.print("    1     2     3     4     5     6     7     8");
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("A|" + userGrid[0][0] + "|" + userGrid[0][1] + "|" + userGrid[0][2] + "|" + userGrid[0][3] + "|" + userGrid[0][4] + "|" + userGrid[0][5] + "|" + userGrid[0][6] + "|" + userGrid[0][7] + "|");
			System.out.println("--------------------------------------------------");
			System.out.println("B|" + userGrid[1][0] + "|" + userGrid[1][1] + "|" + userGrid[1][2] + "|" + userGrid[1][3] + "|" + userGrid[1][4] + "|" + userGrid[1][5] + "|" + userGrid[1][6] + "|" + userGrid[1][7] + "|");
			System.out.println("--------------------------------------------------");
			System.out.println("C|" + userGrid[2][0] + "|" + userGrid[2][1] + "|" + userGrid[2][2] + "|" + userGrid[2][3] + "|" + userGrid[2][4] + "|" + userGrid[2][5] + "|" + userGrid[2][6] + "|" + userGrid[2][7] + "|");
			System.out.println("--------------------------------------------------");
			System.out.println("D|" + userGrid[3][0] + "|" + userGrid[3][1] + "|" + userGrid[3][2] + "|" + userGrid[3][3] + "|" + userGrid[3][4] + "|" + userGrid[3][5] + "|" + userGrid[3][6] + "|" + userGrid[3][7] + "|");
			System.out.println("--------------------------------------------------");
			System.out.println("E|" + userGrid[4][0] + "|" + userGrid[4][1] + "|" + userGrid[4][2] + "|" + userGrid[4][3] + "|" + userGrid[4][4] + "|" + userGrid[4][5] + "|" + userGrid[4][6] + "|" + userGrid[4][7] + "|");
			System.out.println("--------------------------------------------------");
			System.out.println("F|" + userGrid[5][0] + "|" + userGrid[5][1] + "|" + userGrid[5][2] + "|" + userGrid[5][3] + "|" + userGrid[5][4] + "|" + userGrid[5][5] + "|" + userGrid[5][6] + "|" + userGrid[5][7] + "|");
			System.out.println("--------------------------------------------------");
			System.out.println("G|" + userGrid[6][0] + "|" + userGrid[6][1] + "|" + userGrid[6][2] + "|" + userGrid[6][3] + "|" + userGrid[6][4] + "|" + userGrid[6][5] + "|" + userGrid[6][6] + "|" + userGrid[6][7] + "|");
			System.out.println("--------------------------------------------------");
			System.out.println("H|" + userGrid[7][0] + "|" + userGrid[7][1] + "|" + userGrid[7][2] + "|" + userGrid[7][3] + "|" + userGrid[7][4] + "|" + userGrid[7][5] + "|" + userGrid[7][6] + "|" + userGrid[7][7] + "|");
			System.out.println("--------------------------------------------------");
		}
		
		
		public static void displayComputerGrid()
			{
				
				System.out.println();
				System.out.println("                   COMPUTER MAP");
				System.out.println();
				
				
				
				
				System.out.print("    1     2     3     4     5     6     7     8");
				System.out.println();
				System.out.println("--------------------------------------------------");
				System.out.println("A|" + compGrid[0][0] + "|" + compGrid[0][1] + "|" + compGrid[0][2] + "|" + compGrid[0][3] + "|" + compGrid[0][4] + "|" + compGrid[0][5] + "|" + compGrid[0][6] + "|" + compGrid[0][7] + "|");
				System.out.println("--------------------------------------------------");
				System.out.println("B|" + compGrid[1][0] + "|" + compGrid[1][1] + "|" + compGrid[1][2] + "|" + compGrid[1][3] + "|" + compGrid[1][4] + "|" + compGrid[1][5] + "|" + compGrid[1][6] + "|" + compGrid[1][7] + "|");
				System.out.println("--------------------------------------------------");
				System.out.println("C|" + compGrid[2][0] + "|" + compGrid[2][1] + "|" + compGrid[2][2] + "|" + compGrid[2][3] + "|" + compGrid[2][4] + "|" + compGrid[2][5] + "|" + compGrid[2][6] + "|" + compGrid[2][7] + "|");
				System.out.println("--------------------------------------------------");
				System.out.println("D|" + compGrid[3][0] + "|" + compGrid[3][1] + "|" + compGrid[3][2] + "|" + compGrid[3][3] + "|" + compGrid[3][4] + "|" + compGrid[3][5] + "|" + compGrid[3][6] + "|" + compGrid[3][7] + "|");
				System.out.println("--------------------------------------------------");
				System.out.println("E|" + compGrid[4][0] + "|" + compGrid[4][1] + "|" + compGrid[4][2] + "|" + compGrid[4][3] + "|" + compGrid[4][4] + "|" + compGrid[4][5] + "|" + compGrid[4][6] + "|" + compGrid[4][7] + "|");
				System.out.println("--------------------------------------------------");
				System.out.println("F|" + compGrid[5][0] + "|" + compGrid[5][1] + "|" + compGrid[5][2] + "|" + compGrid[5][3] + "|" + compGrid[5][4] + "|" + compGrid[5][5] + "|" + compGrid[5][6] + "|" + compGrid[5][7] + "|");
				System.out.println("--------------------------------------------------");
				System.out.println("G|" + compGrid[6][0] + "|" + compGrid[6][1] + "|" + compGrid[6][2] + "|" + compGrid[6][3] + "|" + compGrid[6][4] + "|" + compGrid[6][5] + "|" + compGrid[6][6] + "|" + compGrid[6][7] + "|");
				System.out.println("--------------------------------------------------");
				System.out.println("H|" + compGrid[7][0] + "|" + compGrid[7][1] + "|" + compGrid[7][2] + "|" + compGrid[7][3] + "|" + compGrid[7][4] + "|" + compGrid[7][5] + "|" + compGrid[7][6] + "|" + compGrid[7][7] + "|");
				System.out.println("--------------------------------------------------");
			}
			
		
		
		
		
		
		
		
		public static void fillWithSpaces()
		{
			
			for (int row = 0; row < userGrid.length; row++)
				{
					for (int col = 0; col < userGrid[0].length; col++)
						{
							userGrid[row][col] = "     ";
						}
				}
			
			for (int row = 0; row < compGrid.length; row++)
				{
					for (int col = 0; col < compGrid[0].length; col++)
						{
							compGrid[row][col] = "     ";
						}
				}
			
		}
		
		
	}
