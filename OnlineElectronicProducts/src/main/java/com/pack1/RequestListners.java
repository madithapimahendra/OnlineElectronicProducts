package com.pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
//@WebListener
public class RequestListners implements ServletRequestListener,ServletRequestAttributeListener {

	public void requestInitialiazed(ServletRequestEvent sre) 
	 {
		 System.out.println(" requeest Object created");
	 }
public void requestDestroyed(ServletRequestEvent sre) 
{
	


System.out.println(" request object destroyed");
}
@Override
public void attributeAdded(ServletRequestAttributeEvent srae)
{
	
System.out.println(" Attribute added the servletrequest object");
System.out.println(" Attribute name: "+ srae);
} 
public void attributeRemove(ServletRequestAttributeEvent srae) 
{
	
System.out.println(" attribute removed from the servlet object");
}
}
