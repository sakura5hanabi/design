package factory.simpleFactory;

/**
 *
 * 静态简单工厂
 *
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type){
        if("Fruit".equals(type)){
            return new FruitPizza();
        }else if("Cheese".equals(type)){
            return new CheesePizza();
        }else {
            return null;
        }
    }
}
