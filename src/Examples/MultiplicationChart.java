package Examples;

public class MultiplicationChart {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 6 ; j++) {
                System.out.print(j + "*" +i+ "=" + (j*i)+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10 ; j++) {
                System.out.print(j + "*" +i+ "=" + (j*i)+ " ");
            }
            System.out.println();
        }
    }
}
