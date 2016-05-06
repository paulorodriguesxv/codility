
public class Demo {

	public static int solution(int[] A){
		int[] arrayTemp = new int[A.length + 2];
		
		for (int i=0; i < A.length; i++){
			arrayTemp[A[i]] = -999;
			
			//System.out.println(A[i]); 
		}
		
		for (int i=1; i < arrayTemp.length ; i++){

			if (arrayTemp[i] != -999){
				return i ;
			};
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {1, 6, 5, 3, 4};
		System.out.println(solution(arrayOne));
	}

}
