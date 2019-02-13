
public class TestIntoPostConv {
	
	public static void main(String[] args) {
		String InFixExp = "(5+2+2)/6";
		
		
		
		
			InfixtoPostfix stacker = new InfixtoPostfix();//create object to call conversion method
		
			System.out.println(stacker.moveOperatorToTheRight(InFixExp));
		
	}

}
