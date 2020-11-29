package com.epam.calculator.parser.impl;

import com.epam.calculator.domain.ParserResult;
import com.epam.calculator.parser.StringParser;
import com.epam.calculator.parser.StringParserStrategy;

/**
 * @author Nikolai Lazarev
 */
public class UserInputParser implements StringParser<ParserResult> {

    @Override
    public ParserResult parser(StringParserStrategy<ParserResult> strategy) {
        return strategy.doStrategy();
    }
}
