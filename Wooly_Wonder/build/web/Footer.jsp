<%-- 
    Document   : Footer
    Created on : Nov 29, 2018, 2:16:03 AM
    Author     : Senani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        
   
   
<footer style="background-color: black; margin-top: 250px;" >
        <div class="container-fluid ">
          <div class="row row-30">
            <div class="col-md-4 col-xl-3">
                <ul class="nav-list" ><br>
                    <li><a style="color: red;" href="#">Return Policy</a></li><br>
                <li><a style="color: red;" href="#">Delivery</a></li><br>
              </ul>
            </div>
               <div class="col-md-4 col-xl-3">
              <ul class="nav-list"><br>
                <li><a style="color: red;" href="#">About Us</a></li><br>
                <li><a style="color: red;" href="#">Contact Us</a></li><br>
                <li><a style="color: red;" href="<%=request.getContextPath() %>/Footer/Terms_and_Conditions.jsp">Terms & Conditions</a></li><br>
                <li><a style="color: red;" href="#">Privacy Policy</a></li><br>
              </ul>
            </div>
          </div><hr>
             <!-- Rights-->
                <p style="color: white;" class="rights"><span>©  </span><span class="copyright-year">2018</span><span> </span><span>Wooly Wonder</span><span>. </span><span>All Rights Reserved.</span></p>
        </div>
     
        </footer>