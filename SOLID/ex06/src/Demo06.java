public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        aviary.release(new Parrot());
        aviary.release(new Penguin());
    }
}
