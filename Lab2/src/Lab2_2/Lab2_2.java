package Lab2_2;

public class Lab2_2 {
	public static void main(String[] args) {
		int i,j;
		final int SIZE = 5;
		int [][]grid = new int[SIZE][SIZE];
		for(i = 0;i < SIZE ;i++) {
			for(j=0;j < SIZE ;j++) {
				grid[i][j] = i * SIZE + j +1;
			}
		}
		//Left
		for(i =0 ; i< SIZE ;i++) {
			for(j = 0;j<SIZE;j++){
				System.out.print(grid[j][i]);
				if(j!=SIZE-1) {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		
		for(i=0;i<SIZE;i++) {
			if(i%2==0) {
				for(j=0;j<SIZE;j++) {
					System.out.print(grid[i][j]+" ");
					if(j!=SIZE-1) {
						System.out.print("\t");
					}
				}
				System.out.println();
			}else {
				for(j=SIZE-1;j>=0;j--) {
					System.out.print(grid[i][j]+" ");
					if(j!=0) {
						System.out.print("\t");
					}
				}
				System.out.println();
			}
		}
	}
}
