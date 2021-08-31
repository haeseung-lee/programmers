package codingTest.practice.hash;

import java.util.HashMap;
import java.util.Map;

public class BestAlbum {

	public static void main(String[] args) {
		
		//예시 
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		//결과 -> 4,1,3,0
		
	}
	
    public int[] solution(String[] genres, int[] plays) {
    	// 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범 출시
    	// 노래를 수록하는 기준 
    	// 속한 노래가 많이 재생된 장르를 먼저 수록
    	// 장르 내에서 많이 재생된 노래를 먼저 수록
    	// 장르 내에서 재생 횟수가 같은 노래 중에서는 고유번호가 낮은 노래를 먼저 수록.
        int[] answer = {};
        
        // 1. 장르, 고유번호, 재생횟수 를 알고 있음
        // 2. 장르별 전체 재생횟수 -> 정렬 
        // 3. 장르 안에서 곡별 재생횟수 -> 정렬 -> 2개씩 배열에 담기
        
        // 고유번호를 키로? 
        // Map 안에 Map? 
       
        Map<Integer, Map> list = new HashMap<>();
        
        
        
        for(int i = 0; i < genres.length; i++) {
        	
        }
        return answer;
    }
}
