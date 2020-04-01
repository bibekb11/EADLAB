# **Lab 4**

# **Objective 1: Servlet Interface**

# **Theory :**

A Servlet is small program which runs within a web server and public interface Servlet defines methods which is must implemented by all Servlet. For initialization a Servlet, For service requests and for removing a Servlet from the server this interface defines some methods. These methods are called life-cycle methods. Also it provides 2 non-life-cycle methods.

# **Servlet Interface Methods**
These are 5 life-cycle and non-life-cycle methods in Servlet Interface.

**public void init(ServletConfig config)** :– This method is called by the Servlet container which indicates that Servlet is being placed into service. The Servlet container calls the init method only once post instantiating the Servlet. This is life-cycle method of Servlet.

**public void service(ServletRequest request,ServletResponse response)** :-This method is called by the Servlet container which is used to allow the Servlet to respond to a request. This method is called post the init() method of Servlet.

**public ServletConfig getServletConfig()** :-This method returns a ServletConfig object, which contains initialization and startup parameter for this Servlet.

**public String getServletInfo()** :– This method returns information about the Servlet, like author, version, and copyright. The string that this methods returns must be plain text.

**public void destroy()**:- If the Servlet taken out from the service so this method is being called by the Servlet container. After calling method by Servlet container, it will not call the service method again on this Servlet.

# **Objective 2: Java Servlet POST Example**

# **Theory :**

A generally more reliable method of passing information to a backend program is the POST method. This packages the information in exactly the same way as GET method, but instead of sending it as a text string after a ? (question mark) in the URL it sends it as a separate message. This message comes to the backend program in the form of the standard input which you can parse and use for your processing. Servlet handles this type of requests using doPost() method.

Reading Form Data using Servlet

Servlets handles form data parsing automatically using the following methods depending on the situation −

- getParameter() − You call request.getParameter() method to get the value of a form parameter.
- getParameterValues() − Call this method if the parameter appears more than once and returns multiple values, for example checkbox.
- getParameterNames() − Call this method if you want a complete list of all parameters in the current request.
  <!-- Example is provided above -->

# **Objective 3: Understanding JSP**

# **Theory :**

JavaServer Pages (JSP) is a Java standard technology that enables you to write dynamic, data-driven pages for your Java web applications. JSP is built on top of the Java Servlet specification. The two technologies typically work together, especially in older Java web applications. From a coding perspective, the most obvious difference between them is that with servlets you write Java code and then embed client-side markup (like HTML) into that code, whereas with JSP you start with the client-side script or markup, then embed JSP tags to connect your page to the Java backend.

### Comparision of JSP and Servlet

1. Session management is automatically enabled in JSP where as in Servlet, by default session management is disabled, the user has to enable it explicitly
2. In MVC Pattern, JSP is used for displaying output data i.e in MVC it is a view but in Servlet, it plays a controller role in MVC Pattern.
3. JSP is slower than Servlet because the initial step in JSP life Cycle is translation of JSP to java code also then compile where as Servlet is much more fast than the JSP.
4. In JSP package is imported wherever top, middle or bottom but in servlet, every package needs to be imported on the top of the servlet.

### JSP Scripting Element.

The scripting elements provides the ability to insert java code inside the jsp. There are three types of scripting elements:

-scriptlet tag
-expression tag
-declaration tag

#### JSP Scriplet Tag

A scriptlet tag is used to execute java source code in JSP. Syntax is as follows:
<% java source code %>

#### JSP Expression Tag

The code placed within JSP expression tag is written to the output stream of the response. So you need not write out.print() to write data. It is mainly used to print the values of variable or method.
<%= statement %>

#### JSP Declaration Tag

The JSP declaration tag is used to declare fields and methods.The code written inside the jsp declaration tag is placed outside the service() method of auto generated servlet.So it doesn't get memory at each request.The syntax of the declaration tag is as follows:
<%! field or method declaration %>

<!-- Example is provided above -->
