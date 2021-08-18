package codingTest.practice.sort;

import java.util.Arrays;

//k번째 숫자 구하기(완료)
public class KthNumber {

	public static void main(String[] args) {
		
		KthNumber test = new KthNumber();
		int[] array = {1,5,2,6,3,7,4};
		//ex) 2~5까지, 오름차순정렬, 3번째 수
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
	
		int[] answer = test.solution(array, commands);
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	//내 풀이
	public int[] solution(int[] array, int[][] commands) {
		
		
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			
			//1. commands 의 i번째 배열의 인덱서[0]~인덱스[1]번째 길이만큼의 배열 만들기 
			int[] arrays = new int[commands[i][1] - commands[i][0] + 1];
			int index = 0;
			//배열복사를 생각하자!
			for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
				
				arrays[index] = array[j];
				index++;
			}
			
			//2. 오름차순정렬
			Arrays.sort(arrays);
			//3. commands 의 i번째 배열의 [2]번째 인덱스에서 제시하는 번째의 숫자 가져오기
			answer[i] = arrays[commands[i][2]-1];
		}
		
		
		return answer;
	}
	
	//다른사람풀이
	public int[] otherSolution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
