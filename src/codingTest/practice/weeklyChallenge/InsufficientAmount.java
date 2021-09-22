package codingTest.practice.weeklyChallenge;


/**
 * 부족한금액 구하기
 * @author 이해승
 *
 */
public class InsufficientAmount {

	public static void main(String[] args) {
		
		InsufficientAmount test = new InsufficientAmount();
		
		System.out.println(test.solution(3, 300, 4));
	}
	
    /**
     * @param price	놀이기구 이용료
     * @param money	보유금액
     * @param count	원하는 이용횟수
     * @return  answer 부족한 금액
     */
    public long solution(int price, int money, int count) {
    
        long answer = -1;
        
        long usage = 0;
        for(int i = 1; i <= count; i++) {
        	
        	usage += i * price;
        }
        
        answer = money - usage;
        
        if(answer < 0) {
        	
        	return -answer;
        } else {
        	return 0;
        }
    }	
}
