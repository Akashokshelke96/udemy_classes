package revision;

public class Application {
    public static void main(String[] args) {
        Human akash = new Human();
//        akash.walk();

        Robot chitti = new Robot();
//        chitti.walk();

    walker(new Walkable() { //this is an example of anoynmous class
        @Override
        public void walk() {
            System.out.println("Aliens are walking");
        }
    });

    walker( () -> System.out.println("this is it"));

    }
    public static void walker(Walkable walkerEntity){
        walkerEntity.walk();
    }
}
