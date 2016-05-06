
public class Demo {

    public static int solution(int X, int[] A) {
    	int leaves = X;
    	int[] positions = new int[leaves+1];
    	
        for (int i=0; i<A.length; i++){
        	if (positions[A[i]] == 0){
        		positions[A[i]] = 1;
        		leaves -= 1;
        	}
        	
        	if(leaves == 0) return i;        	
        }
    	
    	return -1;
    }
	public static void main(String[] args) {
		int [] arrayOne = {1,3,1,4,2,3,5,4};
		int [] arrayTwo = {1};
		int [] arrayThree = {3};
		
		System.out.println(solution(1, arrayTwo));
	}

}
