import java.util.*;

public class Snake_In_Matrix {
	int x =0;
	List<Integer> sort = new ArrayList<Integer>();
	List<Integer> check = new ArrayList<Integer>(sort.size());
	
	public Snake_In_Matrix() {
		for(int i: check) {
			check.add(i);
		}
	}
	
	public void getSnake(int[][] grid){
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				int a1 = grid[i][j];
				int b1 = 11; int c1 = 11; int d1 = 11;
				
				if(j+1 <4)
					b1 = grid[i][j+1];
				if((j+1 <4) && (i+1 <4))
					c1 = grid[i+1][j+1];
				if(i+1 <4)
					d1 = grid[i+1][j];
				
				int x11 = a1-b1; int x21 = a1-c1; int x31 = a1-d1;
				if(Math.abs(x11) == 1 || Math.abs(x21) == 1 || Math.abs(x31) == 1)
					sort.add(a1);
				System.out.println("Snake is :: " + call(i,j, grid));
				if(check.size() < sort.size()) {
					check = sort;
					Collections.copy(check, sort);
				}
				sort.clear();
			}
		}
		
		System.out.println("The final Big Snake is : "+ check);
	}
	public List<Integer> call(int i, int j, int[][] grid){
		int a = grid[i][j];
		int b = 11; int c = 11; int d = 11;
		
		if(j+1 <4)
			b = grid[i][j+1];
		if((j+1 <4) && (i+1 <4))
			c = grid[i+1][j+1];
		if(i+1 <4)
			d = grid[i+1][j];
		
		int x1 = a-b; int x2 = a-c; int x3 = a-d;
		if(Math.abs(x1) == 1){
			//sort.add(a); 
			sort.add(b);
			if(j+1 <4) {
				call(i, j+1, grid);
				
			}
		}
		if(Math.abs(x2) == 1){
			//sort.add(a); 
			sort.add(c);
			if((j+1 <4) && (i+1 <4)) {
				call(i+1, j+1, grid);
			}
		}
		if(Math.abs(x3) == 1){
			//sort.add(a); 
			sort.add(d);
			if(i+1 <4) {
				call(i+1, j, grid);
			}
		}
		System.out.println("*** => " + sort);
		return sort;
	}
	public static void main(String[] args) {
		Snake_In_Matrix snake = new Snake_In_Matrix();
		int[][] grid = {
			{5, 3, 2, 4},
			{4, 3, 1, -1},
			{2, 1, 0, -1},
			{6, 0, 7, 0}
		};
		/*int[0][0] = 5; int[0][1]=3; int[0][2]=2; int[0][3]=4;
		int[1][0] = 4; int[1][1]=3; int[1][2]=1; int[1][3]=-1;
		int[2][0] = 2; int[2][1]=1; int[2][2]=0; int[2][3]=-1
		int[3][0] = 6; int[3][1]=0; int[3][2]=7; int[3][3]=0; */
		snake.getSnake(grid);
	}
}