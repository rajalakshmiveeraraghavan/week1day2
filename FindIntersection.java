package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[]empid = {3,2,11,4,6,7};
		
		int[]age = {1,2,8,4,9,7};
		
		int length1 = empid.length;
		int length2 = age.length;
		
		for(int i=0;i<length1;i++) {
		
			for(int j=0;j<length2;j++) {
		
		if(empid[i]==age[j])
		{
			System.out.println(empid[i]);
		}
		}
	}
}
}