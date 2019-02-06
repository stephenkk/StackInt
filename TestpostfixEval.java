
public class TestpostfixEval {

	public static void main(String[] args) {
		String postFixExp = "4223+5^7+/-";
		
		StackInts stacker1 = new StackInts(postFixExp.length()-1);
		
		
		
		System.out.println(stacker1.evalPostfix(postFixExp));
	}

}
