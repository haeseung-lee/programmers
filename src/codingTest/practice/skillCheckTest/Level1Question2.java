package codingTest.practice.skillCheckTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Level1Question2 {

	public static void main(String[] args) {
		
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7,5,5};
		
		Level1Question2 test = new Level1Question2();
		System.out.println(test.solution(table, languages, preference));
		
		
	}
	
    public String solution(String[] table, String[] languages, int[] preference) {
    	
    	ArrayList list = new ArrayList();
    	
    	//table 을 list로 변환(점수 계산하기 쉽게 역순으로 치환)
    	for(int i = 0; i < table.length; i++) {
    		
    		String[] test = table[i].split(" ");
    		List<String> testList = Arrays.asList(test);
    		Collections.reverse(testList);
    		
    		list.add(testList);
    	}

    	LinkedHashMap<String, Integer> jobScore = new LinkedHashMap<>();
    	for(int i = 0; i < list.size(); i++) {
    		
    		int sum = 0;
    		for(int j = 0; j < languages.length; j++) {
    			
    			if(((List)list.get(i)).contains(languages[j])) {
    				
    				sum += preference[j] * (((List)list.get(i)).indexOf(languages[j])+1);
    			}
    		}
    		jobScore.put((String)((List)list.get(i)).get(5), sum);
    	}
    	

    	List<String> keyList = new ArrayList<String>(jobScore.keySet());
    	Collections.sort(keyList, new Comparator<String>() {
    		@Override
    		public int compare(String o1, String o2) {
    			return jobScore.get(o2).compareTo(jobScore.get(o1));
    		}
    	});
    	System.out.println(jobScore);
    	System.out.println("정렬결과는 : " + keyList);
    	//점수 정렬, 동점 있을 시 사전순으로 정렬
    	//1. 동점이 있는지?
    	Set<Entry<String,Integer>> entry = jobScore.entrySet();
    	
    	int count = 0;
    	for (Entry<String, Integer> entry2 : entry) {
			if(entry2.getValue().equals(jobScore.get(keyList.get(0)))) {
				count++;
			}
		}
    	
    	String answer = "";
    	
    	//동점 없는 경우
    	if(count == 1) {
    		return answer = keyList.get(0); 
    	//동점 있는 경우
    	} else {
    		
    		ArrayList answerList = new ArrayList();
    		
    		for(int i = 0; i < count; i++) {
    			
    			answerList.add(keyList.get(i));
    		}
    		
    		Collections.sort(answerList, new Comparator<String>() {
    			public int compare(String o1, String o2) {
    				return o1.compareTo(o2);
    			};
			});
    		answer = (String) answerList.get(0);
    		return answer;
   		}
//    	for(int i = 0; i < keyList.size(); i++) {
//    		
//    	}
    	//stream활용 정렬? -> 값을 가져올 수가 없네..
//    	Stream sorted = jobScore.entrySet().stream().sorted(Map.Entry.comparingByValue());
//    	Iterator iter = sorted.iterator();
//    	
//    	while(iter.hasNext()) {
//    		System.out.println(iter.next());
//    	}
//    	

    	

    }
}
