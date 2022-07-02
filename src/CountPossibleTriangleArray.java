import java.util.Arrays;

public class CountPossibleTriangleArray {

    public static int countPossibleTriangleArray( int arr [], int n){
        //sort the array first, to get the largest elements at the end of the array
        Arrays.sort(arr);
        int count = 0;
        int i, j, k;
        //let the last pointer be constant
        for(k = n-1; k>0; k++){
            i = 0;
            j = k-1;
            //move first and second pointer
            while(i<j){
                //if sum of two initial elements is greater than last greatest
                //then count will be count +j-i, as when all other possibilities will be smaller than arr[k]
                // 1,3, 4,5, .....k
                if(arr[i] + arr[j] >arr[k]){
                    count += (j-i);
                    j--;
                }else{
                    i++;
                }
            }

        }return count;
    }

    public static void main(String[] args) {

    }
}
