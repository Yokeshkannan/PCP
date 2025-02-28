public class Main {
    public static void main(String[] args) {
        char ch = 'a';
        int ascii = ch; 
        int castAscii = (int) ch;  // Explicit cast

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
