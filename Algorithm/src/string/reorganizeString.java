package string;

import java.util.PriorityQueue;

/*767. Reorganize String
Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.

If possible, output any possible result.  If not possible, return the empty string.

Example 1:

Input: S = "aab"
Output: "aba"
Example 2:

Input: S = "aaab"
Output: ""
Note:

S will consist of lowercase letters and have length in range [1, 500].*/

public class reorganizeString {
	class MultiChar{
		int count;
		char letter;
		public MultiChar(int x, char ch) {
			count = x;
			letter = ch;
		}
	}
	public static void main(String args[]) {
		String S = "aabb";
		reorganizeString obj = new reorganizeString();
		System.out.println(obj.reorganizeString(S));
	}

	public String reorganizeString(String S) {
		int size = S.length();
		int[] count = new int[26];
		for (char c : S.toCharArray())
			count[c - 'a']++;
		
		PriorityQueue<MultiChar> input = new PriorityQueue<MultiChar>((a,b)-> a.count==b.count? a.letter - b.letter : b.count-a.count);
		StringBuilder result = new StringBuilder();
		for(int i=0; i<26; i++) {
			if(count[i]>0) {
				if(count[i]> (size+1)/2) return "";
				else {
					input.add(new MultiChar(count[i], (char) (i+'a')));
				}
			}
		}
		
		while(input.size()>=2) {
			MultiChar max1 = input.poll();
			MultiChar max2 = input.poll();
			result.append(max1.letter);
			result.append(max2.letter);
			if(max1.count>1) {
				max1.count--;
				input.add(max1);
			}
			if(max2.count>1) {
				max2.count--;
				input.add(max2);
			}
		}
		if(input.size()==1) {
			MultiChar max1 = input.poll();
			result.append(max1.letter);
		}
		
		return result.toString();
	}
}
