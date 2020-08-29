package com.ass.client.config;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class DateDSerializer extends StdDeserializer<Date> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5956396946354578162L;

	protected DateDSerializer() {
		this(null);
	}

	protected DateDSerializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		String date = p.getText();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.parse(date);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
