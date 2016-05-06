
public class Demo {

		/*
    public static int solution(int[] A) {
        int sumSize = A.length;
        
        int min = A[0];
        int max = A[0];
        
        for (int i = 1; i < sumSize; i++){
        	if (A[i] < min){
        		min = A[i];
        	}
        	
        	if (A[i] > max){
        		max = A[i];
        	}        	
        }

        int[] countArray = new int[max+1];
       
        for (int i = 0; i < sumSize; i++){
        	countArray[A[i]] = 1;
        }
        
        for (int i = min; i < max; i++){
        	if (countArray[i] == 0){
        		return i;
        	}
        }
        
        return -1;
     }
    */
	
    public static int solution(int[] A) {
        int sumSize = A.length;
        boolean[] numbers = new boolean [sumSize+1];
        
        
        for (int i = 0; i < sumSize; i++){
        	if ((A[i] > 0)  && (A[i] <= sumSize) && (numbers[A[i] - 1] == false)){
        		numbers[A[i] -1 ] = true;
        	};
        }        

        for (int i = 0; i < numbers.length; i++){
        	if (numbers[i] == false){
        		return i + 1;
        	};
        }         
        return -1;
     }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {1};
		int[] arrayTwo = {1, 4, 1};
		int[] arrayThree = {4, 5, 6, 2};
		int[] arrayFour = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
		int[] arrayFive = {-1};
		int[] arraySix = {1,3,6,4,1,2};
		
		System.out.println(solution(arrayThree));

	}

}
