
public class TestStackInts {
	
	public static void main(String[] args) {
		
		
		int size = 7;
		StackInts stacker = new StackInts(size);
		
		System.out.println(stacker.whereIsTop());
		
		
		System.out.println(stacker.stackEmpty());
		
		
		
		stacker.push(5);
		stacker.push(12);
		System.out.println(stacker.whereIsTop());
		
		stacker.push(7);
		stacker.push(34);
		stacker.push(116);
		
		for (int i = 0;  i <= stacker.top; i++)
			System.out.println(stacker.A[i]);
		System.out.println(stacker.stackEmpty());
		System.out.println(stacker.pop());
		for (int i = 0;  i <= stacker.top; i++)
			System.out.println(stacker.A[i]);

		
		

	}

}
