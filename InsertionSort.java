public class InsertionSort{
    public static void insertionSort(int[] input) {
        for(int i=1; i<input.length-1;i++){
            int j= i-1;
            int temp=input[i];
            while(j>=0 && input[j]>temp){
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] input={34,21,4,76,21,45};
        insertionSort(input);
        for(int i=0; i<input.length;i++){
            System.out.println(input[i]+"");
        }
    }
}