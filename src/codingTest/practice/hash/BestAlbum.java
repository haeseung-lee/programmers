package codingTest.practice.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BestAlbum {

	public static void main(String[] args) {
		
		//예시 
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		//결과 -> 4,1,3,0
		
		BestAlbum test = new BestAlbum();
		
		test.solution(genres, plays);
		
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
       
        
        Map<String, Integer> genreList = new HashMap();
        
        for(int i = 0; i < genres.length; i++) {
        
        	if(genreList.get(genres[i]) == null) {
        		
        		genreList.put(genres[i], plays[i]);
        	} else {
        		
        		int playCount = genreList.get(genres[i]) + plays[i];
        		
        		genreList.put(genres[i], playCount);
        	}
        }
        
        // Map 정렬
		// Map.Entry 리스트 작성
		List<Entry<String, Integer>> listEntries = new ArrayList<Entry<String, Integer>>(genreList.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(listEntries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 내림 차순 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		
		System.out.println("내림 차순 정렬");
		// 결과 출력
		for(Entry<String, Integer> entry : listEntries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
        
        System.out.println(genreList);
        return answer;
    }
}
