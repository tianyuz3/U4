public class Runner {
    public static void main(String[] args) {
        System.out.println(createSequence(0, 2, 10));
        System.out.println(createSequence(5, 3, 5));
    }

    public static String createSequence(int a, int b, int n) {
        String result = "";
        int s = a;
        for (int r = 1; r<n; r++){
            s+=r*b;
            result = s + "";
        }
        return result;
    }
}
