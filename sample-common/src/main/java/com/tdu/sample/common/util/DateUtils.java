package com.tdu.sample.common.util;

import java.util.Date;

import org.joda.time.DateTime;

public class DateUtils {

	final static String FORMATYMD = ("yyyyMMdd");
	final static String FORMAT_YMD = ("yyyy-MM-dd");
	final static String FORMAT_YMDHMS = ("yyyy-MM-dd HH:mm:ss");
	final static String FORMAT_YMD年月日 = ("yyyy年MM月dd日");

	public static String toStringYmd(Date date) {
		return new DateTime(date).toString(FORMATYMD);
	}

	public static String toStringLYmd(Date date) {
		return new DateTime(date).toString(FORMAT_YMD);
	}

	public static String toStringLYmdHms(Date date) {
		return new DateTime(date).toString(FORMAT_YMDHMS);
	}

	public static String toStringLYmd年月日(Date date) {
		return new DateTime(date).toString(FORMAT_YMD年月日);
	}
}
