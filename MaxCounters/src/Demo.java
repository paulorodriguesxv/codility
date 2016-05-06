
public class Demo {

	public static int[] solution(int N, int[] A){
		
		int[] counter = new int[N];
        int max = -1;
        int current_min = 0;
        
		for (int iArray = 0; iArray < A.length; iArray++){
			if(A[iArray]>=1 && A[iArray]<= N){
				
                if (counter[A[iArray] - 1] < current_min) {
                	counter[A[iArray] - 1] = current_min;
                }
                counter[A[iArray] - 1] += 1;
                
                if (counter[A[iArray] - 1] > max) {
                	max = counter[A[iArray] - 1];
                }
            }
            else if ( A[iArray] == N+1 ){
                current_min = max;
            }			
		}
		
		for (int iArray = 0; iArray < N; iArray++){
            if(counter[iArray] < current_min) {
            	counter[iArray] =  current_min;
            }
        }
        
		return counter;
	}
	public static void main(String[] args) {
		
		int[] arrayOne = {3,4,4,6,1,4,4};
	    int[] result = solution(5, arrayOne );
	    
	    for (int i = 0; i<result.length; i++){
	    	System.out.println(result[i]);
	    }
	}

}
