class Solution {
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] arr) {
        int n = arr.length;

        int i=0;
        int j=n-1;
        int k=-1;

        while(j>=i)
        {
            if(arr[i]==2)
            {
                swap(arr,i,j);
                j--;
            }
            else if(arr[i]==0)
            {
                k++;
                swap(arr,k,i);
                i++;
            }
            else{
                i++;
            }
        }
    }
}