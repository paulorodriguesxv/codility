
public class Demo {

	public static int solution(int A[]) {
		
		int beforeP = 0;
		int afterP = 0;
		int value = 0;
		int total = 0;
		int minimalValue = 9999;
		
		for (int i = 0; i < A.length; i++){
			total += A[i];
		}
		
		for (int i = 0; i < A.length -1; i++){
			beforeP += A[i];
			afterP = total - beforeP;
			value = Math.abs(afterP - beforeP);
			
			if (value <minimalValue){
				minimalValue = value;
			}			
		}
		
		return  minimalValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arrayOne = {3,1,2,4,3};
		int[] arrayTwo = {-1000, 1000};
		System.out.println(solution(arrayTwo));
	}

}
