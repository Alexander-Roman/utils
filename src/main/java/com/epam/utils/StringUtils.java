package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {

    public boolean isPositiveNumber(String str) throws NumberFormatException {
        if (!NumberUtils.isCreatable(str)) {
            return false;
        }
        BigDecimal bigDecimal = NumberUtils.createBigDecimal(str);
        return bigDecimal.compareTo(BigDecimal.ZERO) > 0;
    }
}