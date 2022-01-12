package com.vise.vise;

import java.lang.reflect.Field;
import java.util.ArrayList;

import com.vise.vise.models.FieldDescriptor;

public class ServiceBase {
	
	public ServiceBase() {
		
	}
	
	public ArrayList<FieldDescriptor> getMetadata(iModel _model) {
		Class<? extends iModel> dynamicClass = _model.getClass();
		ArrayList<FieldDescriptor> fields = new ArrayList<FieldDescriptor>();
		for (Field fieldName : dynamicClass.getDeclaredFields()) {
			fields.add(new FieldDescriptor(TypesConverter.getHTMLType(fieldName.getType()), fieldName.getName()));
		}
		return fields;
	}
}
