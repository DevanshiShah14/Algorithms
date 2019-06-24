package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Amazon Inteview
 * Given an array of integers and an integer k, you need to find the number of unique 
k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), 
where i and j are both numbers in the array and their absolute difference is k.
*/
public class K_Diff_Pair {
	class Interval {
		@Override
		public int hashCode() {
			int e,s;
			e = start > end ? start : end;
			s = start > end ? end: start;
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + e;
			result = prime * result + s;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Interval other = (Interval) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if ((end == other.end && start == other.start) || (end == other.start && start == other.end))
				return true;
			return false;
		}

		int start;
		int end;
		
		public Interval(int start, int end) {
			this.start = start;
			this.end= end;
		}

		private K_Diff_Pair getOuterType() {
			return K_Diff_Pair.this;
		}
	}
	public static void main(String args[]) {
		K_Diff_Pair kdif = new K_Diff_Pair();
		int[] nums = {-6,-7,-9,-8,-6,-8,-7};
		int k = 1;
		Set<Interval> results = kdif.findPair(nums, k);
		for(Interval result: results) {
			System.out.println(String.format("Start %s, End %s", result.start, result.end));
		}
	}
	
	public Set<Interval> findPair(int[] nums, int k) {
		Set<Interval> results = new HashSet<>();
		HashSet<Integer> hash = new HashSet<>();
		for(int i: nums) {
			int remLow = i-k;
			int remHigh = i+k;
			if(hash.contains(remLow)) {
				results.add(new Interval(i, remLow));
			}
			if(hash.contains(remHigh)) {
				results.add(new Interval(i, remHigh));
			}
			hash.add(i);
		}
		return results;
	}
}
