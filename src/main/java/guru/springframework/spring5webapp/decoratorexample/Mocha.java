package guru.springframework.spring5webapp.decoratorexample;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
