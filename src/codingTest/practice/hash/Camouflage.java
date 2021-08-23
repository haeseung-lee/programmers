package codingTest.practice.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

//완료
public class Camouflage {

	public static void main(String[] args) {
		
		Camouflage test = new Camouflage();
		
		String[][] testArray = {{"yellowhat", "얼굴"}, {"bluesunglasses", "모자"}, {"green_turban", "안경"}};
		System.out.println("총 수는 : " + test.solution(testArray));
	}
	
	//람다식과, stream 을 많이 사용한다. 어떻게 쓰는건지?! 
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashSet<String> clothesType = new HashSet<>();
        HashMap<String, String> clothesList = new HashMap<String, String>();
        
        for (String[] type : clothes) {
			
        	//옷 종류의 수 구하기
        	clothesType.add(type[1]);
        	//옷 리스트 Map에 담기
        	clothesList.put(type[0], type[1]);
		}
        
        //종류별 옷의 수를 카운트 하기위한 배열 선언
        int[] count = new int[clothesType.size()];
        
        //종류별 옷의 수를 카운트 하기위해 set을 list 로 변환
        ArrayList<String> list = new ArrayList<>(clothesType);
        
        Set<Entry<String, String>> enterySet = clothesList.entrySet();
        
        for(int i = 0; i < list.size(); i++) {
        	
        	for (Entry<String, String> entry : enterySet) {
        		
        		//value 값을 비교 하여 종류별 옷의 수 카운트
        		if(entry.getValue().equals(list.get(i))) {
        			count[i] = count[i] + 1;
        		}
        	}
        }
        	
        //가능한 경우의 수  = (1번종류 옷의수 + 안입는 경우) * (2번종류 옷의수 + 안입는 경우) *...(i번종류 옷의수 + 안입는 경우) - 1(모두 안입는경우 제외)
        for(int i = 0; i < count.length; i++) {
        	answer *= count[i] + 1;
        }
        
        //모두 안입는 경우를 제외(한가지)
        answer = answer -1;

        return answer;
    }
    
    //다른사람풀이..
//    public int otherSolution(String[][] clothes) {
//        return Arrays.stream(clothes)
//                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
//                .values()
//                .stream()
//                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
//    }
}
