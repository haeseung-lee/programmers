package codingTest.practice.skillCheckTest;

import java.util.ArrayList;

import java.util.List;

public class Level1Question3 {

	
	public static void main(String[] args) {
		
		Level1Question3 test = new Level1Question3();
		
		int[] arr = {1,1,1,1,1};
		
		System.out.println(test.solution(arr));
	}
	
    public int[] solution(int []arr) {
        

    	List test = new ArrayList();
    	
    	for(int i = 0; i < arr.length; i++) {
    		
    		if(i == arr.length-1) {
    			
    			if(test.size() == 0) {
    				test.add(arr[i]);
    			} else if((Integer)test.get(test.size()-1) != arr[arr.length-1]) {
    				test.add(arr[arr.length-1]);
    			}
    			break;

    		}
    		if(arr[i] != arr[i+1]) {
    			test.add(arr[i]);
    		}
    	}
    	
    	int[] answer = new int[test.size()];
    	for(int i=0; i < test.size(); i++) {
    		
    		answer[i] = (Integer)test.get(i);
    		
    	}
        return answer;
    }
}
