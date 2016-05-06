import java.util.Arrays;

public class Demo {
	
	public static int[] rotation(int[] A){
		int ALength = A.length;
		int arrayIndex = 0;
		int[] arrayTemp = new int[ALength+1];
		
		arrayTemp[arrayIndex] = A[ALength-1];
		
		for (int i =0; i < ALength-1; i++){
			arrayTemp[++arrayIndex] = A[i];
		}
		
		return Arrays.copyOfRange(arrayTemp, 0, ALength);
	}
    public static int[] solution(int[] A, int K) {
    	

		int[] arrayTemp = new int[A.length];
		
    	if (A.length == 0){
    		return arrayTemp;
    	}		
		
		arrayTemp = A;
		for (int i =0; i < K; i++){
			arrayTemp = rotation(arrayTemp);			
		}
		
		return arrayTemp;
		
    }
	
	public static void main(String[] args) {
		//int[] arrayIn = {5, -1000};	
		int[] arrayIn = {3, 8, 9, 7, 6};
		//int[] arrayIn = {-9, 0};		
		//int[] arrayIn = {};
		//int[] arrayIn = {1, 1, 2, 3, 5};

		int[] arrayOut = solution(arrayIn, 3);
		
		for (int i = 0; i < arrayOut.length; i++){
			System.out.println(arrayOut[i]);
		}
		
	}
}
