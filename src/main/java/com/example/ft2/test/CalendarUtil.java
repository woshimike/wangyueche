package com.example.ft2.test;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName: CalendarUtil 
 * @Description: 日期工具类
 * @author: lyq
 * @date: 2018年12月13日 上午10:11:44
 */
public class CalendarUtil {

	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_SINGLE_FORMAT = "yyyy-M-d";
	public static final String DATE_SLASH_FORMAT = "yyyy/MM/dd";
	public static final String DATE_SINGLE_SLASH_FORMAT = "yyyy/M/d";
	public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_NOT_SLASH_FORMAT = "yyyyMMddhhmmss";
	public static final String DATE_NOT_YY_FORMAT = "MM-dd";
	public static final String DATE_NOT_DD_FORMAT = "yyyy年MM月";
	public static final String DATE_FIRST_DAY = "yyyy-MM-01";
	public static final String DATE_YYMM_DAY = "yyyy-MM";
	public static final String DATE_YEAR_SLASH_FORMAT = "yyMMddhhmmss";

	public static final String DATE_YEAR= "yyyy";
	public static final String DATE_MMDD_MONTHDAY = "MM.dd";


	public static final String DATE_PATTERN_DAY_CHINNESS_DEFAULT = "yyyy年MM月dd日";
	public static final String DATE_PATTERN_DAY_CHINNESS = "【yyyy】年【MM】月【dd】";

	public static final String DATE_PATTERN_JUEST_DAY = "dd";
	
	public static String formatDateByStr(Date input, String str) {
		String returnValue = null;
		if (input != null) {
			returnValue = DateFormatUtils.format(input, str);
		}
		return returnValue;
	}

	public static String formatDate(Date input) {
		String returnValue = null;
		if (input != null) {
			returnValue = DateFormatUtils.format(input, DATE_FORMAT);
		}
		return returnValue;
	}

	public static String formatNotYDate(Date input) {
		String returnValue = null;
		if (input != null) {
			returnValue = DateFormatUtils.format(input, DATE_NOT_YY_FORMAT);
		}
		return returnValue;
	}

	public static String formatNotDDate(Date input) {
		String returnValue = null;
		if (input != null) {
			returnValue = DateFormatUtils.format(input,DATE_NOT_DD_FORMAT);
		}
		return returnValue;
	}


	public static String getDateNotSlashFormat(Date input){
		String returnValue = null;
		if (input != null) {
			returnValue = DateFormatUtils.format(input, DATE_NOT_SLASH_FORMAT);
		}
		return returnValue;
	}

	public static String getDateYearSlashFormat(Date input){
		String returnValue = null;
		if (input != null) {
			returnValue = DateFormatUtils.format(input, DATE_YEAR_SLASH_FORMAT);
		}
		return returnValue;
	}


	
	/**
	 * 按指定样式格式化时间
	 * @param input
	 * @param format
	 * @return
	 */
	public static String formatDate(Date input,String format) {
		String returnValue = null;
		if (input != null) {
			returnValue = DateFormatUtils.format(input, format);
		}
		return returnValue;
	}

	public static String formatDateTime(Date input) {
		String returnValue = null;
		if (input != null) {
			returnValue = DateFormatUtils.format(input, DATETIME_FORMAT);
		}
		return returnValue;
	}

