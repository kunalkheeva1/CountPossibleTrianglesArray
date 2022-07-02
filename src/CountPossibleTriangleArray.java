public class CountPossibleTriangleArray {
    public static int countPossibleTriangleArray( int arr [], int n){
        int count = 0;
        int i, j, k;
        for(k = n-1; k>0; k++){
            i = 0;
            j = k-1;
            while(i<j){
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
