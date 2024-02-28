package hw0124;

public class ForHomeWork {

	public static void main(String[] args) {
		
//----------------------Quiz 1-1--------------------------------
		System.out.println("# Quiz1-1");
		for(int row = 1; row < 6; row++) {
			for(int col = 1; col <= row; col++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		
		
//----------------------Quiz 1-2--------------------------------
		System.out.println("# Quiz1-2");
		for(int row = 5; row > 0; row--) {
			for(int col = 1; col <= row; col++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		
//----------------------Quiz 1-3--------------------------------	
		System.out.println("# Quiz1-3");
		int a = 1;
		for(int row = 5; row > 0; row--) {
			for(int col = 1; col < row; col++) 
				System.out.print("  ");
			
			for(int star = 1; star <= a; star++) 
				System.out.print("* ");
			
			a++;
			System.out.println();
		}
		
		System.out.println();
		
//----------------------Quiz 1-4--------------------------------
		System.out.println("# Quiz1-4");
		int b = 5;
		for(int row = 0; row < 6; row++) {
			for(int space = 0; space < row; space++) 
				System.out.print("  ");
			
			for(int col = b - row; col > 0; col--)
				System.out.print("* ");
			
			System.out.println();
		}
		
		
//----------------------Quiz 2-1--------------------------------
		System.out.println("# Quiz2-1");
		for(;;) {
			int first = (int)(Math.random()*6 + 1);
			int second = (int)(Math.random()*6 + 1);
			System.out.print("(" + first + " , " + second + ") ");
			if(first + second == 5) break;
		}
		
		System.out.println();
		System.out.println();
		
//----------------------Quiz 2-2--------------------------------
		System.out.println("# Quiz2-2");
		for(int x = 1; x < 11; x++) {
			for(int y = 1; y < 11; y++) 
				if(4*x + 5*y == 60) System.out.print("(" + x + " , " + y + ") ");
		}

	}

}
