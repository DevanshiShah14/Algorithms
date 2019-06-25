package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Given (Employee,Manager) List , find total employee count(direct and indirect) under each manager. 
// eg : (A,C), (B,C), (C,D), (E,F), (D,F)
// here A is employee of C, B is employee of C and so on
// Expected output - A = 0, B = 0, C = 2, D = 3, E = 0 , F = 5 

public class EmployeeCount {
	class EmployeeManager{
		String employee;
		String manager;
		public EmployeeManager(String employee, String manager) {
			this.employee = employee;
			this.manager = manager;
		}
	}
	
	public static void main(String args[]) {
		List<EmployeeManager> input = new ArrayList<EmployeeManager>();
		EmployeeCount empObj = new EmployeeCount();
		HashMap<String, Integer> result = empObj.getCount(input);
	}
	
	public HashMap<String, Integer> getCount(List<EmployeeManager> input){
		input.add(new EmployeeManager("A", "C"));
		input.add(new EmployeeManager("B","C"));
		input.add(new EmployeeManager("C", "D"));
		input.add(new EmployeeManager("E", "F"));
		input.add(new EmployeeManager("D", "F"));
		HashMap<String, Integer> result =new HashMap<>();
		for(EmployeeManager record : input) {
			int count = 0;
			if(result.containsKey(record.employee)) {
				count = result.get(record.employee);
			}
			else
				result.put(record.employee,0);
			if(result.containsKey(record.manager))
				count += result.get(record.manager);
			count += 1;
				result.put(record.manager, count);
		}
		return result;
	}
}
