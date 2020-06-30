public class Main {

    public static void main(String[] args) {
        boolean canDice = true;
        int howOften = 0;
        do {
            int num = (int) (Math.random() * 6 + 1);
            howOften++;
            System.out.println("Du hast eine " + num + " gewürfelt!");
            if (num == 6){
                System.out.println("Du kannst nochmal würfeln!");
            }else{
                canDice = false;
                System.out.println("Ende! Du hast " + howOften + " gewürfelt!");
            }
        }while (canDice);
    }

}
