package codingTest.practice.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		
		MaxNumber test = new MaxNumber();
		
//		int[] numbers = {10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numbers = {0,00,0};
		System.out.println(test.solution(numbers));
	}
	
    public String solution(int[] numbers) {
        String answer = "";
        //초기코드 index 경우의수 -> random 으로 index조합 -> 조합만큼 문자열합치기 -> 정렬 -> 가장큰수 출력 
        //경우의 수가 많아지면 시간이 너무 오래걸림
//        System.out.println("숫자목록");
//        
//        for (int i : numbers) {
//			System.out.print(i + " ");
//		}
//        System.out.println();
//        
//        int count = 1;
//        
//        for(int i = numbers.length; i > 1; i--) {
//        	count = count*i;
//        }
//        
//        System.out.println(count);
//        
//        ArrayList<ArrayList<Integer>> indexList = new ArrayList<>();
//        
//        while(indexList.size() < count) {
//        	
//        	ArrayList<Integer> index = new ArrayList<>();
//        	
//        	while(index.size() < numbers.length) {
//        		
//        		int num =  (int)(Math.random() * numbers.length);
//        		
//        		if(!index.contains(num)) {
//        			
//        			index.add(num);
//        		}
//        	}
//        	
//        	if(!indexList.contains(index)) {
//        		indexList.add(index);
//        		System.out.println(indexList);
//        	}
//        	
//        }
//        
//        ArrayList<Integer> numberList = new ArrayList<>();
//        for(int i = 0; i< indexList.size(); i++) {
//        	String number = "";
//        	
//        	for(int j = 0; j < indexList.get(i).size(); j++) {
//        		number = number+numbers[indexList.get(i).get(j)];
//        		
//        	}
//        	
//        	numberList.add(Integer.parseInt(number));
//        }
//        
//        Collections.sort(numberList);
//        
//        answer = numberList.get(numberList.size()-1).toString();
//        
//        System.out.println("가장큰수는? : " + answer);
        
        
        //수정. 
        //list에 담아서 숫자비교 하여 list정렬 -> 문자열 합치기 
        List<String> list = new ArrayList<String>();
        
        for (int num : numbers) {
			
        	list.add(num+"");
		}
        
        Comparator<String> comparator = new Comparator<String>() {
			
        	int a = 0;
			@Override
			public int compare(String o1, String o2) {
				
				if(o1.equals(o2)) {
					
					return 0; 
				} else {
					
					int num1 = Integer.parseInt(o1 + o2);
					int num2 = Integer.parseInt(o2 + o1);
					
					return num1 > num2 ? -1 : 1;
				}
			}
		};

		list.sort(comparator);
		
		for (String string : list) {
			
			answer += string;
		}
		
		if(answer.charAt(0) == '0') {
			System.out.println("?");
			answer = "0";
		}
		
        return answer;
    }
    
    
}
