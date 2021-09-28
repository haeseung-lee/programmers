package codingTest.practice.weeklyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 모음사전..
 * @author user
 * 
 */
public class VowelDictionary {

	public static void main(String[] args) {
		
		VowelDictionary test = new VowelDictionary();
		
		System.out.println(test.solution("test"));
	}
	
    public int solution(String word) {
    	
    	/*A E I O U 로 사전..
    	 * 순서는 A, AA... 
    	 * 길이는 5이하
    	 * */
    	
    	// 길이가 1, 2, 3, 4, 5
    	
    	String[] vowelList = {"A","E","I","O","U"};
    	
    	List<String> vowel = Arrays.asList(vowelList);
    	
    	//길이가 1인 경우 : 5
    	//길이가 2인 경우 : 15개 AA, AE, AI, AO, AU, EE, EI, EO, EU, II, IO, IU, OO, OU, UU  / 5 + 4 + 3 + 2 + 1
    	//길이가 3인 경우 : AAA, AAE, AAI, AAO, AAU, AEA, AEE, AEI, AEO, AEU, AIA, AIE, AII, AIO, AIU, AOA, AOE, AOI,AOO, AOU, AUA, AUE, AUI, AUO, AUU, 25+24+23+22+21
    	
    	for(int i = 0; i < vowelList.length; i++) {
    		
    	}
    	System.out.println(vowel);
    	
        int answer = 0;
        return answer;
    }
}
