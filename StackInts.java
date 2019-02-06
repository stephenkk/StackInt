

public class StackInts {
	public int top = -1;
	public int [] A;
	
	
	
	
	public StackInts(int size) {
		// TODO Auto-generated constructor stub
		A = new int[size];
		
	}

	public void push (int num) {
		
		top++;
		A[top]=num;
	
	}
	
	public int pop () {
		
		top--;
		return  A[top+1];
	}
	
	public int whereIsTop() {
		return top;
	}
	
	public boolean stackEmpty() {
		
		if (top == -1)
			return true;
		return false;
	}
	
	public void printStack(int [] A) {
		for (int i = 0; i <= top; i++)
			System.out.print(A[i]+ ",");
		
		System.out.println();
	}
	
	public int evalPostfix (String postFixExp) {
		for(int i = 0; i < postFixExp.length(); i++) {
			char ch = postFixExp.charAt(i);
			if ((ch != '+') && (ch != '-') && (ch != '*') && (ch != '/') && (ch != '^'))
				push(ch - '0');
			else {
				if (ch == '+') {
					printStack(A);
					int a = pop();
					printStack(A);
					System.out.println(a);
					int b = pop();
					printStack(A);
					System.out.println(b);
					push (a+b);
					printStack(A);
				}
				
				
				if (ch == '-') {
					printStack(A);
					int a = pop();
					printStack(A);
					System.out.println(a);
					int b = pop();
					printStack(A);
					System.out.println(b);
					push (a-b);
				}
			
					if (ch == '*') {
						printStack(A);
						int a = pop();
						printStack(A);
						System.out.println(a);
						int b = pop();
						printStack(A);
						System.out.println(b);
						push (a*b);
					}
				
			 
					if (ch == '/') {
						printStack(A);
						int a = pop();
						printStack(A);
						System.out.println(a);
						int b = pop();
						printStack(A);
						System.out.println(b);
						push (a/b);
					}
				}
			 {
					if (ch == '^') {
						printStack(A);
						int a = pop();
						printStack(A);
						System.out.println(a);
						int b = pop();
						printStack(A);
						System.out.println(b);
						int c = b;
						while (a>1) {
							b = b * c;
							a--;
						}
						printStack(A); 
						push(b);
					}
				}
			}
		return A[top];
	}
	
	
}
