package com.fly.flavis;

import org.springframework.http.MediaType;

public class XStreamMarshaller implements IMarshaller {
    private XStream xstream;

    public XStreamMarshaller() {
        super();
        xstream = new XStream();
    }

    public String getMime() {
        return MediaType.APPLICATION_XML.toString();
    }
}