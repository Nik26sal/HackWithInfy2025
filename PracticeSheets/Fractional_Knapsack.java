import java.util.*;
public class Fractional_Knapsack
{
     static double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        double[][] items = new double[n][3];

        for (int i = 0; i < n; i++) {
            items[i][0] = values[i];
            items[i][1] = weights[i];
            items[i][2] = (double) values[i] / weights[i];
        }
        Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));
        double totalValue = 0.0;
        for (int i = 0; i < n && W > 0; i++) {
            double val = items[i][0];
            double wt = items[i][1];
            if (wt <= W) {
                totalValue += val;
                W -= wt;
            } else {
                totalValue += val * ((double) W / wt);
                W = 0;
            }
        }

        return totalValue;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int values[] = new int[n];
		for(int i =0;i<n;i++){
		    values[i] = sc.nextInt();
		}
		int weights[] = new int[n];
		for(int i = 0;i<n;i++){
		    weights[i] = sc.nextInt();
		}
		int Wt = sc.nextInt();
		System.out.println(fractionalKnapsack(values,weights,Wt));
	}
}
