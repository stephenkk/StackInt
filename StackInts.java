/* the class implements four methods for managing a stack of 
 * Integers: push, pop, find the top, and see if empty. evalPostfix
 * uses the stack to evaluate postfix arithmetic expressions.
 */

public class StackInts {
	public int top = -1;	//top always has to start at -1
	public int [] A;		//array of ints house the stack
	
	
	
	
	public StackInts(int size) {
		// TODO Auto-generated constructor stub
		A = new int[size];	//initialize array capacity to given size
		
		//end constructor
	}

	public void push (int num) {
		
		top++;		//push onto top by incrementing top
		A[top]=num;
	
	}
	
	public int pop () {
		
		top--;			//decrement top to remove from stack
		return  A[top+1]; //return the "removed" int
	}
	
	public int whereIsTop() {// returns the array index of the top value
		return top;
	}
	
	public boolean stackEmpty() {// determines if stack is empty
		
		if (top == -1)
			return true;
		return false;
	}
	//prints the contents of stack on a single line, each int separated by commas
	public void printStack(int [] A) {
		for (int i = 0; i <= top; i++)
			System.out.print(A[i]+ ",");
		
		System.out.println();
	}
	
	public int evalPostfix (String postFixExp) {
		//the for loop iterates through each char in the string, postFixExp,
		//format must be ints and operators, with a minimum of 
		//one operator and n + 1 ints. String must begin with 
		//two ints in a row.
		for(int i = 0; i < postFixExp.length(); i++) {
			char ch = postFixExp.charAt(i);
			
			// if statement checks if charAt is an operator or int. 
			//if ch is an int it gets pushed onto the stack
			if ((ch != '+') && (ch != '-') && (ch != '*') && (ch != '/') && (ch != '^'))
				push(ch - '0'); //easy way to convert char to int
			else {
				//if charAt is an operator, pop twice, apply the operator to the 
				//operands and push result onto stack
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
			 {// in case of exponent, create int var to hold b,
				 //the number of times an int should be multiplied
				 //itself
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
		return A[top]; //after all operations are applied, all
		//original operands will have been popped. The result will
		//be the only in the stack.
	}
	
	
}
