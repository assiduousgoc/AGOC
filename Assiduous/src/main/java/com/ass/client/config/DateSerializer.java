package com.ass.client.config;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DateSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		String formated_date = "";
		try {
			formated_date = fmt.format(value);
		} catch (Exception e) {
			formated_date = new SimpleDateFormat("MM/dd/yyyy").format(value);
		}
		gen.writeString(formated_date);

	}

}
