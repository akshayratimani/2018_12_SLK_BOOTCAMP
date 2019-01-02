package com.slk.training.web.tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	private String format = null;
	
	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public int doStartTag() throws JspException {
		// "out" is the same variable, which is available in the JSP
		// never close "out"
		JspWriter out = pageContext.getOut();
		try {
			if(format==null) {
				out.print(new Date());
			}
			else {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				out.print(sdf.format(new Date()));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new JspException(e);
		}
		return super.doStartTag();
	}
	
}
