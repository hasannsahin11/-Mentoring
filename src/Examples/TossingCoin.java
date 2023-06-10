package Examples;

public class TossingCoin {
    public static void main(String[] args) {
        String tossResult = "";
        int countHeads = 0;
        int countTails = 0;

        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 2) + 1;
            switch (randomNumber) {
                case 1:
                    tossResult = "Heads";
                    break;
                case 2:
                    tossResult = "Tails";
                    break;
            }
            if (tossResult.equals("Heads")) {
                countHeads++;
            } else {
                countTails++;
            }
        }
        System.out.println(countHeads + " Heads");
        System.out.println(countTails + " Tails");
    }
}
