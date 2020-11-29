package com.epam.calculator.parser;

/**
 * @author Nikolai Lazarev
 */
public interface StringParser <T> {

    public T parser(StringParserStrategy<T> strategy);

}
