package codingTest.practice.hash;

import java.util.Arrays;

//접두사가 있으면 false, 없으면 true를 반환(완료)

public class PhoneNumberList {

	public static void main(String[] args) {
		
		PhoneNumberList test = new PhoneNumberList();
		
//		String[] numberList = {"123", "456", "4781239"};
		String[] numberList = {"113333","11333345","345555","555555", "345444"};
		System.out.println(test.solution(numberList));
	}
	
	//내풀이
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //1. 순서대로 정렬
        Arrays.sort(phone_book);
        
        
        for(int i = 1; i < phone_book.length; i++) {
        //2. 앞 뒤 한번씩비교	
        	if(phone_book[i].startsWith(phone_book[i-1])) {
        		answer = false;
        		break;
        	}
        }
        
        return answer;
    }
}
