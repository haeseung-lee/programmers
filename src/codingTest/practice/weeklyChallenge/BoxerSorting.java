package codingTest.practice.weeklyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    	
    	//
    	List boxerInfo = new ArrayList<>();
    	
    	for(int i = 0; i < weights.length; i++) {
    		
    		List record = new ArrayList();
    		
    		int all = head2head[i].length()-1;
    		
    		int winCount = 0;
    		int moreWeightWin = 0; 
    		
    		
    		for(int j = 0; j < weights.length; j++) {
    			
    			
    			//1. 승률 구하기
    			if(head2head[i].charAt(j) == 'W') {
    				
    				winCount++;
    				
    				//2. 몸무게 높은 사람 이긴 횟수 구하기
    				if(weights[i] < weights[j]) {
    					moreWeightWin++;
    				}
    			}
    		}
    		//0.승률
    		record.add((double)winCount/(weights.length-1));
    		//1.자신보다몸무게 많이 나가는 사람 이긴 횟수
    		record.add(moreWeightWin);
    		//2.본인몸무게
    		record.add(weights[i]);
    		//3.선수번호
    		record.add(i+1);
    		
    		boxerInfo.add(record);
    		
    	}
    	
    	
//    	Comparator<List> compare = new Comparator<List>() {
//
//			@Override
//			public int compare(List o1, List o2) {
//
//				if(o1.get(0) != o2.get(0)) {
//					return (double)o1.get(0)<(double)o2.get(0)? 1: -1;
//				} else if(o1.get(1) != o2.get(1)) {
//					return (int)o1.get(1)<(int)o2.get(1)? 1: -1;
//				} else if(o1.get(2) != o2.get(2)) {
//					return (int)o1.get(2)<(int)o2.get(2)? -1: 1;
//				} else {
//					return (int)o1.get(3)<(int)o2.get(3)? -1: 1;
//				}
//			}
//		};
		Comparator<List> compare = new Comparator<List>() {
			
			@Override
			public int compare(List o1, List o2) {
				
				return (double)o1.get(0) < (double)o2.get(0)? 1: -1;
			}
		};
		
		boxerInfo.sort(compare);
		System.out.println("승률정렬 : " + boxerInfo);
		
		compare = new Comparator<List>() {
			
			@Override
			public int compare(List o1, List o2) {
				//이게 안되는군..
				if(o1.get(0) == o2.get(0)) {
					
					return (int)o1.get(1) < (int)o2.get(1)? 1: -1;
				} else {
					
					return 0;
				}
			}
		};
		
		System.out.println("몸무게 높은사람 이긴 수  : " + boxerInfo);
        int[] answer = {};
        return answer;
    }
}
