package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueChar {
	public static void main(String Args[]) {
		String s = "Santthosh";
		Set<Character> varSet=new HashSet<Character>();
		for (Character c : s.toCharArray()) {
			varSet.add(c);
		}
		System.out.println("Tech 1 HashSet\n"+varSet);

		Set<Character> varTreeSet=new TreeSet<Character>();
		for (Character c : s.toCharArray()) {
			varTreeSet.add(c);
		}
		System.out.println("Tech 1 TreeSet\n"+varTreeSet);

		List<Character> varList=new ArrayList<Character>();
		for (Character c : s.toCharArray()) {
			if(!varList.contains(c)) {
				varList.add(c);
			}
		}
		System.out.println("Tech 2 List\n"+varList);
		Character [] varArray=new Character[s.length()];
		int count=0;
		int status=0;
		for(int i=0;i<s.length();i++) {
			status=0;
			for(int j=i;j<s.length();j++) {
				if(s.charAt(i)!=s.charAt(j)) {
					//System.out.println(i+" "+j);
					for(int k=0;k<s.length();k++) {
						if(varArray[k]==null) break; 
						if(varArray[k]!=null) {
							if(s.charAt(i)==varArray[k] ) {
								status =1;
								break;
							}
						}
					}
					if(status==0) {
						varArray[count]=s.charAt(i);
						//System.out.println(varArray[count]);
						count++;
					}

				}
			}

		}
		System.out.println("Tech using Strings");
		for(int i=0;i<varArray.length;i++)
		System.out.print(varArray[i]+" ");



	}
}
