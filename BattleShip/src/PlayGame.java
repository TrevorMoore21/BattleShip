import java.util.Scanner;

public class PlayGame
	{
		static Scanner userStringInput = new Scanner(System.in);
		static int playerShips;
		
		static boolean gameNotFinished = true;
		
		public static void main(String[] args)
			{
				greetPlayer();
				Grid_And_Spaces.fillWithSpaces();
				Grid_And_Spaces.displayUserGrid();
				Grid_And_Spaces.fillWithSpaces();
				Grid_And_Spaces.displayComputerGrid();
				//deployPlayerShips();
//				hardUserShips();
				while(gameNotFinished)
					{
						userAttack();
						Grid_And_Spaces.displayComputerGrid();
					}
			}
				
				public static void greetPlayer()
				{
			
				System.out.println("Shall we play a game?");
				String response1 = userStringInput.nextLine();
				
				if (response1.equals("No") || response1.equals("no"))
					{
						System.out.println("Leave while you still can");
						System.exit(0);
					}
				if (response1.equals("Yes") || response1.equals("yes"))
					{
				System.out.println("I am not as intelligent as the AI, Joshua, from War Games, but my game of choice is Battleship.");
					}

					
				}
				
//				public static void deployPlayerShips()
//				{
//					System.out.println("You have 7 ships to deploy. Please enter a coordinate.");
//					String userShips = userStringInput.nextLine();
//					
//					
//					for (int i = 0; i <= 7; i ++)
//						{
//							if (userShips.equals("A1"))
//								{
//									userGrid[0][0] = "ship";
//									System.out.println();
//								}
////							
////						}
//					
//				}
				
				
//				public static void hardUserShips()
//				{
//					
//					userGrid[1][2] = "ship1";
//					userGrid[3][0] = "ship2";
//					userGrid[4][7] = "ship3";
//					userGrid[6][2] = "ship4";
//					userGrid[5][2] = "ship5";
//					userGrid[0][5] = "ship6";
//					userGrid[7][6] = "ship7";
//					
//				
//					
//				}
				
				
				public static void userAttack()
				{
					
					System.out.println("Enter Coordinates for your first attack (e.g. A1).");
					String attack = userStringInput.nextLine();
					
					int row = 0;
					int col = 0;
					
					switch(attack.substring(0,1))
					{
						case "A":
						case "a":
								{
									row = 0;
									break;
								}
						case "B":
						case "b":
								{
									row = 1;
									break;
								}
						case "C":
						case "c":
								{
									row = 2;
									break;
								}
						case "D":
						case "d":
								{
									row = 3;
									break;
								}
						case "E":
						case "e":
								{
									row = 4;
									break;
								}		
						case "F":
						case "f":
								{
									row = 5;
									break;
								}		
						case "G":
						case "g":
								{
									row = 6;
									break;
								}		
						case "H":
						case "h":
								{
									row = 7;
									break;
								}		
					}
					
					col = Integer.parseInt(attack.substring(1))-1;
					
					
					if (row == 1 && col == 4)
						{
					Grid_And_Spaces.compGrid[row][col] = "HIT!!";
						}
					else if (row == 2 && col == 0)
						{
					Grid_And_Spaces.compGrid[row][col] = "HIT!!";
						}
					else if (row == 4 && col == 7)
						{
					Grid_And_Spaces.compGrid[row][col] = "HIT!!";
						}
					else if (row == 3 && col == 5)
						{
					Grid_And_Spaces.compGrid[row][col] = "HIT!!";
						}
					else if (row == 5 && col == 7)
						{
					Grid_And_Spaces.compGrid[row][col] = "HIT!!";
						}
					else if (row == 0 && col == 6)
						{
					Grid_And_Spaces.compGrid[row][col] = "HIT!!";
						}
					else if (row == 7 && col == 5)
						{
					Grid_And_Spaces.compGrid[row][col] = "HIT!!";
						}
					else 
						{
							Grid_And_Spaces.compGrid[row][col] = "UMiSS";
						}
				}
				
				
				
				
	}













