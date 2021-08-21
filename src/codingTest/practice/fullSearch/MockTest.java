package codingTest.practice.fullSearch;

import java.util.ArrayList;
import java.util.Collections;

//풀이완료
public class MockTest {
	
	//3명이 있다.
	//1번이 찍는 방식 -> 1,2,3,4,5,1,2,3,4,5...(5개 주기로 반복)
	//2번이 찍는 방식 -> 2,1,2,3,2,4,2,5,2,1,2,3,...(8개주기 반복)
	//3번이 찍는 방식 -> 3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,,4,5,5,...(10개 주기로 반복)
	
	public static void main(String[] args) {
	
		MockTest test = new MockTest();
		
		int[] answers = {1,2,3,4,5};
		
		
		
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
        	count.remove(0);
        } else {
        	if(count.get(1) > count.get(0)) {
        		count.remove(0);
        	}
        }    
        
        int[] answer = new int[count.size()];
        
        if(count.size() == 3) {
        	answer[0] = 1;
        	answer[1] = 2;
        	answer[2] = 3;
        } else if(count.size() == 1) {
        	
        	if(count.contains(student1AnswerCount)) {
        		answer[0] = 1;
        	} else if(count.contains(student2AnswerCount)) {
        		answer[0] = 2;
        	} else {
        		answer[0] = 3;
        	}
        } else {
        	
        	if(count.contains(student1AnswerCount) && count.contains(student2AnswerCount)) {
        		answer[0] = 1;
        		answer[1] = 2;
        	} else if(count.contains(student2AnswerCount) && count.contains(student3AnswerCount)) {
        		answer[0] = 2;
        		answer[1] = 3;
        	} else {
        		answer[0] = 1;
        		answer[1] = 3;
        	}
        }
        
        return answer;
        
    }
}

