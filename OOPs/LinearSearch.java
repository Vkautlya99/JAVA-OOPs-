public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {4,3,7,11,99,44,77,10};
        int key = 4;
        boolean found = false;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                System.err.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        



    }
}
