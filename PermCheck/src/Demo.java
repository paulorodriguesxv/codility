
public class Demo {

    public static int solution(int[] A) {
       int sumSize = A.length;
       int[] countArray = new int[sumSize];
       
       
       for (int i = 0; i < sumSize; i++){
    	   
    	   if (A[i] <1 ){
    		   return 0;
    	   }

    	   if (A[i] > sumSize){
    		   return 0;
    	   }
    	   
    	   if (countArray[A[i] - 1] == 1){
    		   return 0;
    	   }
    	   
    	   countArray[A[i] - 1] = 1; 
    	   
       }
       return 1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {4, 1, 2 ,3};
		int[] arrayTwo = {1, 4, 1};
		int[] arrayThree = {2, 2, 2};
		int[] arrayFour = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};

		
		System.out.println(solution(arrayOne));
	}

}
