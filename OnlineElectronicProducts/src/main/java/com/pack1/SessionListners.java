package com.pack1;

import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class SessionListners implements HttpSessionListener,HttpSessionAttributeListener {
	@Override
	public void sessionCreated(HttpSessionEvent hse) 
	{
		
		System.out.println(" session is created");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent hse) {
		
		System.out.println(" session is destroyed");
	}
	@Override

	public void attributeAdded(HttpSessionBindingEvent hsbl) 
	{
		System.out.println("attribute added: "+hsbl.getName());
		System.out.println(" ATTRIBUTE ADEDD   TO THE SESSION");
	}
	@Override
	
 public void attributeRemoved(HttpSessionBindingEvent hsbl) 
 {
	 System.out.println(" Attribute removed from the session Object");
 }

}
