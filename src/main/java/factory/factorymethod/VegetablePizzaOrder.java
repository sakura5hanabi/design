package factory.factorymethod;

public class VegetablePizzaOrder extends PizzaOrder{

    public VegetablePizzaOrder(String type,String ingredients) {
        super(type,ingredients);
    }

    @Override
    public Pizza createPizza(String type) {

        if("fruit".equals(type)){
            return new FruitPizza();
        }else {
            return null;
        }

    }
}
