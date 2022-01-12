package com.vise.vise;

import java.lang.reflect.Type;

public class TypesConverter {

	public static String getSQLType(Type javaType) {
		if(javaType.equals(Long.class))
			return "INT";	
		if(javaType.equals(String.class))
			return "VARCHAR(50)";
		if(javaType.equals(float.class))
			return  "DECIMAL(10,2)";
		return "VARCHAR(10)";
	}
	
	public static String getHTMLType(Type javaType) {
		if(javaType.equals(Long.class))
			return "id";
		if(javaType.equals(float.class))
			return "number";
		return "text";
	}
}
