
public class InfixtoPostfix {
	
/*The method will drop the parentheses in an infix expression and move the operators two
 * spaces to the right, thus converting the expression to postfix. Parentheses appear in 
 * infix expressions only when order of operations need to be specified. There will be no 
 * parentheses in infix expressions where no operator has precedence (ie all addition or all
 * multiplication)
 */
	
	//
public String moveOperatorToTheRight(String InFixExp) {
	
	String InFixExpWOParens = ""; // string to hold the infix expression after parens removed
	String InFixToPostFix = "";// string to hold the converted expression (postfix)
	
	for (int i = 0; i < InFixExp.length(); i++) {//read infix characters into new string w/o parens
		if (InFixExp.charAt(i) != '(' && InFixExp.charAt(i) != ')')
			InFixExpWOParens = InFixExpWOParens + InFixExp.charAt(i);
		}
		System.out.println(InFixExpWOParens);//check that string w/o parens is correct
		
		char [] B = new char[InFixExpWOParens.length()];//array to hold Infix exp w/o parens
		char holder = ' ';//character var to "hold" the operand so it can switch places with opertor
		
		for ( int j = 0; j < InFixExpWOParens.length(); j++)
			B[j] = InFixExpWOParens.charAt(j); // read infix w/o parens into char array
		
		int k =0;// int var to traverse lenght of char array
		
		while (k < B.length)
			if (B[k] == '+' || B[k] == '-' || B[k] == '*' || B[k] =='/' || B[k] == '^') {
				//if position k holds an operator, swap its place with the operand to its right
				holder = B[k];
				System.out.print(holder + ",");//print statements to track the "swap"
				B[k] = B[k + 1];
				System.out.print(B[k] + ",");
				B[k + 1] = holder;
				System.out.println(B[k+1] + ",");
				k = k+2;//increment k by 2 to by pass the operator that was just advanced by 1
			}
			else
				k++;// if position k holds an operand, move to the next position
		
		for (int i = 0; i < B.length; i++)//read array, now in postfix format, into a string
			InFixToPostFix = InFixToPostFix + B[i];
		return InFixToPostFix;
			
	
	}
}//end method
