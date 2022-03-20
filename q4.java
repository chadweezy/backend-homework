
import java.io.*;
import java.util.*;
public class q4 {
	public static void main(String[] args) {
		//valid_parentheses("h(i");
		System.out.print(valid_parentheses("()hi)("));
	}
	public static boolean valid_parentheses(String par_string) {
		// utilize counter to track parentheses
		int cnt =0;
		// if the first character is ) or the last character is  ( the statement is invalid
		if(par_string.charAt(0) == ')' || par_string.charAt(par_string.length()-1) == '(' ) 
			return false;
		int i=0;
		//loop through string adding ( to count and removing when counterpart ) is found
		while(i<par_string.length()) {
		if(par_string.charAt(i) == '(')
			cnt++;
		else if(par_string.charAt(i) == ')'){
			if(cnt <= 0)
				return false;
			else cnt --;}
		i++;
		}
		if(cnt == 0)
		return true;
		else return false;
	}
}
