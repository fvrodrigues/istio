package com.example.istio.authorizationtion;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;
import java.util.List;

public class JaegerInterceptor {

   private static HeaderJaeger headerJaeger =  new HeaderJaeger();

   public static ClientHttpRequestInterceptor propagate () {
       return (httpRequest , bytes , clientHttpRequestExecution) -> {
           ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
           for (String header : headerJaeger.getHeaders()) {
               System.out.print("HEADER" + servletRequestAttributes.getRequest().getHeader(header));
                httpRequest.getHeaders().add(header,servletRequestAttributes.getRequest().getHeader(header));
           }
           return clientHttpRequestExecution.execute(httpRequest,bytes);
       };
   }
}
