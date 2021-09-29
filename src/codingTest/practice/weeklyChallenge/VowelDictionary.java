package codingTest.practice.weeklyChallenge;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 모음사전..
 * @author user
 * 
 */
public class VowelDictionary {

	public static void main(String[] args) {
		
		VowelDictionary test = new VowelDictionary();
		
		System.out.println(test.solution("I"));
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
    	
    	Collections.sort(vowelList);
    	System.out.println(vowelList);
        int answer = vowelList.indexOf(word) + 1;
        return answer;
    }
}
