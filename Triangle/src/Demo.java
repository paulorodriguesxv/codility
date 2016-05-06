import java.util.Arrays;

public class Demo {

	public static int solution(int[] A){
		
		if ((A.length < 3) || (A.length > 100000)){
			return 0;
		};
		
		Arrays.sort(A);
		
		int P, Q, R = 0;
		for (int i = 0; i<A.length - 2; i++){
			P = A[i];
			Q = A[i+1];
			R = A[i+2];

			// overflow warning
			// P = 2147483647
			// Q = 2147483647
			// then, P + Q = overflow
			if ((P>0) && (P > R - Q)){
				return 1;								
			}
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arrayOne = {10,2,5,1,8,20}; 
		//int[] arrayOne = {5,3,3}; 
		
		int[] arrayOne = {2147483647, 2147483647, 2147483647};

		System.out.println(solution(arrayOne));
	}

}
