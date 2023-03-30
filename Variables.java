public class Variables {
    static void myString(String words){
        System.out.println(words);
    }

    static void myInt(int numbers){
        System.out.println("This is a Int variable "+numbers);
    }

    static void myFloat(Float numbers){
        System.out.println("This is a Float variable "+numbers);
    }

    static void myChar(char character){
        System.out.println("This is a character variable "+character);
    }

    static void myBool(boolean bool){
        System.out.println("This is a Boolean variable "+bool);
    }
    // Using main to call functions that take diffrent kinds of variables
    
    public static void main(String[] args) {
        myString("This is a string variable.");
        myInt(5);
        myFloat(5.5f);
        myChar('A');
        myBool(false);
      }
}
    

