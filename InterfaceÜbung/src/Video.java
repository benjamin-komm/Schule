public class Video implements Media {

    @Override
    public void play() {
        System.out.println("Play Video");
    }

    @Override
    public void stop() {
        System.out.println("Stop Video");
    }

    @Override
    public void display() {
        System.out.println("Display Video");
    }
}
