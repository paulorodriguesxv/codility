
public class Demo {

	public static int solution(int[] A){
		int countEast = 0;
		int countPass = 0;
		int maxValue = 1000000000;
		
		for (int i=0; i < A.length; i++){
			if (countPass > maxValue){
				return -1;
			}
			
			if (A[i] == 1){
				countPass += countEast;
			} else{
				countEast++;
			}
		}
		
		return countPass;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {0,1,0,1,1};
		System.out.println(solution(arrayOne));
	}

}
