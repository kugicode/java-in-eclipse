
public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] dailyTemperatures = {18, 22, 25, 21, 28, 26, 23};
//		int value = dailyTemperatures[0]; // Start with the first temperature
//		for(int i = 0; i < dailyTemperatures.length; i++) {
//			int temp = dailyTemperatures[i];
//			if(temp > value) {
//				value = temp;
//			}
//			
//		}
//		System.out.println("This is the heighest temperature! " + value);
		
		int [][] grid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		for(int i = 0; i < grid.length; i++) {
			for(int a = 0; a < grid[i].length; a++) {
				int num = grid[i][a];
				if(num == 5) {
					System.out.println("We found 5!");
				}
			}
		}
		
		
	}

}
