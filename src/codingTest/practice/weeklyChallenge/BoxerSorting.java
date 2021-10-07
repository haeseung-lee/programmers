package codingTest.practice.weeklyChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 복서정렬하기
 * @author user
 *
 */
public class BoxerSorting {

	public static void main(String[] args) {
		
		int[] weights = {60,70,60};
		String[] head2head = {"NNW", "NNN", "LNN"};
		//예상결과 -> {2,1,3} // 실행결과 -> {1,2,3}
		
		BoxerSorting test = new BoxerSorting();
		int[] result = test.solution(weights, head2head);
		
		for (int i : result) {
			System.out.print(i + " ");
		}
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
    	
    	List boxerInfo = new ArrayList<>();
    	
    	for(int i = 0; i < weights.length; i++) {
    		
    		List record = new ArrayList();
    		
    		int all = head2head[i].length()-1;
    		
    		int winCount = 0;
    		int moreWeightWin = 0; 
    		int total = 0;
    		
    		for(int j = 0; j < weights.length; j++) {
    			
    			//0.전체 경기수 구하기
    			if(head2head[i].charAt(j) != 'N') {
    				total++;
    			}
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
    		record.add((double)winCount/total);
    		//1.자신보다몸무게 많이 나가는 사람 이긴 횟수
    		record.add(moreWeightWin);
    		//2.본인몸무게
    		record.add(weights[i]);
    		//3.선수번호
    		record.add(i+1);
    		
    		boxerInfo.add(record);
    		
    	}

    	String none = "";
    	
    	for(int i = 0; i < head2head[0].length(); i++) {
    		
    		none += "N";
    		
    	}
    	
    	if(!none.equals(head2head[0])) {
    		
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
    		
    		compare = new Comparator<List>() {
    			
    			@Override
    			public int compare(List o1, List o2) {
    				
    				if((double)o1.get(0) == (double)o2.get(0)) {
    					
    					return (int)o1.get(1) < (int)o2.get(1)? 1: -1;
    				} else {
    					
    					return 0;
    				}
    			}
    		};
    		boxerInfo.sort(compare);
    		
    		//1,2 같을시
    		compare = new Comparator<List>() {
    			
    			@Override
    			public int compare(List o1, List o2) {
    				
    				if(o1.get(1) == o2.get(1) && o1.get(0) == o2.get(0)) {
    					
    					return (int)o1.get(2) > (int)o2.get(2)? 1: -1;
    				} else {
    					
    					return 0;
    				}
    			}
    		};
    		
    		boxerInfo.sort(compare);
    		
    		compare = new Comparator<List>() {
    			
    			@Override
    			public int compare(List o1, List o2) {
    				
    				if(o1.get(1) == o2.get(1) && o1.get(0) == o2.get(0) && o1.get(2) == o1.get(2)) {
    					
    					return (int)o1.get(3) < (int)o2.get(3)? -1: 1;
    				} else {
    					
    					return 0;
    				}
    			}
    		};
    		
    		
    		boxerInfo.sort(compare);
    		
    		int[] answer = new int[boxerInfo.size()];
    		for(int i = 0; i < boxerInfo.size(); i++) {
    			answer[i] = (int) ((List)boxerInfo.get(i)).get(3);
    		}
    		return answer;
    	} else {
    		Comparator<List> compare = new Comparator<List>() {
    			
    			@Override
    			public int compare(List o1, List o2) {
    				
    				return (int)o1.get(2) < (int)o2.get(2)? 1: -1;
    			}
    		};
    		boxerInfo.sort(compare);
    		
    		compare = new Comparator<List>() {
    			
    			@Override
    			public int compare(List o1, List o2) {
    				
    				if((int)o1.get(2) == (int)o2.get(2)) {
    					
    					return (int)o1.get(3) < (int)o2.get(3)? -1: 1;
    				} else {
    					
    					return 0;
    				}
    			}
    		};
    		boxerInfo.sort(compare);
    		
    		int[] answer = new int[boxerInfo.size()];
    		for(int i = 0; i < boxerInfo.size(); i++) {
    			answer[i] = (int) ((List)boxerInfo.get(i)).get(3);
    		}
    		return answer;
    		
    	}
		
    }
}
