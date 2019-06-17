package com.maven.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * 格式化时间为字符串形式
     * @param date 传入需要格式化的时间
     * @param patt 传入需要转换为的格式
     * @return 字符串时间
     */
    public static String getDateStr(Date date, String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }

    /**
     * 将字符串时间转换为date
     * @param str 需要转换的字符串时间
     * @param patt 需要转换的格式
     * @return date时间
     * @throws ParseException
     */
    public static Date getDate(String str,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }
}
