package codingTest.practice.hash;

import java.util.Arrays;
import java.util.HashSet;


public class PhoneNumberList {

	public static void main(String[] args) {
		
		PhoneNumberList test = new PhoneNumberList();
		
		String[] numberList = {"123", "456", "4781239"};
		System.out.println(test.solution(numberList));
	}
	
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
//        HashSet<String> phoneNumberList = new HashSet<String>();
//        HashSet<String> phoneNumberList = new HashSet<String>(Arrays.asList(phone_book));
        
        
        
        for(int i = 1; i < phone_book.length; i++) {
        	
        	if(phone_book[i].length() >= phone_book[0].length()) {
        		
        		if(phone_book[i].substring(0, phone_book[0].length()).contains(phone_book[0])) {
        			
        			answer = false;
        			break;
        		}
        	}
        }
        
//        for(int i = 1; i < phone_book.length; i++) {
//        	
//        	if(phone_book[0].length() <= phone_book[i].length()) {
//        		
//        		phoneNumberList.add(phone_book[i].substring(0, phone_book[0].length()));
//        	}
//        }
//        if(phoneNumberList.contains(phone_book[0])){
//        	answer = false;
//        };
        return answer;
    }
}
