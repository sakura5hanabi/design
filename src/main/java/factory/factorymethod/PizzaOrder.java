package factory.factorymethod;

public abstract class PizzaOrder {

    public PizzaOrder(String type,String ingredients) {
        orderPizza(type,ingredients);
    }

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type,String ingredients) {
        if ("vegetable".equals(type)) {
            PizzaOrder pizzaOrder = new VegetablePizzaOrder(type,ingredients);
            pizzaOrder.createPizza(ingredients);
        }
        return null;
    }

}
