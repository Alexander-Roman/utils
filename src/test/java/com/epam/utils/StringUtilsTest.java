package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @ParameterizedTest
    @MethodSource("provideNegativeNumbersAsStrings")
    public void testIsPositiveNumberShouldReturnFalseWhenNumberIsNegative(String number) {
        //given
        //when
        boolean actual = stringUtils.isPositiveNumber(number);
        //then
        Assertions.assertFalse(actual);
    }

    private static Stream<String> provideNegativeNumbersAsStrings() {
        return Stream.of(
                String.valueOf(Byte.MIN_VALUE),
                String.valueOf(Short.MIN_VALUE),
                String.valueOf(-1),
                String.valueOf(Integer.MIN_VALUE),
                String.valueOf(-1L),
                String.valueOf(Long.MIN_VALUE),
                String.valueOf(-Float.MIN_VALUE),
                String.valueOf(-Double.MIN_VALUE),
                BigDecimal.valueOf(Long.MIN_VALUE, Integer.MAX_VALUE).toString()
        );
    }
}