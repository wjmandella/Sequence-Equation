// My solution to the HackerRank.com problem "Sequence Equation."
// https://www.hackerrank.com/challenges/permutation-equation/problem

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SequenceEquationApp {
    static int[] permutationEquation(int[] p) {
       	int [] tempArrayY = new int [p.length];
       	ArrayList<Integer> tempArrayList = new ArrayList<>();

       	for( int a = 0; a < p.length; a++) {
    		tempArrayList.add(p[a]);
    	}  	
       	
    	for(int j = 1; j <= p.length; j++) {    			
    		for(int i = 0; i < p.length; i++) {
    			if(p[i] == j) {
    				System.out.println("p[i]= "+p[i]);
    				tempArrayY[j-1] = tempArrayList.indexOf(i + 1) + 1;
	    			System.out.println("TempArrayY = "+Arrays.toString(tempArrayY));
    			}
    		}
    	}   	    	
    	return tempArrayY;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in the sequence, n (integer 1-50): ");     
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            System.out.print("Enter unique sequence element #"+(p_i +1)+ "(integer 1-50) of "+n+" number of sequence elements: ");  
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
