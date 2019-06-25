package hashing;

import java.util.HashSet;

/*mock test leetcode
Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 

 

Example 1:

Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails*/

public class numUniqueEmails {
	public static void main(String args[]) {
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		numUniqueEmails obj = new numUniqueEmails();
		System.out.println(obj.numUniqueEmails(emails));
	}
	public int numUniqueEmails(String[] emails) {
		HashSet<String> input = new HashSet<>();
		for(String email : emails) {
			String[] nameDomain = email.split("@");
			String name = "";
			String fName = nameDomain[0];
			for(int i=0; i< fName.length(); i++) {
				if(fName.charAt(i)!='+' && fName.charAt(i)!= '.') {
					name += fName.charAt(i);
				}
				else if(fName.charAt(i)=='+')
					break;
				else
					continue;
			}
			name = name+"@"+ nameDomain[1];
			if(!input.contains(name))
				input.add(name);
		}
		return input.size();
	}
}
