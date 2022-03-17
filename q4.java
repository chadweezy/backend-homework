
import java.io.*;
import java.util.*;
public class q4 {
	public static void main(String[] args) {
		//testing code in main
		System.out.print(valid_parentheses("(()hi())"));
	}
	public static boolean valid_parentheses(String par_string) {
		// utilize stack to track parentheses
		Stack<Character> stacky = new Stack<>();
		// if the first character is ) or the last character is  ( the statement is invalid
		if(par_string.charAt(0) == ')' && par_string.charAt(par_string.length()) == '(' ) 
			return false;
		int i=0;
		//loop through string adding ( to stack and removing when counterpart ) is found
		while(i<par_string.length()) {
		if(par_string.charAt(i) == '(')
			stacky.push(par_string.charAt(i));
		else if(par_string.charAt(i) == ')'){
			if(stacky.empty())
				return false;
			else stacky.pop();}
		i++;
		}
		//System.out.print(stacky.size());
		if(stacky.empty())
		return true;
		else return false;
	}
}
