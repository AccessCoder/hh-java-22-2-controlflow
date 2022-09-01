public class Loops {

    public static void main(String[] args) {

        factorial(10);

    }
//        public static int factorial(int n) {
//            int result = 1;
//            for (int i = 1; i <= n; i++) {
//                result *= i;
//            }
//            return result;
//        }

        public static int factorial(int n) {
            int result = 1;
            while (n > 0) {
                result *= n;
                n--;
            }
            return result;
        }


}
