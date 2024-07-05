package lab2_2;


public class Lab2_2 {

	public static void main(String[] args) {
		final int SIZE = 5;
		
		int[][] grid = new int[SIZE][SIZE];
		for(int i = 0; i < SIZE ; i++) {
			for(int j = 0; j< SIZE ; j++) {
				grid[i][j] = i * SIZE + j +1;
			}
		}

		System.out.println("Display Transpost Array : ");
		for(int j=0;j<SIZE;j++) {
			for(int i =0;i<SIZE;i++) {
				System.out.printf("%2d",grid[i][j]);
				System.out.printf("\t");
				}
				System.out.println();

		}
		System.out.println();
		
		System.out.println("Display Array Right : ");
		int j = 0;
		for(int i = 0; i < SIZE ;i++) {
			if(i % 2 == 0) {
				for(j = 0; j < SIZE ; j ++) {
					System.out.printf("%2d",grid[i][j]);
					System.out.printf("\t");

				}
				System.out.println();
			}
			if((i % 2) != 0) {
				for(j=SIZE-1;j>=0;j--) {
					System.out.printf("%2d",grid[i][j]);
					System.out.printf("\t");
				}
				System.out.println();
			}
		}
	}
}
