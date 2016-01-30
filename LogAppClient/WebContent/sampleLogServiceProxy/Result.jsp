<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleLogServiceProxyid" scope="session" class="br.uniriotec.logapp.service.LogServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleLogServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleLogServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleLogServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        br.uniriotec.logapp.service.LogService getLogService10mtemp = sampleLogServiceProxyid.getLogService();
if(getLogService10mtemp == null){
%>
<%=getLogService10mtemp %>
<%
}else{
        if(getLogService10mtemp!= null){
        String tempreturnp11 = getLogService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String name_3id=  request.getParameter("name26");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String level_4id=  request.getParameter("level28");
        int level_4idTemp  = Integer.parseInt(level_4id);
        %>
        <jsp:useBean id="br1uniriotec1logapp1model1Severity_2id" scope="session" class="br.uniriotec.logapp.model.Severity" />
        <%
        br1uniriotec1logapp1model1Severity_2id.setName(name_3idTemp);
        br1uniriotec1logapp1model1Severity_2id.setLevel(level_4idTemp);
        String message_5id=  request.getParameter("message30");
            java.lang.String message_5idTemp = null;
        if(!message_5id.equals("")){
         message_5idTemp  = message_5id;
        }
        %>
        <jsp:useBean id="br1uniriotec1logapp1model1LogRequest_1id" scope="session" class="br.uniriotec.logapp.model.LogRequest" />
        <%
        br1uniriotec1logapp1model1LogRequest_1id.setSeverity(br1uniriotec1logapp1model1Severity_2id);
        br1uniriotec1logapp1model1LogRequest_1id.setMessage(message_5idTemp);
        br.uniriotec.logapp.model.LogEffect simpleLogService13mtemp = sampleLogServiceProxyid.simpleLogService(br1uniriotec1logapp1model1LogRequest_1id);
if(simpleLogService13mtemp == null){
%>
<%=simpleLogService13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">logPersisted:</TD>
<TD>
<%
if(simpleLogService13mtemp != null){
%>
<%=simpleLogService13mtemp.isLogPersisted()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">messageLogged:</TD>
<TD>
<%
if(simpleLogService13mtemp != null){
%>
<%=simpleLogService13mtemp.isMessageLogged()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mailSent:</TD>
<TD>
<%
if(simpleLogService13mtemp != null){
%>
<%=simpleLogService13mtemp.isMailSent()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 32:
        gotMethod = true;
        String name_8id=  request.getParameter("name45");
            java.lang.String name_8idTemp = null;
        if(!name_8id.equals("")){
         name_8idTemp  = name_8id;
        }
        String level_9id=  request.getParameter("level47");
        int level_9idTemp  = Integer.parseInt(level_9id);
        %>
        <jsp:useBean id="br1uniriotec1logapp1model1Severity_7id" scope="session" class="br.uniriotec.logapp.model.Severity" />
        <%
        br1uniriotec1logapp1model1Severity_7id.setName(name_8idTemp);
        br1uniriotec1logapp1model1Severity_7id.setLevel(level_9idTemp);
        String message_10id=  request.getParameter("message49");
            java.lang.String message_10idTemp = null;
        if(!message_10id.equals("")){
         message_10idTemp  = message_10id;
        }
        %>
        <jsp:useBean id="br1uniriotec1logapp1model1LogRequest_6id" scope="session" class="br.uniriotec.logapp.model.LogRequest" />
        <%
        br1uniriotec1logapp1model1LogRequest_6id.setSeverity(br1uniriotec1logapp1model1Severity_7id);
        br1uniriotec1logapp1model1LogRequest_6id.setMessage(message_10idTemp);
        br.uniriotec.logapp.model.LogEffect mailAlertService32mtemp = sampleLogServiceProxyid.mailAlertService(br1uniriotec1logapp1model1LogRequest_6id);
if(mailAlertService32mtemp == null){
%>
<%=mailAlertService32mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">logPersisted:</TD>
<TD>
<%
if(mailAlertService32mtemp != null){
%>
<%=mailAlertService32mtemp.isLogPersisted()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">messageLogged:</TD>
<TD>
<%
if(mailAlertService32mtemp != null){
%>
<%=mailAlertService32mtemp.isMessageLogged()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mailSent:</TD>
<TD>
<%
if(mailAlertService32mtemp != null){
%>
<%=mailAlertService32mtemp.isMailSent()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 51:
        gotMethod = true;
        String name_13id=  request.getParameter("name64");
            java.lang.String name_13idTemp = null;
        if(!name_13id.equals("")){
         name_13idTemp  = name_13id;
        }
        String level_14id=  request.getParameter("level66");
        int level_14idTemp  = Integer.parseInt(level_14id);
        %>
        <jsp:useBean id="br1uniriotec1logapp1model1Severity_12id" scope="session" class="br.uniriotec.logapp.model.Severity" />
        <%
        br1uniriotec1logapp1model1Severity_12id.setName(name_13idTemp);
        br1uniriotec1logapp1model1Severity_12id.setLevel(level_14idTemp);
        String message_15id=  request.getParameter("message68");
            java.lang.String message_15idTemp = null;
        if(!message_15id.equals("")){
         message_15idTemp  = message_15id;
        }
        %>
        <jsp:useBean id="br1uniriotec1logapp1model1LogRequest_11id" scope="session" class="br.uniriotec.logapp.model.LogRequest" />
        <%
        br1uniriotec1logapp1model1LogRequest_11id.setSeverity(br1uniriotec1logapp1model1Severity_12id);
        br1uniriotec1logapp1model1LogRequest_11id.setMessage(message_15idTemp);
        br.uniriotec.logapp.model.LogEffect DBLogService51mtemp = sampleLogServiceProxyid.DBLogService(br1uniriotec1logapp1model1LogRequest_11id);
if(DBLogService51mtemp == null){
%>
<%=DBLogService51mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">logPersisted:</TD>
<TD>
<%
if(DBLogService51mtemp != null){
%>
<%=DBLogService51mtemp.isLogPersisted()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">messageLogged:</TD>
<TD>
<%
if(DBLogService51mtemp != null){
%>
<%=DBLogService51mtemp.isMessageLogged()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mailSent:</TD>
<TD>
<%
if(DBLogService51mtemp != null){
%>
<%=DBLogService51mtemp.isMailSent()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>