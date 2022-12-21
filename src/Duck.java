public class Duck extends Animal implements Flyable{
    public String sound(){
        return "quack";
    }

    @Override
    public void fly() {

    }

    @Override
    public void glide() {

    }

    public void clean(Animal animal){
        System.out.println(this.toString() + " is cleaning " + animal.toString());
    }
}
