public class CodingInterview {
    public static void main(String[] args) {
        System.out.println(seriesUp(3));
        System.out.println(seriesUp(4));
        System.out.println(seriesUp(2));
    }

    public static String seriesUp(int n) {
        String result = "";
        for(int i=0 ; i<=n ; i++){
            for(int s=1; s<=i ; s++){
                result+=s + " ";
            }
        }
        return result;
        }


    }


