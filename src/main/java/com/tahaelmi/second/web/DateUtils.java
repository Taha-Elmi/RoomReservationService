package com.tahaelmi.second.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date createDateFromDateString(String dateString) {
        if (dateString == null)
            return new Date();

        try {
            return DATE_FORMAT.parse(dateString);
        } catch (ParseException parseException) {
            return new Date();
        }
    }
}
