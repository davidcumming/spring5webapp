package guru.springframework.spring5webapp.decoratorexample;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
