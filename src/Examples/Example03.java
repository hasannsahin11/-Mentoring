package Examples;

public class Example03 {
    //Write a Java program to convert seconds to hour, minute and seconds.

    public static void main(String[] args) {
        int sec = 86399;

        int min = sec%60;
        int hour = sec/3600;
        sec = 86399%60;
        System.out.println(hour+","+min+","+sec);

    }
}
