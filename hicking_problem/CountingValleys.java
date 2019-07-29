import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import static java.lang.System.out; 

public class CountingValleys { 
	public static void main(String[] args){
		//int n = 12;
		//String s = "DDUUDDUDUUUD";
		//int solution = 2;
		int n = 8;
		String s = "UDDDUDUU";
		int solution = 1;
		int valleys = countingValleys(n,s);
		if (valleys == solution){
			System.out.println("Pass!");
		}
		else {
			System.out.println("Fail");
		}
	}

	private static int countingValleys(int n, String s){
		int valleys = 0;
		int level[] = new int [n];
		int currLevel = 0;
		int valleyLevel[] = new int [2];
		for (int step = 0 ; step < n ; step++){
		 	if ('D' == s.charAt(step)){
				currLevel--;
			}
			if ('U' == s.charAt(step)){
				currLevel++;
			}
			level[step] = currLevel;
			out.println(level[step]);
			if ((currLevel == 0) ){
				if (level[step-1] <= 0 ){
					valleys++;
				}
			}
			
		}

		out.println("total: "+(1+valleys/2)) ;
		
		return 1+valleys/2;
	}
}
