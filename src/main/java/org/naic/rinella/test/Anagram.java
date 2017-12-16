package org.naic.rinella.test;

import java.util.HashMap;

public class Anagram {
	
	
	public static void main(String[] args) {
		
		try {
			if(args.length < 2) {
				throw new Exception("There must be two arguments.");
			}
			else if(args.length > 2) {
				throw new IllegalArgumentException("There only needs to be two arguments.");
			}
			else {
				System.out.println(IsAnagram(args[0],args[1]));
				//System.out.println(IsAnagram("THE eyes","THEY sEE"));
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
	}
	static boolean IsAnagram(String arg1, String arg2) {
		
		char[] arg1Lower = arg1.toLowerCase().trim().toCharArray();
		char[] arg2Lower = arg2.toLowerCase().trim().toCharArray();
		
		HashMap<Character, Integer> arg1Map = GetLetterCount(arg1Lower);
		HashMap<Character, Integer> arg2Map = GetLetterCount(arg2Lower);
		
		return arg1Map.equals(arg2Map);
	}
	static HashMap<Character, Integer> GetLetterCount(char[] strArray){
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < strArray.length; i++) {
			if(strArray[i] != ' ') {
				if(map.containsKey((strArray[i]))){
			        int temp = map.get(strArray[i]);
			        map.put(strArray[i], ++temp);
			    } else {
			        map.put(strArray[i], 1);
			    }
			}
		}
		
		return map;
	}
}
