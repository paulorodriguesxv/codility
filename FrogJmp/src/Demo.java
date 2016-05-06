
public class Demo {

	public static int solution(int X, int Y, int D) {
		return  (int)Math.ceil( (double)(Y-X) / D);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10, 85, 30));
	}

}
