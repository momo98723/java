
public class practice3 {

	public static void main(String[] args) {
		int[][] arr= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total=0;
		float average = 0;
		int ROW= arr.length;
		int COL= arr[0].length;
		for (int i=0; i<ROW; i++)
			for(int j=0; j<COL; j++)
				total += arr[i][j];
				average = total/(float)(ROW*COL);
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}
