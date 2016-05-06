
public class Demo {
	

    public static int solution(int[] A) {
    	
	  int unPairedNum = A[0];
	  for (int i = 1; i < A.length; i++) {
	   unPairedNum = unPairedNum ^ A[i];
	  }
	  return unPairedNum;
		
    }
	
	public static void main(String[] args) {
		//int[] arrayIn = {5, -1000};	
		//int[] arrayIn = {3, 8, 9, 7, 6};
		//int[] arrayIn = {-9, 0};		
		//int[] arrayIn = {};
		int[] arrayIn = {3, 3, 1};

		System.out.println(solution(arrayIn)); 

		
	}
}
