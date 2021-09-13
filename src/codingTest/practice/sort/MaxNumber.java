package codingTest.practice.sort;

import java.util.ArrayList;
import java.util.Collections;

public class MaxNumber {

	public static void main(String[] args) {
		
		MaxNumber test = new MaxNumber();
		
		int[] numbers = {10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		test.solution(numbers);
	}
	
    public String solution(int[] numbers) {
        String answer = "";
        
        System.out.println("숫자목록");
        
        for (int i : numbers) {
			System.out.print(i + " ");
		}
        System.out.println();
        
        int count = 1;
        
        for(int i = numbers.length; i > 1; i--) {
        	count = count*i;
        }
        
        System.out.println(count);
        
        ArrayList<ArrayList<Integer>> indexList = new ArrayList<>();
        
        while(indexList.size() < count) {
        	
        	ArrayList<Integer> index = new ArrayList<>();
        	
        	while(index.size() < numbers.length) {
        		
        		int num =  (int)(Math.random() * numbers.length);
        		
        		if(!index.contains(num)) {
        			
        			index.add(num);
        		}
        	}
        	
        	if(!indexList.contains(index)) {
        		indexList.add(index);
        		System.out.println(indexList);
        	}
        	
        }
        
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = 0; i< indexList.size(); i++) {
        	String number = "";
        	
        	for(int j = 0; j < indexList.get(i).size(); j++) {
        		number = number+numbers[indexList.get(i).get(j)];
        		
        	}
        	
        	numberList.add(Integer.parseInt(number));
        }
        
        Collections.sort(numberList);
        
        answer = numberList.get(numberList.size()-1).toString();
        
        System.out.println("가장큰수는? : " + answer);
        return answer;
    }
}
