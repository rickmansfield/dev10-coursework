import java.util.Scanner;

public class RNA {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is the sequence of RNA you want transcribed?");
        String original = console.nextLine();
        String result = transcribe(original);
        System.out.println(result);
    }

    public static String transcribe(String originalRNA) {
        char base;
        String result = "";
        for(int i = 0; i < originalRNA.length(); i++){
            base = originalRNA.charAt(i);
            switch (base) {
                case 'A':
                    result += 'U';
                    break;
                case 'C':
                    result += 'G';
                    break;
                case 'G':
                    result += 'C';
                    break;
                case 'U':
                    result += 'A';
                    break;
                default:
                    result += originalRNA.charAt(i);
                    ////if it's not a valid base, it doesn't change the character
                    break;
            }
        }
        return result;
    }
}
