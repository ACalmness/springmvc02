package com.zhidi.util;

import java.util.Calendar;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		String[] split = source.split("-");
		 Calendar calendar = Calendar.getInstance();
		 
		if(null != source && 2<split.length){
		 calendar.set(Integer.parseInt(split[0]), Integer.parseInt(split[1])-1, Integer.parseInt(split[2]));
		 return calendar.getTime();
		}
		return null;
	}

}
