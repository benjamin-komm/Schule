public class Audio implements Media {

    @Override
    public void play() {
        System.out.println("Play Audio");
    }

    @Override
    public void stop() {
        System.out.println("Stop Audio");
    }

    @Override
    public void display() {
        System.out.println("Display Audio");
    }
}
