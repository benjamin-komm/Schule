public class Main {

    public static void main(String[] args) {

        int gewinn = 0;
        int niete = 0;

        for (int i = 0; i < 10; i++){
            int num = (int) (Math.random() * 6 + 1);
            System.out.println("Du hast eine " + num + " gewürfelt!");
            if (num == 6){
                gewinn++;
                System.out.println("Gewinn!");
            }else{
                niete++;
                System.out.println("Niete!");
            }
        }

        System.out.println("Gewinne: " + gewinn);
        System.out.println("Nieten: " + niete);

    }

}
