
public class Exercise5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rollDice();				
	}		
		
		public static void rollDice() {
			int dice1 = 1 + (int)(Math.random() * 6);
			int dice2 = 1 + (int)(Math.random() * 6);
			int sum = dice1 + dice2;
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
			craps(dice1, dice2, sum);			
		}
		
		public static int additionalRoll() {
			int dice1 = 1 + (int)(Math.random() * 6);
			int dice2 = 1 + (int)(Math.random() * 6);
			int sum = dice1 + dice2;
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
			return sum;
		}
		
		public static void craps(int x, int y, int z) {
			if (isCraps(x, y, 2, 3, 12 )) {
				System.out.println("You lose");
			}
			else if (isNatural(x, y, 7, 11)) {
				System.out.println("You win");
			}
			else {
				int point = z;
				System.out.println("point is " + z);
				do {
					z = additionalRoll();
				} 
				while (z != 7 && z != point);
			
				if (z == 7) {
					System.out.println("You lose");
				}
				else {
					System.out.println("You win");	
				}
			}
		}			
				
		public static boolean isCraps(int a, int b, int i, int j, int k) {
			return (a + b == i) || (a + b == j) || (a + b == k);
		}
		
		public static boolean isNatural(int a, int b, int i, int j) {
			return (a + b == i) || (a + b == j);
		}
		
	}
