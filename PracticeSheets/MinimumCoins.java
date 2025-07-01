import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumCoins {
     static List<Integer> minPartition(int N) {
        int a[] = {1,2,5,10,20,50,100,200,500,2000};
        List<Integer> l = new ArrayList<>();
        int i =a.length-1;
        while(i>=0 && N > 0){
            if(a[i] > N){
                i--;
            }
            else{
                l.add(a[i]);
                N -=a[i];
            }
        }
        return l;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(minPartition(n));
	}
}
