package WednesdayReview;

public class march27 {

	public static void main(String[] args) {
		//Write a program
		
		int [][] arr= {{1, 2, 3}, {4, 5, 6,9}, {7,8}};
			for(int i=0; i<arr.length; i++) {
				System.out.println("The length of row " + (i +1) + " = "+arr[i].length);
			}

			
			
			
			
			
		int [][] ar={{1, 2, 3}, {4, 5, 6,9}, {7,8}};
		
		for(int j=0; j<ar.length; j++) {
			for(int b=0; b<ar[j].length; b++) {
				System.out.println(ar[j][b]+" ");
			}
		}
		
		
		//Using a for loop
		
		for(int[] inn: ar) {
			for(int elements: inn) {
				System.out.print(elements);
			}
		}
		
//      Write a program to find the average of row 2.
//     2 6 9 3 7
//     1 7 9 4 8
//     0 4 6 2 5
//     0 1 2 3
int[][] rating = { 
		{ 2, 6, 9, 3, 7 }, 
		{ 1, 7, 9, 4, 8 }, 
		{ 0, 4, 6, 2, 5 },
		{ 0, 1, 2, 3 } 
		
};
		double sum=0; 
		
		
		for(int i=0; i<rating[1].length; i++) {
			sum+=rating[1][i];
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
