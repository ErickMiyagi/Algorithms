package Search;

public class binarySearch {
    public static void main(String[] args) {
        int[] list = {10,29,32,1,203,23,48,1238};
        System.out.println(searchBinary(list, 6));
    }
    public static Integer searchBinary(int[] list, int number){
        int low = 0;
        int high = list.length - 1; // 4
        
        while(low <= high){
        int mid = (low + high) / 2; // 2
        int guess = list[mid]; //list[2] = 2
        if(guess == number){
            return mid; //false
        } else if(guess > number){
            high = mid - 1; //false
        } else {
            low = mid + 1; //true: low = 3
        }
    }
    return null;
    }
}
