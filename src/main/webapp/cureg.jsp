<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
<body>
  <%@include file="navbar.jsp" %>
    <h3 style="text-align: center;"><u>Cutomer Registration</u></h3>
    <div class="form-container">
        <form method="post" action="insertcu">
            <table>
             
              <tr>
                  <td><label for="cname">Enter Name</label></td>
                  <td><input type="text" id="cname" name="cname" required/></td>
              </tr>
               <tr>
                  <td><label for="caddress">Enter Address</label></td>
                  <td><input type="text" id="caddress" name="caddress" required/></td>
              </tr>
               <tr>
                  <td><label for="cphno">Enter Phone</label></td>
                  <td><input type="text" id="cphno" name="cphno" required/></td>
              </tr>
               <tr>
                  <td><label for="cdob">Enter DOB</label></td>
                  <td><input type="text" id="cdob" name="cdob" required/></td>
              </tr>
             
              <tr>
                  <td colspan="2" class="button-container">
                      <input type="submit" value="Register"/>
                      <input type="reset" value="Clear"/>
                  </td>
              </tr>
            </table>
        </form>
    </div>
</body>
</html>
