
public class TestInFixtoPostFix {

	public static void main(String[] args) {
		
		String inFixExp = "2+3*4";
		
		StackChars stacker = new StackChars(inFixExp.length());
		
		System.out.println(stacker.inFixtoPostFix(inFixExp));


	}

}
