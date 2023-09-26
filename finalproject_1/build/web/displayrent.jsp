<%-- 
- Display data in a table
- Add JSP scriplet
-   
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style1.css">
    </head>
    <body>
        <Script type="text/javascript">
            function editRecord(id) {
                url = "EditRecord";
                window.location.href = "http://localhost:8080/finalproject_1/" + url + "?id=" + id;
            }
            function deleteRecord(id) {
                url = "DeleteRecord";
                window.location.href = "http://localhost:8080/finalproject_1/" + url + "?id=" + id;
            }

        </script>
        <div class="database">
            <%--Display data in a table --%>
            <div class="continer">
                <h1>Book Table</h1>
                <table align="center" bordr="0" border color="black" cellpadding="1" width="60%" class="table-data">
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Gender</td>
                        <td>Age</td>
                        <td>Phone</td>
                        <td>Email</td>
                        <td>Arrival date</td>
                        <td>Leave date</td>
                        <td>#Number of nights</td>
                        <td>Room type</td>
                        <td>Edit</td>
                        <td>Delete</td>
                    </tr>
                    <%Iterator itr;%>
                    <%List data = (List) request.getAttribute("hotel");
                        for (itr = data.iterator(); itr.hasNext();) {
                    %>


                    <tr>
                        <%String s = (String) itr.next();%>

                        <td> <%=s%></td>
                        <td> <%=itr.next()%></td>             
                        <td> <%=itr.next()%></td>
                        <td> <%=itr.next()%></td>
                        <td> <%=itr.next()%></td>
                        <td> <%=itr.next()%></td>
                        <td> <%=itr.next()%></td>
                        <td> <%=itr.next()%></td>
                        <td> <%=itr.next()%></td>
                        <td> <%=itr.next()%></td>
                        <td> <%=itr.next()%></td>



                        <%--Add update and delete buttons and call editRecord function --%>
                        <td><input type="submit" value="Edit" name="Edit" onclick="editRecord(<%=s%>);"/></td>
                        <td><input type="submit" value="Delete" name="Delete" onclick="deleteRecord(<%=s%>);"/></td>

                        <% }%>
                    </tr>       
                </table>
                <a href="index.html" style="
                   text-decoration: none;
                   cursor: pointer;
                   font-size: 1.2rem;
                   background-color: #519872;
                   color: whitesmoke;
                   padding: 4px 18px;
                   border: 0;
                   border-radius: 6px;
                   ">Back</a>

            </div>
        </div>
    </body>
</html>
