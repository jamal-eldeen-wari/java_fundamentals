/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab2;
import java.util.Arrays;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        int [] values = new int[]{2, 5, 3, 4,6,1,10};
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString(roll(5)));
        System.out.println(containsDuplicates(values));
        System.out.println(calculateAvg(values));
        System.out.println(Arrays.toString(arrayOfArrays(weeklyMonthTemperatures)));
    }
    public static int[] roll(int n){
        int min = 1;
        int max = 6;
        int [] rolls = new int[n];
        for(int i = 0; i<n;i++){
            rolls[i] = (int)Math.floor(Math.random()*(max-min+1)+min);

        }

        return rolls;
    }
    public static boolean containsDuplicates(int [] elements){
        int a;
        for (int i = 0; i<elements.length; i++){
            a =elements[i];
            for (int j = i+1; j<elements.length;j++){

                if (elements[j] == a){
                    return true;
                }
            }
        }

        return false;
    }
    public static double calculateAvg(int [] values){
        double avg = 0.0;
        double sum = 0;
        for(int i =0; i<values.length; i++){
            sum = sum+values[i];
        }
        avg = sum/values.length;
        return avg;
    }
    public static int[] arrayOfArrays(int [][]twoD){
        double [] avgArr = new double[twoD.length];
        for (int i = 0; i< twoD.length;i++){
            int sum = 0;
            int arrLength = twoD[i].length;
            for (int j = 0; j<arrLength;j++){
                sum =sum+twoD[i][j];
            }
            avgArr[i] = (double) sum/arrLength;

        }
        double comp = avgArr[0];
        for(double avg:avgArr){
            if (comp>=avg){
                comp=avg;
            }
        }

        int index = 0;
        for (int k = 0; k<avgArr.length;k++){
            if (comp==avgArr[k]){
                index=k;
            }
        }
        return twoD[index];
    }
}