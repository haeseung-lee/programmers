package codingTest.practice.skillCheckTest;

import java.util.ArrayList;

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
    	
    	for(int i = 0; i < table.length; i++) {
    		
    		
    	}
    	
    	
//    	ArrayList<String[]> tableList = new ArrayList<>();
//    	for(int i = 0; i < table.length; i++) {
//    		
//    		String[] tableArrays = table[i].split(" ");
//    		tableList.add(tableArrays);
//    	}
//    	
//    	for (String[] strings : tableList) {
//			
//    		for (String strings2 : strings) {
//				System.out.print(strings2 + " ");
//			}
//    		System.out.println();
//		}
        String answer = "";
        return answer;
    }
}
