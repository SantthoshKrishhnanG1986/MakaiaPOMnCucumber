package interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LearnMaps {
public static void main(String Args[]) {
	String varString;
	System.out.println("Enter a string");
	Scanner in = new Scanner(System.in);
	varString = in.nextLine();
	char[] charArray = varString.toCharArray();
	Map <Character, Integer> varMap=new LinkedHashMap<Character, Integer>();
	
	in.close();
	for (char c : charArray) {
		if(varMap.containsKey(c)) {
			varMap.put(c, varMap.get(c)+1);
		}
		else {
			varMap.put(c, 1);
		}
		
	}
	System.out.println(varMap);
	int maxVar = 1;
	for (Entry<Character,Integer> indData : varMap.entrySet()) {
		if (indData.getValue()>maxVar)
			maxVar=indData.getValue();
	}
	for (Entry<Character,Integer> indData : varMap.entrySet()) {
		if (indData.getValue()==maxVar)
			System.out.println(indData);
	}
}
	
	
	
}
