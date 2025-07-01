import java.util.*;
public class Activity_Selection_problem
{
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int end = pairs[0][1];
        int cnt = 1;
        for(int i =1;i<pairs.length;i++){
            if(pairs[i][0] > end){
                end = pairs[i][1];
                cnt++;
            }
        }
        return cnt;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pairs[][] = new int[n][2];
		for(int i =0;i<n;i++){
		    pairs[i][0] = sc.nextInt();
		    pairs[i][1] = sc.nextInt();
		}
		System.out.println(findLongestChain(pairs));
	}
}
