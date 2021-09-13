package codingTest.practice.sort;

import java.util.HashSet;
import java.util.Set;

public class MaxNumber {

	public static void main(String[] args) {
		
		MaxNumber test = new MaxNumber();
		
		int[] numbers = {6,10,2};
		test.solution(numbers);
	}
	
    public String solution(int[] numbers) {
        String answer = "";
        
        //[6,10,2]3x2x1
        //0 + 1 + 2 : 6102
        //0 + 2 + 1 : 6210
        //1 + 0 + 2 : 1062
        //1 + 2 + 0 : 1026
        //2 + 0 + 1 : 2610
        //2 + 1 + 0 : 2106
        
        //[0,1]2x1
        // 0 + 1
        // 1 + 0
        
        //[1,2,3,4] 4x3x2x1
        //
        int count = 1;
        
        for(int i = numbers.length; i > 1; i--) {
        	count = count*i;
        }
        
        HashSet<HashSet<Integer>> indexList = new HashSet<>();
        System.out.println(indexList);
        while(indexList.size() < count) {
        	
        	HashSet<Integer> index = new HashSet<>();
        	System.out.println("5555555555555" + index.size());
        	while(index.size() < numbers.length) {
        		
        		int num =  (int)(Math.random() * numbers.length);
        		System.out.print(num);
        		System.out.println();
        		index.add(num);
        		
        		System.out.println("index 는? " + index);
        		System.out.println("=====================" + index.size());
        	}
        	System.out.println("======바깥세상");
        	indexList.add(index);
        	System.out.println(indexList);
        	System.out.println("indexList의 크기" + indexList.size());

        }
        
        String b = "";
        
        for(int i = 0; i< numbers.length; i++) {
        	b = b+numbers[i];
        }
        
        System.out.println(b.length());
        
//        while(numberList.size() < numbers.length) {
//        }
        return answer;
    }
}
