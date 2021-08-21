package codingTest.practice.fullSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class MockTest {
	
	//3명이 있다.
	//1번이 찍는 방식 -> 1,2,3,4,5,1,2,3,4,5...(5개 주기로 반복)
	//2번이 찍는 방식 -> 2,1,2,3,2,4,2,5,2,1,2,3,...(8개주기 반복)
	//3번이 찍는 방식 -> 3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,,4,5,5,...(10개 주기로 반복)
	
	public static void main(String[] args) {
	
		MockTest test = new MockTest();
		
		int[] answers = {1,1,1,1,1,1,2,4};
		
		
		
		for (int i : test.solution(answers)) {
			 System.out.println(i);
		}
	}
	
    public int[] solution(int[] answers) {
	
    	int student1AnswerCount = 0;
    	int student2AnswerCount = 0;
    	int student3AnswerCount = 0;

    	int[] student1Answer = {1,2,3,4,5};
    	int[] student2Answer = {2,1,2,3,2,4,2,5};
    	int[] student3Answer = {3,3,1,1,2,2,4,4,5,5};
    	for(int i = 0; i < answers.length; i++) {
        	
        	if(student1Answer[i%5] == answers[i]) {
        		student1AnswerCount++;
        	}
        	if(student2Answer[i%8] == answers[i]) {
        		student2AnswerCount++;
        	}
        	if(student3Answer[i%10] == answers[i]) {
        		student3AnswerCount++;
        	}
        }
        
        ArrayList<Integer> count = new ArrayList<>();

        count.add(student1AnswerCount);
        count.add(student2AnswerCount);
        count.add(student3AnswerCount);
        
        Collections.sort(count);
        
        if(count.get(2) > count.get(1)) {
        	count.remove(0);
        	count.remove(1);
        } else {
        	if(count.get(1) > count.get(0)) {
        		count.remove(0);
        	}
        }
        
        
        
        int[] answer = new int[count.size()];
        
        if(answer.length == 3) {
        	answer[0] = 1;
        	answer[1] = 2;
        	answer[2] = 3;
        } else {
        	
        	HashSet<Integer> list = new HashSet<>();
        	for(int i = answer.length -1; i >= 0; i--) {
        		
        		if(count.contains(student1AnswerCount)) {
        			list.add(1);
        		} else if(count.contains(student2AnswerCount)) {
        			list.add(2);
        		} else if(count.contains(student3AnswerCount)) {
        			list.add(3);
        		}
        	}
        	
        	Iterator<Integer> iter = list.iterator();
        	int i = 0;
        	while(iter.hasNext()) {
        		answer[i] =  iter.next();
        		i++;
        	}
        }
        
        return answer;

        
    }
}

