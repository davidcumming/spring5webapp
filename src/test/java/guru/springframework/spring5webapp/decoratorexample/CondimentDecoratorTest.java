package guru.springframework.spring5webapp.decoratorexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondimentDecoratorTest {

    @Test
    public void doTest(){
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }

}