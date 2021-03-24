public class Repetition2 {
    public static void main(String[] args) {
//        for (int i = 3; i < 21; i +=3) {
//            System.out.println(i);
//        }
        int count = 1;

//        for (int i = 1; i < 30; i += count++) {
//        System.out.println(i);
//        }


        while (count <30) {
            System.out.println(count += count++);
        }

    }
}
