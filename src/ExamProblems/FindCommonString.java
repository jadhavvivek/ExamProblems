package ExamProblems;

public class FindCommonString {
    
	public static void main(String[] args) {
	    {
	        String str1 = "abcdefghik";
	        String str2 = "aecfghikes";
	        
	        int[][] ab = new int[str1.length() + 1][str2.length() + 1];
	        int maxLength = 0;
	        int endIndex = 0;
	        for (int i = 1; i <= str1.length(); i++) 
	        {
	            for (int j = 1; j <= str2.length(); j++) 
	            {
	                if (str1.substring(i - 1, i).equals(str2.substring(j - 1, j))) 
	                {
	                    ab[i][j] = ab[i - 1][j - 1] + 1;
	                    if (ab[i][j] > maxLength) 
	                    {
	                        maxLength = ab[i][j];
	                        endIndex = i;
	                    }
	                }
	            }
	        }
	        String longestCommonSubstring = str1.substring(endIndex - maxLength, endIndex);
	        System.out.println("Longest common substring is =  " + longestCommonSubstring);
	}
	}
}
