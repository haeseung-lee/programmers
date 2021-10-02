package codingTest.practice.weeklyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 복서정렬하기
 * @author user
 *
 */
public class BoxerSorting {

	public static void main(String[] args) {
		
		int[] weights = {50,82,75,12};
		String[] head2head = {"NLWL","WNLL","LWNW","WWLN"};
		//결과 -> {3,4,1,2}
		
		BoxerSorting test = new BoxerSorting();
		test.solution(weights, head2head);
	}
	
    /**
     * @param weights		몸무게
     * @param head2head		전적
     * @return
     */
    public int[] solution(int[] weights, String[] head2head) {
    	
    	/*	정렬기준
    	 *	1. 전체승률이 높은복서의 번호가 앞쪽으로 감(전적이 없는 경우 0%로 취급)
    	 *	2. 승률이 동일한 복서의 번호들 중에서는 자신보다 몸무게가 무거운 복서를 이긴 횟수가 많은 복서의 번호가 앞쪽으로 감
    	 *	3. 자신보다 무거운 복서를 이긴 횟수까지 동일 -> 자기 몸무게가 무거운 복서의 번호가 앞쪽으로
    	 *	4. 자기몸무게까지 동일한 복서의 번호들 중에서 작은 번호가 앞쪽으로 감.
    	 *
    	 *  정렬순서 전체승률 -> 상대몸무게 높은 순 -> 본인몸무게 높은순 -> 번호 작은순
    	 * */
    	
    	//승률(0)/상대몸무게(1)/본인몸무게(2)/번호(key) 이렇게 저장해놓고 순서대로?
    	
    	Map<Integer,List> boxerInfo = new HashMap<>();
    	
    	for(int i = 0; i < weights.length; i++) {
    		
    		List record = new ArrayList();
    		
    		int all = head2head[i].length()-1;
    		//1. 승률 구하기
    		int winCount = 0;
    		for(int j = 0; j < weights.length; j++) {
    			
    			
    			if(head2head[i].charAt(j) == 'W') {
    				
    				winCount++;
    			}
    		}
    		System.out.println((i+1) + "번째 선수 승리횟수" + winCount);			
    		System.out.println((i+1) + "번째 선수 승률" + (double)winCount/(weights.length-1));			
    	}
        int[] answer = {};
        return answer;
    }
}
