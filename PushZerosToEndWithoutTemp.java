public class PushZerosToEndWithoutTemp{
    //coding ninjas solution code
    public static void pushZerosAtEndWithoutTemp(int[] arr) {
    	//Your code goes here
        
        int n = arr.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
    }
    //main code to check the solution.
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 9, 0, 0, 8, 1};
        pushZerosAtEndWithoutTemp(arr);
        printArray(arr);
    }
}