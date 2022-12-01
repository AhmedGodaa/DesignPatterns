import org.example.strategy.Duck;
import org.example.strategy.DuckType.FlyingDuck;
import org.example.strategy.DuckType.SickDuck;
import org.example.strategy.FlyingBehaviour.NotFly;

public class Simulator {
    public static void main(String[] args) {
        Duck duck = new SickDuck();
        duck.perform();
    }
}
