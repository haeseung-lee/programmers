package codingTest.practice.dynamicProgramming;

public class PrintN {

	public static void main(String[] args) {
		
		PrintN test = new PrintN();
		
		test.solution(0, 0);
	}
	
    public int solution(int N, int number) {
    	
    	//아래와 같이 5와 사칙연산만으로 12를 표현

    	//12 = 5 + 5 + (5 / 5) + (5 / 5)
    	//12 = 55 / 5 + 5 / 5
    	//12 = (55 + 5) / 5

    	//5를 사용한 횟수는 각각 6,5,4 입니다. 그리고 이중 가장 작은 경우는 4입니다.
    	//이처럼 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.
    	
    	
    	//그럼 20을 3으로만
    	//(3+3) * 3 + 3/3 + 3/3
    	//33/3 + 3*3 (4)
    	
    	//29를 12로만?
    	//12+12 + (12+12)/12 + (12+12+12)/12 (9)
    	
    	//1212/12
        int answer = 0;
        return answer;
    }
}
