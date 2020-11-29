package com.epam;

import com.epam.calculator.calc.CalculateStrategy;
import com.epam.calculator.calc.CalculateUserInput;
import com.epam.calculator.calc.impl.CalculateUserInputImpl;
import com.epam.calculator.calc.impl.CalculateUserInputStrategy;
import com.epam.calculator.ui.ListenUserInput;
import com.epam.calculator.ui.ListenUserInputImpl;

public class Main {

    public static void main(String[] args) {
        ListenUserInput<String> userListener = new ListenUserInputImpl();
        CalculateUserInput<CalculateUserInputStrategy, Double> calculateUserInput = new CalculateUserInputImpl();
        CalculateStrategy<Double> calculateStrategy = new CalculateUserInputStrategy();
        String userInput = userListener.listenUserInput();
        Double result = calculateUserInput.calculate(calculateStrategy);
        System.out.println(result);
    }
}
