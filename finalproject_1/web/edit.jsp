<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style1.css">
    </head>


    <body class="edit-page">
        <h1>Edit Page</h1>
        <form action="UpdateData" method="post" class="database">

            <table align ="center"   color="black" width ="20%" class="table-data12" >
                <%ResultSet rs = (ResultSet) request.getAttribute("EditDataTojsp");
                    if (rs.next()) {
                        String id = rs.getString("id");
                        String name = rs.getString("name");
                        String gender = rs.getString("gender");
                        String phone = rs.getString("phone");
                        String email = rs.getString("email");
                        String age = rs.getString("age");
                        String arrival = rs.getString("arrival");
                        String leaving = rs.getString("leaving");
                        String num = rs.getString("num");
                        String total = rs.getString("total");
                        String roomtype = rs.getString("roomtype");


                %>   
                <tr>
                    <td>ID</td>
                    <td> <input type="text" name="id" value=<%=id%> >  </td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td> <input type="text" name="name" value=<%=name%>>  </td>
                </tr>
                  <tr>
                    <td>gender</td>
                    <td><select class="select" name="renttype" style="width: 300px;">
                            <option><%=gender%></option>
                            <option disabled selected>Select a Gender:</option>
                            <option value="female">Female</option>
                            <option value="male">Male</option>
                        </select><br>
                </tr>

                <tr>
                    <td>Phone</td>
                    <td> <input type="text" name="phone" value=<%=phone%>>  </td>
                </tr>

                <tr>
                    <td>Email</td>
                    <td> <input type="text" name="email" value=<%=email%>>  </td>
                </tr>
                <tr>
                    <td>age</td>
                    <td> <input type="text" name="email" value=<%=age%>>  </td>
                </tr>
                <tr>
                    <td>arrival</td>
                    <td> <input type="text" name="email" value=<%=arrival%>>  </td>
                </tr>
                <tr>
                    <td>leaving</td>
                    <td> <input type="text" name="email" value=<%=leaving%>>  </td>
                </tr>
                <tr>
                    <td>num</td>
                    <td> <input type="text" name="email" value=<%=num%>>  </td>
                </tr>
                <tr>
                    <td>total</td>
                    <td> <input type="text" name="email" value=<%=total%>>  </td>
                </tr>
                <tr>
                    <td>Room Type</td>
                    <td><select  class="select" name="cartype" style="width: 300px;">
                            <option><%=roomtype%></option>
                            <option disabled selected>Select a Room</option>
                            <option value="single">Single</option>
                            <option value="twin">Twin</option>
                            <option value="king">King</option>
                            <option value="deluxe">Deluxe</option>
                        </select><br>

                </tr>
             

                <tr>
                    <td> </td>
                    <td> <input type="submit" value="Update" name= "update" style="background: #111120; color: white;" /> </td>
                </tr>                
                <% }%>     
            </table>
        </form> 
    </body> 
</html>
