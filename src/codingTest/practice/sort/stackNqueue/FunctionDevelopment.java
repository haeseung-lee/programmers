package codingTest.practice.sort.stackNqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelopment {

	public static void main(String[] args) {
		
	}
	
    public int[] solution(int[] progresses, int[] speeds) {
    	//progresses : 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수배열
    	//speeds : 각 작업의 개발속도가 적힌 정수배열
    	//배포는 1일 1회, 하루의 끝에
    	
    	//1. 선입선출을 위한 queue 사용
    	Queue<Object> progress = new LinkedList<>(Arrays.asList(progresses));
        int[] answer = {};
        return answer;
    }
}
