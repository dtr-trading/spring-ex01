package com.dtr.oas.config;
 
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
 
@Order(1)
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
  @Override 
  protected Class< ? >[] getRootConfigClasses() {  
    return new Class[] { }; 
  }  
 
  @Override 
  protected Class< ? >[] getServletConfigClasses() {  
    return new Class< ? >[] { WebAppConfig.class };  
  }  
 
  @Override 
  protected String[] getServletMappings() {  
    return new String[] { "/" };  
  }  
 
}