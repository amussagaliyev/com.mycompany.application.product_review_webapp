package com.mycompany.log;

import java.util.Map;

public class LogTrace
{
	public static long info(String source, String msg, Map<String, Object> parameters)
	{
		return -1;
	}
	public static long trace(String source, String msg, Map<String, Object> parameters)
	{
		return -1;
	}
	public static long error(Throwable t, String source, String msg, Map<String, Object> parameters)
	{
		return -1;
	}
	public static long warning(String source, String msg, Map<String, Object> parameters)
	{
		return -1;
	}
}
