/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-02-25 12:24:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1548382399000L));
    _jspx_dependants.put("jar:file:/Users/jueun/Desktop/sts_workspace/GodOfDelivery/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/Users/jueun/Desktop/sts_workspace/GodOfDelivery/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("jar:file:/Users/jueun/Desktop/sts_workspace/GodOfDelivery/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005frequestEncoding_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005frequestEncoding_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005frequestEncoding_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_fmt_005frequestEncoding_005f0(_jspx_page_context))
        return;
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageTitle", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("배달의 신", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!-- Custom fonts for this template-->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/fontawesome-free/css/all.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template-->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/sb-admin-2.css\" rel=\"stylesheet\"> \n");
      out.write("<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("\t$(\"#dashBoard\").addClass(\"active\");\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(function(){\n");
      out.write("\tvar total = 0;\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/totalCostByMonthly.do\",\n");
      out.write("\t\ttype:\"post\",\n");
      out.write("\t\tsuccess : function(data){\n");
      out.write("\t\t\t$.each(data,function(index,item){\n");
      out.write("\t\t\t\tfor(var i in item){\n");
      out.write("\t\t\t\t\ttotal +=item[i];\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\"#totalCostByMonthly\").text(addComma(total)+\"원\");\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("function addComma(num) {\n");
      out.write("\t  var regexp = /\\B(?=(\\d{3})+(?!\\d))/g;\n");
      out.write("\t  return num.toString().replace(regexp, ',');\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("$(function(){\n");
      out.write("\tgoogle.charts.load('current', {packages: ['corechart', 'bar']});\n");
      out.write("\tgoogle.charts.setOnLoadCallback(drawBasic);\n");
      out.write("});\n");
      out.write("function drawBasic() {\n");
      out.write("\tvar one = 0;\n");
      out.write("\tvar two = 0;\n");
      out.write("\tvar three = 0;\n");
      out.write("\tvar four = 0;\n");
      out.write("\tvar five = 0;\n");
      out.write("\tvar six = 0;\n");
      out.write("\tvar seven = 0;\n");
      out.write("\tvar eight = 0;\n");
      out.write("\tvar month = new Date();\n");
      out.write("\t$.ajax({\n");
      out.write("\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/timeChart.do?month=now\",\n");
      out.write("\t\ttype : \"post\",\n");
      out.write("\t\tasync:\"false\",\n");
      out.write("\t\tsuccess : function(list){\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$.each(list,function(index,item){\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t  for(var i in item){\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  if(item[i] >= 9 && item[i] < 12){\n");
      out.write("\t\t\t\t\t  one +=1;\n");
      out.write("\t\t\t\t  }else if(item[i] >= 12 && item[i] < 15){\n");
      out.write("\t\t\t\t\t  two +=1;\n");
      out.write("\t\t\t\t  }else if(item[i] >= 15 && item[i] < 18){\n");
      out.write("\t\t\t\t\t  three +=1;\n");
      out.write("\t\t\t\t  }else if(item[i] >= 18 && item[i] < 21){\n");
      out.write("\t\t\t\t\t  four +=1;\n");
      out.write("\t\t\t\t  }else if(item[i] >= 21 && item[i] < 24){\n");
      out.write("\t\t\t\t\t  five +=1;\n");
      out.write("\t\t\t\t  }else if(item[i] >= 0 && item[i] < 3){\n");
      out.write("\t\t\t\t\t  six +=1;\n");
      out.write("\t\t\t\t  }else if(item[i] >= 3 && item[i] < 6){\n");
      out.write("\t\t\t\t\t  seven +=1;\n");
      out.write("\t\t\t\t  }else if(item[i] >= 6 && item[i] < 9){\n");
      out.write("\t\t\t\t\t  eight +=1;\n");
      out.write("\t\t\t\t  }\n");
      out.write("\t\t\t  }\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  var data = new google.visualization.arrayToDataTable([\n");
      out.write("\t\t\t\t  ['시간','판매량',{role:'style'}, { role: 'annotation' } ],\n");
      out.write("\t\t\t\t  ['09-12',one,'#FFF0F5',one],\n");
      out.write("\t\t\t\t  ['12-15',two,'#ADD8E6',two],\n");
      out.write("\t\t\t\t  ['15-18',three,'#E0FFFF',three],\n");
      out.write("\t\t\t\t  ['18-21',four,'#66CDAA',four],\n");
      out.write("\t\t\t\t  ['21-24',five,'#FFE4E1',five],\n");
      out.write("\t\t\t\t  ['24-03',six,'#FFDAB9',six],\n");
      out.write("\t\t\t\t  ['03-06',seven,'#DDA0DD',seven],\n");
      out.write("\t\t\t\t  ['06-09',eight,'#6A5ACD',eight],\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t  ]);\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t      var chart = new google.visualization.ColumnChart(\n");
      out.write("\t\t        document.getElementById('chart-time'));\n");
      out.write("\t\t\n");
      out.write("\t\t      chart.draw(data);\n");
      out.write("\t\t\t});/* each end */\n");
      out.write("\t\t} /* success function end */\n");
      out.write("      \n");
      out.write("\t}); /* ajax end  */\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- Page Wrapper -->\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/admin/sideBar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Content Wrapper -->\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("      <!-- Main Content -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("\n");
      out.write("        <!-- Begin Page Content -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Page Heading -->\n");
      out.write("          <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\">요약</h1>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Content Row -->\n");
      out.write("          <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("              <div class=\"card border-left-primary shadow h-100 py-2\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"row no-gutters align-items-center\">\n");
      out.write("                    <div class=\"col mr-2\">\n");
      out.write("                      <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\">일주일 판매량</div>\n");
      out.write("                      <div class=\"h5 mb-0 font-weight-bold text-gray-800\">870,000원</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                      <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("              <div class=\"card border-left-success shadow h-100 py-2\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"row no-gutters align-items-center\">\n");
      out.write("                    <div class=\"col mr-2\">\n");
      out.write("                      <div class=\"text-xs font-weight-bold text-success text-uppercase mb-1\">월간 판매량</div>\n");
      out.write("                      <div class=\"h5 mb-0 font-weight-bold text-gray-800\" id=\"totalCostByMonthly\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                      <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("              <div class=\"card border-left-info shadow h-100 py-2\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"row no-gutters align-items-center\">\n");
      out.write("                    <div class=\"col mr-2\">\n");
      out.write("                      <div class=\"text-xs font-weight-bold text-info text-uppercase mb-1\">새로운 판매자 신청</div>\n");
      out.write("                      <div class=\"row no-gutters align-items-center\">\n");
      out.write("                        <div class=\"col-auto\">\n");
      out.write("                          <div class=\"h5 mb-0 mr-3 font-weight-bold text-gray-800\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storePMSCount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("건</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                          <div class=\"progress progress-sm mr-2\">\n");
      out.write("                            <div class=\"progress-bar bg-info\" role=\"progressbar\" style=\"width: 50%\" aria-valuenow=\"100-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storePMSCount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                      <i class=\"fas fa-clipboard-list fa-2x text-gray-300\"></i>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Pending Requests Card Example -->\n");
      out.write("            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("              <div class=\"card border-left-warning shadow h-100 py-2\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"row no-gutters align-items-center\">\n");
      out.write("                    <div class=\"col mr-2\">\n");
      out.write("                      <div class=\"text-xs font-weight-bold text-warning text-uppercase mb-1\">새로운 문의</div>\n");
      out.write("                      <div class=\"h5 mb-0 font-weight-bold text-gray-800\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${qnaCount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("건</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                      <i class=\"fas fa-comments fa-2x text-gray-300\"></i>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Content Row -->\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Area Chart -->\n");
      out.write("            <!-- Bar Chart -->\n");
      out.write("              <div class=\"card shadow mb-4\">\n");
      out.write("                <div class=\"card-header py-3\" style=\"width:600px;\">\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">시간대별 판매량</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"chart-bar\" id=\"chart-time\">\n");
      out.write("                    <canvas id=\"myBarChart\">\n");
      out.write("                    \n");
      out.write("                    </canvas>\n");
      out.write("                  </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            <!-- Pie Chart -->\n");
      out.write("            <div class=\"col-xl-4 col-lg-5\">\n");
      out.write("              <div class=\"card shadow mb-4\" style=\"width:300px\">\n");
      out.write("                <!-- Card Header - Dropdown -->\n");
      out.write("                <div class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">카테고리별 판매량</h6>\n");
      out.write("                  <div class=\"dropdown no-arrow\">\n");
      out.write("                    <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                      <i class=\"fas fa-ellipsis-v fa-sm fa-fw text-gray-400\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right shadow animated--fade-in\" aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("                      <div class=\"dropdown-header\">Dropdown Header:</div>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">한식</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">양식</a>\n");
      out.write("                      <div class=\"dropdown-divider\"></div>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"#\">분식</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Card Body -->\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"chart-pie pt-4 pb-2\">\n");
      out.write("                    <canvas id=\"myPieChart\"></canvas>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"mt-4 text-center small\">\n");
      out.write("                    <span class=\"mr-2\">\n");
      out.write("                      <i class=\"fas fa-circle text-primary\"></i> 한식\n");
      out.write("                    </span>\n");
      out.write("                    <span class=\"mr-2\">\n");
      out.write("                      <i class=\"fas fa-circle text-success\"></i> 양식\n");
      out.write("                    </span>\n");
      out.write("                    <span class=\"mr-2\">\n");
      out.write("                      <i class=\"fas fa-circle text-info\"></i> 중식\n");
      out.write("                    </span>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Content Row -->\n");
      out.write("          <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Content Column -->\n");
      out.write("            <div class=\"col-lg-6 mb-4\">\n");
      out.write("\n");
      out.write("              <!-- Project Card Example -->\n");
      out.write("              <div class=\"card shadow mb-4\">\n");
      out.write("                <div class=\"card-header py-3\">\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">Projects</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h4 class=\"small font-weight-bold\">Server Migration <span class=\"float-right\">20%</span></h4>\n");
      out.write("                  <div class=\"progress mb-4\">\n");
      out.write("                    <div class=\"progress-bar bg-danger\" role=\"progressbar\" style=\"width: 20%\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <h4 class=\"small font-weight-bold\">Sales Tracking <span class=\"float-right\">40%</span></h4>\n");
      out.write("                  <div class=\"progress mb-4\">\n");
      out.write("                    <div class=\"progress-bar bg-warning\" role=\"progressbar\" style=\"width: 40%\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <h4 class=\"small font-weight-bold\">Customer Database <span class=\"float-right\">60%</span></h4>\n");
      out.write("                  <div class=\"progress mb-4\">\n");
      out.write("                    <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 60%\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <h4 class=\"small font-weight-bold\">Payout Details <span class=\"float-right\">80%</span></h4>\n");
      out.write("                  <div class=\"progress mb-4\">\n");
      out.write("                    <div class=\"progress-bar bg-info\" role=\"progressbar\" style=\"width: 80%\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <h4 class=\"small font-weight-bold\">Account Setup <span class=\"float-right\">Complete!</span></h4>\n");
      out.write("                  <div class=\"progress\">\n");
      out.write("                    <div class=\"progress-bar bg-success\" role=\"progressbar\" style=\"width: 100%\" aria-valuenow=\"100\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <!-- Color System -->\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 mb-4\">\n");
      out.write("                  <div class=\"card bg-primary text-white shadow\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      Primary\n");
      out.write("                      <div class=\"text-white-50 small\">#4e73df</div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 mb-4\">\n");
      out.write("                  <div class=\"card bg-success text-white shadow\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      Success\n");
      out.write("                      <div class=\"text-white-50 small\">#1cc88a</div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 mb-4\">\n");
      out.write("                  <div class=\"card bg-info text-white shadow\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      Info\n");
      out.write("                      <div class=\"text-white-50 small\">#36b9cc</div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 mb-4\">\n");
      out.write("                  <div class=\"card bg-warning text-white shadow\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      Warning\n");
      out.write("                      <div class=\"text-white-50 small\">#f6c23e</div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 mb-4\">\n");
      out.write("                  <div class=\"card bg-danger text-white shadow\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      Danger\n");
      out.write("                      <div class=\"text-white-50 small\">#e74a3b</div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 mb-4\">\n");
      out.write("                  <div class=\"card bg-secondary text-white shadow\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      Secondary\n");
      out.write("                      <div class=\"text-white-50 small\">#858796</div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-6 mb-4\">\n");
      out.write("\n");
      out.write("              <!-- Illustrations -->\n");
      out.write("              <div class=\"card shadow mb-4\">\n");
      out.write("                <div class=\"card-header py-3\">\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">Illustrations</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"text-center\">\n");
      out.write("                    <img class=\"img-fluid px-3 px-sm-4 mt-3 mb-4\" style=\"width: 25rem;\" src=\"img/undraw_posting_photo.svg\" alt=\"\">\n");
      out.write("                  </div>\n");
      out.write("                  <p>Add some quality, svg illustrations to your project courtesy of <a target=\"_blank\" rel=\"nofollow\" href=\"https://undraw.co/\">unDraw</a>, a constantly updated collection of beautiful svg images that you can use completely free and without attribution!</p>\n");
      out.write("                  <a target=\"_blank\" rel=\"nofollow\" href=\"https://undraw.co/\">Browse Illustrations on unDraw &rarr;</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <!-- Approach -->\n");
      out.write("              <div class=\"card shadow mb-4\">\n");
      out.write("                <div class=\"card-header py-3\">\n");
      out.write("                  <h6 class=\"m-0 font-weight-bold text-primary\">Development Approach</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <p>SB Admin 2 makes extensive use of Bootstrap 4 utility classes in order to reduce CSS bloat and poor page performance. Custom CSS classes are used to create custom components and custom utility classes.</p>\n");
      out.write("                  <p class=\"mb-0\">Before working with this theme, you should become familiar with the Bootstrap framework, especially the utility classes.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("  <!-- Scroll to Top Button-->\n");
      out.write("  <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("  </a> \n");
      out.write("\n");
      out.write("  <!-- Bootstrap core JavaScript-->\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Core plugin JavaScript-->\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Custom scripts for all pages-->\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/sb-admin-2.js\"></script>s\n");
      out.write("\n");
      out.write("  <!-- Page level plugins -->\n");
      out.write("  <script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Page level custom scripts -->\n");
      out.write("  <script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("  <script src=\"js/demo/chart-pie-demo.js\"></script>\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/demo/chart-bar-demo.js\"></script>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005frequestEncoding_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:requestEncoding
    org.apache.taglibs.standard.tag.rt.fmt.RequestEncodingTag _jspx_th_fmt_005frequestEncoding_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.RequestEncodingTag) _005fjspx_005ftagPool_005ffmt_005frequestEncoding_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.RequestEncodingTag.class);
    boolean _jspx_th_fmt_005frequestEncoding_005f0_reused = false;
    try {
      _jspx_th_fmt_005frequestEncoding_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005frequestEncoding_005f0.setParent(null);
      // /WEB-INF/views/admin/dashBoard.jsp(6,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005frequestEncoding_005f0.setValue("UTF-8");
      int _jspx_eval_fmt_005frequestEncoding_005f0 = _jspx_th_fmt_005frequestEncoding_005f0.doStartTag();
      if (_jspx_th_fmt_005frequestEncoding_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005frequestEncoding_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005frequestEncoding_005f0);
      _jspx_th_fmt_005frequestEncoding_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005frequestEncoding_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005frequestEncoding_005f0_reused);
    }
    return false;
  }
}
