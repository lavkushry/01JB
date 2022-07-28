public class BinarySearch{
    public static int binarySearch(int[] input, int elem) {
        int start =0;
        int end=input.length -1;
        while(start <= end){
            int mid=(start+end)/2;
            if(elem==input[mid]){
                return mid;
            }else if(elem>input[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input={12,23,42,15,77,21,3};
        int index=binarySearch(input,15);
        System.out.println(index);
    }
}