	public static Date parseDate(String input) {
		Date result = null;
		try {
			result = DateUtils.parseDate(input, DATE_FORMAT);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static Date parseDateTime(String input) {
		Date result = null;
		try {
			result = DateUtils.parseDate(input, DATETIME_FORMAT);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static Date parseDateToMonth(String input) {
		Date result = null;
		try {
			result = DateUtils.parseDate(input, DATE_NOT_DD_FORMAT);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static Date parseDateToMonthTwo(String input) {
		Date result = null;
		try {
			result = DateUtils.parseDate(input, DATE_YYMM_DAY);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 日期之前
	 *
	 * @param date
	 * @param date2
	 * @return
	 */
	public static boolean isBefore(Date date, Date date2) {
		return null != date && null != date2 && date.before(date2);
	}

	/**
	 * 日期之前
	 *
	 * @param date
	 * @param date2
	 * @return
	 */
	public static boolean isEqualOrBefore(Date date, Date date2) {
		return null != date && null != date2 && (date.before(date2) || date.equals(date2));
	}


	/**
	 * 日期之后
	 *
	 * @param date
	 * @param date2
	 * @return
	 */
	public static boolean isAfter(Date date, Date date2) {
		return null != date && null != date2 && date.after(date2);
	}

	/**
	 * 日期之中
	 *
	 * @param date   目标日期
	 * @param date2     开始日期
	 * @param date3     结束日期
	 * @return
	 */
	public static boolean isBetween(Date date, Date date2, Date date3) {
		return null != date && isAfter(date, date2) && isBefore(date, date3);
	}
	
	/**
	 * @methodName:isBetweenEquals     
	 * @describe:日期之中 包括等于
	 * @author:liujun
	 * @date:2016年6月14日下午4:45:33
	 */
	public static boolean isBetweenEquals(Date date, Date date2, Date date3) {
		return 	!ObjectUtils.equals(null, date) &&
				(isAfter(date, date2) && isBefore(date, date3) 
				|| ObjectUtils.equals(date, date2)
				|| ObjectUtils.equals(date, date3));
	}
	
	/**
	 * 某一个日期n月相对应某一天 n 为负值表示向前 n 为正值表示向后
	 */
	public static Date calDateForMonth(Date date, int n) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, n);
		return c.getTime();
	}

	/**
	 * 某一个日期n天相对应某一天 n 为负值表示向前 n 为正值表示向后
	 */
	public static Date calDateForDay(Date date, int n) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, n);
		return c.getTime();
	}
	
	/**
	 * 某一个日期n天相对应某一天 n 为负值表示向前 n 为正值表示向后
	 */
	public static Date calDateForYear(Date date, int n) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.YEAR, n);
		return c.getTime();
	}

	/**
	 * 取某一个时间相对某一时间n小时向前或向后的时间
	 */
	public static Date calDateForHour(Date date, int n) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.HOUR_OF_DAY, n);
		return c.getTime();
	}

