package codingTest.practice.weeklyChallenge;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 상호평가
 * @author 이해승
 *
 */
public class MutualEvaluation {

	public static void main(String[] args) {
		
		MutualEvaluation test = new MutualEvaluation();
		
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		test.solution(scores);
	}
	
    /**
     * @param scores  점수 i번 학생이 평가한 j번 학생의 과제 점수
     * @return
     */
    public String solution(int[][] scores) {
    	
    	int studentNum = 0;
    	
    	ArrayList<ArrayList<Integer>> scoreList = new ArrayList();
    	for(int i = 0; i < scores.length; i++) {

    		ArrayList score = new ArrayList(); 
    		for(int j = 0; j < scores[i].length; j++) {
    			
    			score.add(scores[j][i]);
    		}
    		
    		scoreList.add(score);
    	}
    	
    	ArrayList<Double> avgList = new ArrayList<>();
    	for(int i = 0; i < scoreList.size(); i++) {
    		
    		ArrayList personalScore = scoreList.get(i);
    		
    		if(personalScore.get(i) == Collections.max(scoreList.get(i)) || personalScore.get(i) == Collections.min(scoreList.get(i))) {
    			int removenum = (int)personalScore.get(i);
    			personalScore.remove(i);
    			
    			if((personalScore).contains(removenum)) {
    				personalScore.add(removenum);
    			}
    			
    		}
    		
    		double sum = 0;
    		for (Object object : personalScore) {
				
    			sum += (int)object;
			}
    		
    		double avg = sum/personalScore.size();
    		avgList.add(avg);
    	}
    	
    	String answer = "";
    	for (Double scoreAvg : avgList) {
			
    		if(scoreAvg >= 90) {
    			answer += "A";
    		} else if(scoreAvg >= 80){
    			answer += "B";
    		} else if(scoreAvg >= 70) {
    			answer += "C";
    		} else if(scoreAvg >= 50) {
    			answer += "D";
    		} else {
    			answer += "F";
    		}
		}
    	System.out.println(answer);
        return answer;
    }
}
