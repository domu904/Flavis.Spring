package com.fly.flavis;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;

public class JacksonMarshaller implements IMarshaller {
    private ObjectMapper objectMapper;

    public JacksonMarshaller() {
        super();
        objectMapper = new ObjectMapper();
    }

    @Override
    public String getMime() {
        return MediaType.APPLICATION_JSON.toString();
    }
}