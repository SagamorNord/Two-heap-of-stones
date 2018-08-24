
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Resolve{
	
    public Resolve() {
    }
    public int getDifference(int[] array) {
    	ArrayList<Integer> result = new ArrayList<>();
    	for(int k = 0; k < array.length; k++) {
    		result.add(different(array));
    		if(k + 1 < array.length) swap(0, k + 1, array);
    	}
    	Collections.sort(result);
    	System.out.println(result.toString());
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
