import java.util.*;
public class Array2D{
	public static void main(String[] rt){
		Scanner sc= new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][]numbers = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				numbers[i][j]=sc.nextInt();
				
			}
		}
		
		int x=sc.nextInt();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(x==numbers[i][j]){
					System.out.println("x found at :"+i+" "+j);
				}
			}
		}
	}
}