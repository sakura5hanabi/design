package factory.simpleFactory;

public class OrderPizza {

    public OrderPizza(String type){
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
    }


}
