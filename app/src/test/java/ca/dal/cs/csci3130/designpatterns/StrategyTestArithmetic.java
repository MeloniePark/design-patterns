package ca.dal.cs.csci3130.designpatterns;

import org.junit.Test;

import ca.dal.cs.csci3130.designpatterns.strategy.arithmetic.Add;
import ca.dal.cs.csci3130.designpatterns.strategy.arithmetic.Context;
import ca.dal.cs.csci3130.designpatterns.strategy.arithmetic.Multiply;
import ca.dal.cs.csci3130.designpatterns.strategy.arithmetic.Strategy;
import ca.dal.cs.csci3130.designpatterns.strategy.arithmetic.Subtract;

public class StrategyTestArithmetic {

    @Test
    public void testStrategy() {
        Strategy add = new Add();
        Context context = new Context(add);
        context.executeStrategy(10, 5);

        Strategy subtract = new Subtract();
        context = new Context(subtract);
        context.executeStrategy(10, 5);

        Strategy multiply = new Multiply();
        context = new Context(multiply);
        context.executeStrategy(10, 5);
    }
}
