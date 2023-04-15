package AplikacjaPierwsza;

public class App {
    public static void main(String[] args) {

Cat cat = new Cat();

Snake snake = new Snake();

cat.setName("Bruno");
cat.setAge(69);
cat.setRace("W łaty");

System.out.println(cat.getName());

cat.walk();

snake.walk();

    }
}
