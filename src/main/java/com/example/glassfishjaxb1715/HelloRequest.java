package com.example.glassfishjaxb1715;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * @author Lars Uffmann, 2021-02-27
 * @since 0.8.1
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"name"})
@XmlRootElement(namespace = "http://demo.ws.example.com", name = "helloRequest")
public class HelloRequest {
  @XmlElement(required = true)
  private String name;

  public HelloRequest() {
    super();
  }

  public HelloRequest(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
