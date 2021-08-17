package codingTest.practice.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//완주하지 못한 선수2
//https://programmers.co.kr/learn/courses/30/lessons/42576
//what is getOrDefault?
public class NonCompletionUser {
	
	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden", "leo"};
		String[] completion = {"eden", "kiki", "leo"};
		
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		ArrayList<String> participantList = new ArrayList<>(Arrays.asList(participant));
		ArrayList<String> completionList = new ArrayList<>(Arrays.asList(completion));

		
		for(int i = 0; i < participantList.size(); i++) {
			
			if(i == participantList.size()-1) {
				
				answer = participantList.get(i);
			} else {
				
				if(!participantList.get(i).equals(completionList.get(i))) {
					answer = participantList.get(i);
					break;
				}
			}
		}
		System.out.println(answer);
	}
	
	//다른사람풀이 - 분석해보기
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
	
}
