package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Project401Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		String var3=req.getParameter("var3");
		int a= Integer.parseInt(var3);
		String hexstr = Integer.toHexString(a);
		String var4=req.getParameter("var4");
		int b = Integer.parseInt(var4);
		String hexstr1 = Integer.toHexString(b);
		int len =  hexstr. length (); 
	    byte [] data =  new  byte [ len /  2 ]; 
	    for  ( int i =  0 ; i < len ; i +=  2 )   
	        data [ i /  2 ]  =  ( byte )  (( Character . digit ( hexstr . charAt ( i ),  16 )  <<  4 ) 
	        					+  Character . digit ( hexstr . charAt ( i + 1 ),  16 )); 
	    resp.getWriter().println();
	}
}
