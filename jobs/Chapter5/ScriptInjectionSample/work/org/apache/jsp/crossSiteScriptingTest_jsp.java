package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crossSiteScriptingTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      java.util.Vector bbs = null;
      synchronized (application) {
        bbs = (java.util.Vector) _jspx_page_context.getAttribute("bbs", PageContext.APPLICATION_SCOPE);
        if (bbs == null){
          bbs = new java.util.Vector();
          _jspx_page_context.setAttribute("bbs", bbs, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');

  request.setCharacterEncoding("UTF-8");
  if (request.getParameter("userName")!=null) {
    bbs.add(request.getParameter("userName"));
    bbs.add(request.getParameter("body"));
  }

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("<title>簡易掲示板</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>お名前と書き込みをどうぞ。</h1>\n");
      out.write("<form action=\"crossSiteScriptingTest.jsp\" method=\"post\">\n");
      out.write("  <p>お名前　　: <input type=\"text\" name=\"userName\"></p>\n");
      out.write("  <p>本文　　　: <textarea name=\"body\"></textarea></p>\n");
      out.write("  <input type=\"submit\" value=\"投稿\">\n");
      out.write("</form>\n");
 for (int i=0; i < bbs.size(); i+=2) { 
      out.write("\n");
      out.write("  <HR>\n");
      out.write("  ");
      out.write("\n");
      out.write("  投稿者名：");
      out.print( bbs.get(i) );
      out.write("<BR>\n");
      out.write("  本文：<PRE>");
      out.print( bbs.get(i+1) );
      out.write("</PRE>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
