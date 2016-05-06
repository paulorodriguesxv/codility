
public class Demo {

	public static void main(String[] args) {
		
		int decimalNum = 1024   ;
		int rest = 0;
		int index = -1;
		int groups[] = new int[20];
		int gaps = 0;
		
		while (decimalNum > 0){
			rest = decimalNum % 2;
			decimalNum /= 2;
					
			if (rest == 1){
				index += 1;
				continue;
			}
			
			if (index == -1) {
				continue;
			}
			groups[index] += 1;						
		}
		
		for (int i = 0; i < groups.length; i++){
			if (groups[i] > gaps) {
				gaps = groups[i]; 
			}
		}

		System.out.println(gaps);
	}

}
