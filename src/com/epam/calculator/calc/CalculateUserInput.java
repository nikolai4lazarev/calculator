package com.epam.calculator.calc;

/**
 * @author Nikolai Lazarev
 */
public interface CalculateUserInput <T extends CalculateStrategy, R> {

    public R calculate(CalculateStrategy strategy);

}