	/**
	 * 取某一时间相对某一时间n分钟向前或向后的时间
	 */
	public static Date calDateForMin(Date date, int n) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MINUTE, n);
		return c.getTime();
	}

	/**
	 * 获取时间+1 -1秒 秒
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date calDateForSecond(Date date, int n) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.SECOND, n);
		return c.getTime();
	}



	/**
	 * 当前月份最大天数
	 *
	 * @param date
	 */
	public static int currentMonthMaxDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}

	/**
	 * 计算日期天数差值
	 *
	 * @param early
	 * @param late
	 * @return
	 */
	public static final int daysBetween(Date early, Date late) {
		Calendar calst = Calendar.getInstance();
		Calendar caled = Calendar.getInstance();
		calst.setTime(early);
		caled.setTime(late);
		// 设置时间为0时
		calst.set(Calendar.HOUR_OF_DAY, 0);
		calst.set(Calendar.MINUTE, 0);
		calst.set(Calendar.SECOND, 0);
		caled.set(Calendar.HOUR_OF_DAY, 0);
		caled.set(Calendar.MINUTE, 0);
		caled.set(Calendar.SECOND, 0);
		// 得到两个日期相差的天数
		int days = ((int) (caled.getTime().getTime() / 1000) - (int) (calst.getTime().getTime() / 1000)) / 3600 / 24;
		return days;
	}

	/**
	 * 计算日期小时差值
	 *
	 * @param early
	 * @param late
	 * @return
	 */
	public static final int hoursBetween(Date early, Date late) {
		Calendar calst = Calendar.getInstance();
		Calendar caled = Calendar.getInstance();
		calst.setTime(early);
		caled.setTime(late);
		// 设置时间为0时
		calst.set(Calendar.MINUTE, 0);
		calst.set(Calendar.SECOND, 0);
		caled.set(Calendar.MINUTE, 0);
		caled.set(Calendar.SECOND, 0);
		// 得到两个日期相差的天数
		int hours = ((int) (caled.getTime().getTime() / 1000) - (int) (calst.getTime().getTime() / 1000)) / 3600;
		return hours;
	}

	/**
	 * 获取传入日期的开始时间 00:00:00
	 */
	public static final Date calBeginTimeForThisTime(Date date) {
		Calendar calst = Calendar.getInstance();
		calst.setTime(date);
		calst.set(Calendar.HOUR_OF_DAY, 0);
		calst.set(Calendar.MINUTE, 0);
		calst.set(Calendar.SECOND, 0);
		return calst.getTime();
	}

	/**
	 * 获取传入日期的结束时间 00:00:00
	 */
	public static final Date calEndTimeForThisTime(Date date) {
		Calendar calst = Calendar.getInstance();
		calst.setTime(date);
		calst.set(Calendar.HOUR_OF_DAY, 23);
		calst.set(Calendar.MINUTE, 59);
		calst.set(Calendar.SECOND, 59);
		return calst.getTime();
	}

	public static int getBetweenSecondNumberNotAbsolute(Date startDate, Date endDate) {
		if (startDate == null || endDate == null) {
			return -1;
		}
		long timeNumber = -1L;
		long TIME = 1000L;
		try {
			timeNumber = (endDate.getTime() - startDate.getTime()) / TIME;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return (int) timeNumber;
	}

	/**
	 * 忽略时间来判断两个日期是否相同天
	 *
	 * @param dateOne
	 * @param dateTwo
	 * @return
	 */
	public static boolean isSameDay(Date dateOne, Date dateTwo) {
		return DateUtils.isSameDay(dateOne, dateTwo);
	}

	/**
	 * 获取2个时间相隔几分钟,非绝对值
	 */
	public static int getMinutesNotAbsolute(Date startDate, Date endDate) {
		if (startDate == null || endDate == null) {
			return -1;}

		long timeNumber = -1L;
		long TIME = 60L * 1000L;
		try {
			timeNumber = (endDate.getTime() - startDate.getTime()) / TIME;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return (int) timeNumber;
	}

	/**
	 * 获取时间+N分钟的值
	 *
	 * @param date
	 * @param num
	 * @return
	 */
	public static Date getNextTime(Date date, int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		ca.setTime(date);

		int minute = ca.get(Calendar.MINUTE);
		minute = minute + num;
		ca.set(Calendar.MINUTE, minute);
		return ca.getTime();
	}

	/**
	 * 获取时间-N分钟的值
	 *
	 * @param date
	 * @param num
	 * @return
	 */
	public static Date getPreTime(Date date, int num) {
		Calendar ca = Calendar.getInstance();
		ca.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		ca.setTime(date);

		int minute = ca.get(Calendar.MINUTE);
		minute = minute - num;
		ca.set(Calendar.MINUTE, minute);
		return ca.getTime();
	}



	/**
	 * 将字符串转化为日期。 字符串格式("YYYY-MM-DD")。
	 * 例如："2012-07-01"或者"2012-7-1"或者"2012-7-01"或者"2012-07-1"是等价的。
	 */
	public static Date stringToDate(String str, String pattern) {
		Date dateTime = null;
		try {
			SimpleDateFormat formater = new SimpleDateFormat(pattern);
			dateTime = formater.parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateTime;
	}
	/**
	 * 根据指定格式获取日期数据
	 */
	private static String getFormatDateTime(Date date, String pattern) {
		if (null == date) {
			return "";
		}
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		format.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		return format.format(date);
	}
	/**
	 * 给定一个日期和天数，得到这个日期+天数的日期
	 */
	public static String getNextDay(String date, int num,String format) {
		Date d = stringToDate(date, format);
		Calendar ca = Calendar.getInstance();
		ca.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		ca.setTime(d);

		int day = ca.get(Calendar.DATE);
		day = day + num;
		ca.set(Calendar.DATE, day);
		return getFormatDateTime(ca.getTime(), format);

	}

	/**
	 * 将日期转化为字符串
	 */
	public static String dateToString(Date date, String pattern) {
		String str = "";
		try {
			SimpleDateFormat formater = new SimpleDateFormat(pattern);
			str = formater.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * 将字符串转化为日期
	 */
	public static Date stringToDateTime(String str)  {
		return parseDateTime(str);
	}
	/**
	 * @Description 获取当前时间的numDate后的日期
	 * @param startDate
	 * @param numDate
	 * @return
	 */
	public static String getSomeDate(Date startDate,int numDate){
		String open_time = formatDateTime(startDate);
		return getNextDay(open_time,numDate,DATETIME_FORMAT);
	}
 

	/**
	 * @methodName:getWeek     
	 * @describe:返回当前日期所在年份周
	 * @author:liujun
	 * @date:2016年6月15日上午11:48:03
	 */
	public static int getWeek(Date date){
		 Calendar cl = Calendar.getInstance();   
		 cl.setTime(date);   
		 return cl.get(Calendar.WEEK_OF_YEAR);   
	}

	
	/**
	 * 获取一个时间段所有时间
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static List<Date> getBetweenAllDate(Date startDate, Date endDate) {
		List<Date> lDate = new ArrayList<Date>();
		lDate.add(startDate);// 把开始时间加入集合
		Calendar cal = Calendar.getInstance();
		// 使用给定的 Date 设置此 Calendar 的时间
		cal.setTime(startDate);
		boolean bContinue = true;
		while (bContinue) {
			// 根据日历的规则，为给定的日历字段添加或减去指定的时间量
			cal.add(Calendar.DAY_OF_MONTH, 1);
			// 测试此日期是否在指定日期之后
			if (endDate.after(cal.getTime())) {
				lDate.add(cal.getTime());
			} else {
				break;
			}
		}
		lDate.add(endDate);// 把结束时间加入集合
		return lDate;
	}
	
	/**
	 * @methodName:getFirstDayOfMonth
	 * @describe:返回指定年月第一天
	 * @author:liujun
	 * @date:2016年4月19日下午12:56:26
	 */
	public static Date getFirstDayOfMonth(Integer year, Integer month) {
		Calendar calendar = Calendar.getInstance();
		if (year == null) {
			year = calendar.get(Calendar.YEAR);
		}
		if (month == null) {
			month = calendar.get(Calendar.MONTH);
		}
		calendar.set(year, month-1, 1);
		return calendar.getTime();
	}

	/**
	 * @methodName:getLastDayOfMonth
	 * @describe:获得指定年月 最后一天
	 * @author:liujun
	 * @date:2016年4月19日下午12:55:41
	 */
	public static Date getLastDayOfMonth(Integer year, Integer month) {
		Calendar calendar = Calendar.getInstance();
		if (year == null) {
			year = calendar.get(Calendar.YEAR);
		}
		if (month == null) {
			month = calendar.get(Calendar.MONTH);
		}
		calendar.set(year, month-1, 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * @methodName:getLastDayOfMonth
	 * @describe:获得但前时间所在月的第一天
	 * @parms:date当前时间
	 * @auth:liujun
	 * @date:2016年4月19日
	 */
	public static Date getFirstDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
		return calendar.getTime();
	}

	/**
	 * @methodName:getLastDayOfMonth
	 * @describe:获得但前时间所在月的最后一天
	 * @parms:date当前时间
	 * @auth:liujun
	 * @date:2016年4月19日
	 */
	public static Date getLastDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * 获取最大时间是否相同
	 * @param date
	 * @return
	 */
	public static boolean maxTime(Date date){
		Date maxDate = CalendarUtil.parseDate("2330-12-31");
		if(ObjectUtils.equals(maxDate,date)){
			return true;
		}
		return false;
	}

	/**
	 * 毫秒数转换时间
	 * @param currentMillis 当前时间毫秒数
	 * @return
	 */
	public static Date parseTimeMillis(Long currentMillis){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(currentMillis);
		return calendar.getTime();
	}

	/**
	 * 获得当前时间
	 * @return
	 */
	public static Date getCurrentTime(){
		return new Date();
	}
}
