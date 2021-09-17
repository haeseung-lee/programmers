package codingTest.practice.skillCheckTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level1Question2 {

	public static void main(String[] args) {
		
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7,5,5};
		
		Level1Question2 test = new Level1Question2();
		test.solution(table, languages, preference);
		
	}
	
    public String solution(String[] table, String[] languages, int[] preference) {
    	
    	ArrayList list = new ArrayList();
    	
    	//table 을 list로 변환(점수 계산하기 쉽게 역순으로 치환)
    	for(int i = 0; i < table.length; i++) {
    		
    		String[] test = table[i].split(" ");
    		List<String> testList = Arrays.asList(test);
    		Collections.reverse(testList);
    		
    		System.out.println(testList);
    	}
    	
    	
    	
    	

        String answer = "";
        return answer;
    }
}
