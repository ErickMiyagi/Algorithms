package Recursive;

public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println(fat(5));
    }
    public static int fat(int x){
        if(x == 1){
            return 1;
        } else {
            return x * fat(x - 1);
        }
    }
}
