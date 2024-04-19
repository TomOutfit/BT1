package btvn;

public class Baitap1 {
    
    public static void main(String[] args) {
        int a = 11;
        int b = 7;
        boolean isPrime = Prime(a);
        boolean isOdd = Odd(b);
        if (isPrime && isOdd){
            System.out.println("Correct");   
        } else {
            System.out.println("Incorrect");
        }
        }
    public static boolean Prime(int n){
        if (n < 2) {
        return false;
        }
        int squareRoot = (int) Math.sqrt(n);//Gọi squareRoot có giá trị bằng căn bậc 2 của n
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean Odd(int j) {
        if(j % 2 != 0){
            return true;
           } else {
            return false;
        }  
    }
    }