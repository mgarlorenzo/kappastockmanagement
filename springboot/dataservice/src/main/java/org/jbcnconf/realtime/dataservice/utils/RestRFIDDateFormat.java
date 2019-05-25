package org.jbcnconf.realtime.dataservice.utils;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.util.ISO8601Utils;
import java.text.FieldPosition;
import java.util.Date;
import java.util.TimeZone;

public class RestRFIDDateFormat extends ISO8601DateFormat
{
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition)
    {
        String value = ISO8601Utils.format(date, true);
        toAppendTo.append(value);
        return toAppendTo;
    }

    public static String format(long date)
    {
        return ISO8601Utils.format(new Date(date), true, TimeZone.getTimeZone("UTC"));
    }

    public static String formatCurrent()
    {
        return ISO8601Utils.format(new Date(System.currentTimeMillis()), true, TimeZone.getTimeZone("UTC"));
    }

    public static String formatCurrentLocal()
    {
        return ISO8601Utils.format(new Date(System.currentTimeMillis()), true, TimeZone.getDefault());
    }
}