package codingTest.practice.weeklyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 모음사전..
 * @author user
 * 
 */
public class VowelDictionary {

	public static void main(String[] args) {
		
		VowelDictionary test = new VowelDictionary();
		
		while(true) {
			
			System.out.println("길이가 1에서 5 사이인 대문자모음으로 이루어진 단어를 검색 할 수 있습니다.");
			System.out.print("검색할 단어를 입력하세요 : ");
			
			Scanner sc = new Scanner(System.in);
			
			String word =  sc.nextLine();
			
			if(test.solution(word) < 1) {
				System.out.println(word + "는 " + "등록되지 않은 단어입니다.");
			} else {
				System.out.println(word + "는 " + test.solution(word) + "번쨰 단어입니다");
			}
			
			System.out.print("계속 검색하시겠습니까?(y/n) : ");
			
			if(sc.nextLine().equals("n")) {
				System.out.println("검색을 종료합니다.");
				break;
			}
		}
	}
	
    public int solution(String word) {
    	
    	/*A E I O U 로 사전..
    	 * 순서는 A, AA... 
    	 * 길이는 5이하
    	 * */
    	
    	// 길이가 1, 2, 3, 4, 5
    	
    	String[] vowel = {"A","E","I","O","U"};
    	
    	ArrayList<String> vowelList = new ArrayList<>();

    	//길이가 1;
    	for (String string : vowel) {
    		vowelList.add(string);
		}
    	
    	
    	//길이가 2;
    	for(int i = 0; i < vowel.length; i++) {
    		for(int j = 0; j < vowel.length; j++) {
    			vowelList.add(vowel[i] + vowel[j]);
    		}
    	}
    	
    	//길이가 3
    	for(int i = 0; i < vowel.length; i++) {
    		for(int j = 0; j < vowel.length; j++) {
    			for(int k = 0; k < vowel.length; k++) {
    				vowelList.add(vowel[i] + vowel[j] + vowel[k]);
    			}
    		}
    	}
    	
    	//길이가 4
    	for(int i = 0; i < vowel.length; i++) {
    		for(int j = 0; j < vowel.length; j++) {
    			for(int k = 0; k < vowel.length; k++) {
    				for(int l = 0; l < vowel.length; l++) {
    					vowelList.add(vowel[i] + vowel[j] + vowel[k] + vowel[l]);
    				}
    			}
    		}
    	}
    	
    	//길이가 5
    	for(int i = 0; i < vowel.length; i++) {
    		for(int j = 0; j < vowel.length; j++) {
    			for(int k = 0; k < vowel.length; k++) {
    				for(int l = 0; l < vowel.length; l++) {
    					for(int m = 0; m < vowel.length; m++) {
    						vowelList.add(vowel[i] + vowel[j] + vowel[k] + vowel[l] + vowel[m]);
    					}
    				}
    			}
    		}
    	}
    	
    	//정렬
    	Collections.sort(vowelList);
    	
    	//검색
        int answer = vowelList.indexOf(word) + 1;
        return answer;
    }
}
