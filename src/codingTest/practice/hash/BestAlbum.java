package codingTest.practice.hash;

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
        return answer;
    }
}