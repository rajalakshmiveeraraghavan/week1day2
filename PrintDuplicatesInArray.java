package week1.day2.assignments;

public class PrintDuplicatesInArray {
	
public static void main(String[] args) {
	
	int[]arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int length = arr.length;
	 	 int count;
	 	 
	 for(int x =0; x<length-1;x++) {
		count =0;
		
		for(int i=x+1;i<length;i++) {
			if(arr[x]==arr[i]) {
				count = count+1;
			}
			}
			if(count>0) {
				System.out.println(arr[x]);
		}
}
}
}
