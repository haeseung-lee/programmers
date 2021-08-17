package codingTest.practice.hash;

import java.util.Arrays;

//k번째 숫자 구하기
public class KthNumber {

	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		//ex) 2~5까지, 오름차순정렬, 3번째 수
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
	
		int[] answer = solution(array, commands);
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		
		
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			
			int[] arrays = new int[commands[i][1] - commands[i][0] + 1];
			int index = 0;
			//배열복사를 생각하자!
			for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
				
				arrays[index] = array[j];
				index++;
			}
			
			Arrays.sort(arrays);
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
