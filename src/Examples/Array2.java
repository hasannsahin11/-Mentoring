package Examples;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {2,3,15,15,4,2};

        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-i-1]);
            System.out.println("It is not the same from the beginning and the end");
            break;
        }
    }
}
