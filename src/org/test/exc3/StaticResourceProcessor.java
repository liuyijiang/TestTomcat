package org.test.exc3;

import java.io.IOException;

import org.test.exc3.connector.http.HttpRequest;
import org.test.exc3.connector.http.HttpResponse;

public class StaticResourceProcessor {

  public void process(HttpRequest request, HttpResponse response) {
    try {
      response.sendStaticResource();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

}
