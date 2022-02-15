package guru.springframework.spring5webapp.decoratorexample;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    public abstract String getDescription();


}
