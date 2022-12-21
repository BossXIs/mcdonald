public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        System.out.println(pig.sound());

        Duck donald = new Duck();
        Duck daisy = new PekingDuck();

        donald.clean(new Cow());

        daisy.clean(donald);

    }
}