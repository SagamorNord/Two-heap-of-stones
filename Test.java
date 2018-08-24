import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test{
	static int min = 0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
            int count = scn.nextInt();
            if((count >= 1)& (count <= 20)) {
        	    int[] array = new int[count];
        	    for(int i = 0; i < array.length; i++) {
        		    int w = scn.nextInt();
        		    if((w >= 1) & (w <= 100_000)) {
        			    array[i] = w;
        		    }
        		    else {
            		    System.out.println("¬ведите значени€ от 1 до 100_000");
            		    i--;
                    }
                }
        	    min = getDifference(array);
        	    flag = false;
            }
            else {
        	    System.out.println("¬ведите значени€ от 1 до 20");     	
            }
            System.out.println(min);
		}
	}
	
	public static int getDifference(int[] array) {
    	ArrayList<Integer> result = new ArrayList<>();
    	for(int k = 0; k < array.length; k++) {
    		result.add(different(array));
    		if(k + 1 < array.length) swap(0, k + 1, array);
    	}
    	Collections.sort(result);
    	System.out.println(result.toString());
    	return result.get(0);
    }
    
    public static void swap(int first, int second, int[] array) {
    	int temp = array[first];
    	array[first] = array[second];
    	array[second] = temp;
    }
        
    private static int different(int[] list) {
    	int[] result = new int[list.length];
    	int i, j;
    	int sum1 = 0, sum2 = 0;
    	int diff = 0;
    	for(i = 0; i < list.length; i++) {
    		sum1 += list[i];
    		for(j = i + 1; j < list.length; j++) {
    			sum2 += list[j];
    		}
    		diff = sum2 - sum1;
    		sum2 = 0;
    		result[i] = Math.abs(diff);
    	}
    	Arrays.sort(result);
    	return result[0];
    }
	
}
/*
class Resolve{
	
    public Resolve() {
    }
    public int getDifference(int[] array) {
    	ArrayList<Integer> result = new ArrayList<>();
    	for(int k = 0; k < array.length; k++) {
    		result.add(different(array));
    		if(k + 1 < array.length) swap(0, k + 1, array);
    	}
    	Collections.sort(result);
    	return result.get(0);
    }
    
    public void swap(int first, int second, int[] array) {
    	int temp = array[first];
    	array[first] = array[second];
    	array[second] = temp;
    }
        
    private int different(int[] list) {
    	int[] result = new int[list.length];
    	int i, j;
    	int sum1 = 0, sum2 = 0;
    	int diff = 0;
    	for(i = 0; i < list.length; i++) {
    		sum1 += list[i];
    		for(j = i + 1; j < list.length; j++) {
    			sum2 += list[j];
    		}
    		diff = sum2 - sum1;
    		sum2 = 0;
    		result[i] = Math.abs(diff);
    	}
    	Arrays.sort(result);
    	return result[0];
    }
}
*/
