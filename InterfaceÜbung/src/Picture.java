public class Picture implements Media {

    @Override
    public void play() {
        System.out.println("Play Picture");
    }

    @Override
    public void stop() {
        System.out.println("Stop Picture");
    }

    @Override
    public void display() {
        System.out.println("Display Picture");
    }
}
