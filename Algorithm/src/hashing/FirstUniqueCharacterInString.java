package hashing;
/**
 * 387. Given a string,
 * find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUniqueCharacterInString {
	
	public static void main(String args[]) {
		String s= "daad";
		System.out.println(firstUniqChar(s));
	}

	public static int firstUniqChar(String s) {
		int index = -1;
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		HashMap<Integer, Integer> hashCount = new HashMap<Integer, Integer>();
		for(int i=s.length()-1; i>=0; i--) {
			if(!hash.containsKey(new Character(s.charAt(i)))) {
				hash.put(s.charAt(i), i);
				hashCount.put(i, 1);
			}
			else {
				index = hash.get(new Character(s.charAt(i)));
				hashCount.put(index, 2);
			}
		}
		index=-1;
		for(Integer Key: hashCount.keySet()) {
			Integer Value = hashCount.get(Key);
			if(Value<=1) {
				if(index==-1)
					index= Key;
				else if(Key<index)
					index= Key;
			}
		}
		return index;
	}
}

/**
 * Alternate accurate solution
 * int[] map = new int[26];
        int index = s.length();
        
        for(char i='a';i<='z';i++) {
            int loc = s.indexOf(i);
            if(loc != -1 && s.lastIndexOf(i) == loc)
                index = Math.min(loc, index);
        }
        return (index == s.length())? -1 : index;
 **/
