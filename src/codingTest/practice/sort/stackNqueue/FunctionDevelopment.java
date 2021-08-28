package codingTest.practice.sort.stackNqueue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelopment {

	public static void main(String[] args) {
		
		FunctionDevelopment test = new FunctionDevelopment();
		
		int[] progresses = {93,30,55}; 
		int[] speeds = {1,30,5}; 
		test.solution(progresses, speeds);
	}
	
    public int[] solution(int[] progresses, int[] speeds) {
    	//progresses : 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수배열
    	//speeds : 각 작업의 개발속도가 적힌 정수배열
    	//배포는 1일 1회, 하루의 끝에
    	
    	//1. 선입선출을 위한 queue 사용
//    	for (int i : progresses) {
//			System.out.println(i);
//		}
    	//음..
    	Queue progress = new LinkedList<>(Arrays.asList(progresses));
    	Queue speed = new LinkedList<>(Arrays.asList(speeds));
    	
    	System.out.println(speed.poll());
    	Queue test = new LinkedList<>();
    	Queue test1 = new LinkedList<>();
    	
    	// 배열 -> queue? 
    	for (int object : progresses) {
    		test.add(object);
    		
		}
    	for (int object : speeds) {
    		test1.add(object);
    		
    	}
    	for(int i = 0 ; i < progresses.length; i++) {
    		test.poll();
    	}
    	
//    	while(progresses.length ==0) {
//
//    		for(int i = 0; i < progresses.length; i++) {
//    			
//    			progresses[i] = progresses[i] + speeds[i];
//    			
//    			if(progresses[0] >= 100) {
//    				
//    			}
//    		}
//    	}
    	
        int[] answer = {};
        return answer;
    }
}
