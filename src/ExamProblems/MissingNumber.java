package ExamProblems;
import java.util.Arrays;
public class MissingNumber {
public static void main(String args[]) {
	int arr[]= {-3,7,5,6,-5,1,4,2,-1};
	int missing[]=findMissingNumbers(arr);
	Arrays.sort(missing);
	System.out.println("Missing Number in the array:"+Arrays.toString(missing));
}
public  static int[] findMissingNumbers(int[]arr) {
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int num:arr)
{
		if(num>max) {
			max=num;
		}
		if(num<min) {
			min=num;
		}
}
	int[] counts=new int[max-min+1];
	for(int num:arr) {
		counts[num-min]++;
	}
	int numMissing=0;
	for(int count:counts) {
		if(count==0) {
			numMissing++;
		}
	}
	int[]missing=new int[numMissing];
	int index=0;
	for(int i=0;i<counts.length;i++) {
		if(counts[i]==0) {
			missing[index++]=i+min;
			
			
			
		}
	}
	
	
	return missing;
}


}
