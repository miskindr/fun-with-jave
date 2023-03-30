public class Expressions {
    static void addition(int score){
        int result = score + 1;
        System.out.println("The score after adding one to it is: " + result);
    }

    static void subtraction(int score){
        int result = score - 1;
        System.out.println("The score after subtracting one from it is: " + result);
    }

    static void multiplication(int score){
        int result = score * 2;
        System.out.println("The score after multipliying it by two is: " + result);
    }

    static void division(int score){
        int result = score / 1;
        System.out.println("The score after dividing it by one is: " + result);
    }

    static void modulus(int score){
        int result = score % 1;
        System.out.println("The score after useing modulus is: " + result);
    }

    public static void main(String[] args) {
        // Expressions
        int score;
        score = 1;
        
        // Pass score to functions
        addition(score);
        subtraction(score);
        multiplication(score);
        division(score);
        modulus(score);    
      }
}
