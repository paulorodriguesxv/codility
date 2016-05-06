
public class Demo {

	public static boolean matchParenteheses(char leftPar, char rightPar){
		if ((leftPar == '{') && (rightPar == '}')){
			return true;
		}	
		if ((leftPar == '[') && (rightPar == ']')){
			return true;
		}	
		if ((leftPar == '(') && (rightPar == ')')){
			return true;
		}			
		
		return false;
	}
	
	public static int solution(String S){
		
		char[] stackArray = new char[S.length()];
		int top = -1;
		
		if (S.length() == 0){
		    return 1;
		}
		
		if (S.length() > 200000){
		    return 0;
		}
		
		for (int i=0; i<S.length(); i++){
			char strAt = S.charAt(i);
			
			if ((strAt == '{') || (strAt == '[') || (strAt == '(') ){
				stackArray[++top] = S.charAt(i); 
			}
			
			if ((strAt == '}') || (strAt == ']') || (strAt == ')') ){
				
				if ((top < 0) || (top >= stackArray.length -1)) {
					return 0;
				}
				if ((top < 0) && ((i != S.length()-1))){
					return 0;
				}
	
				if (!matchParenteheses(stackArray[top], strAt)){
					return 0;
				}
				else{
				  top--;
				}
				
				
			}			
		}
		 
		if (top == -1) {
			return 1;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(solution( "()()()()()(()"));
		System.out.println(solution( "{{{{"));
		//System.out.println(solution( "{[()()]}"));
		
		//System.out.println(solution( "()(()())((()())(()()))"));

	}

}
