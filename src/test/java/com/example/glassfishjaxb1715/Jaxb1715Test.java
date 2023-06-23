package com.example.glassfishjaxb1715;

import static org.assertj.core.api.Assertions.assertThat;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.xml.transform.StringResult;

class Jaxb1715Test {

  @Test
  void marshallWith403AndDefaultNamespaceRemapShouldNotChangeXmlOutput() throws JAXBException {
    String expectedXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns2:helloRequest xmlns:ns2=\"http://demo.ws.example.com\"><name>Klaus</name></ns2:helloRequest>";
    HelloRequest helloRequest = new HelloRequest("Klaus");
    Map<String, Object> properties = new HashMap<>();
    properties.put("org.glassfish.jaxb.defaultNamespaceRemap", "http://demo.ws.example.com");
    JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{HelloRequest.class}, properties);
    Marshaller marshaller = jaxbContext.createMarshaller();
    StringResult result = new StringResult();
    marshaller.marshal(helloRequest, result);
    assertThat(result.toString()).isEqualTo(expectedXml);
  }
}
