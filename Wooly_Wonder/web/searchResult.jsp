<%@page import="Pojos.ProductColour"%>
<%@page import="Pojos.ProductSize"%>
<%@page import="Pojos.ProductSubcategory"%>
<%@page import="org.hibernate.Session"%>
<%@page import="Pojos.ProductImage"%>
<%@page import="java.util.Set"%>
<%@page import="Pojos.Product"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="Pojos.ProductCategory"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="hibernate.HibernateSession"%>
<div>
    <%
        String minP = request.getParameter("minP"),
                maxP = request.getParameter("maxP"),
                cat = request.getParameter("cat"),
                subCat = request.getParameter("subCat"),
                colour = request.getParameter("colour"),
                size = request.getParameter("size"),
                q = request.getParameter("q");

        Session s = HibernateSession.getSession();
        Criteria cc = HibernateSession.createCriteria(s, Product.class);

        if (q != null && q.length() > 0) {
            cc.add(Restrictions.ilike("name", "%" + q + "%"));
        }
        if (cat != null && cat.length() > 0) {
            cc.add(Restrictions.eq("productCategory", s.load(ProductCategory.class, Integer.parseInt(cat))));
        }
        if (subCat != null && subCat.length() > 0 && !subCat.equals("0")) {
            cc.add(Restrictions.eq("productSubcategory", s.load(ProductSubcategory.class, Integer.parseInt(subCat))));
        }
        if (size != null && size.length() > 0) {
            cc.add(Restrictions.eq("productSize", s.load(ProductSize.class, Integer.parseInt(size))));
        }
        if (colour != null && colour.length() > 0) {
            cc.add(Restrictions.eq("productColour", s.load(ProductColour.class, Integer.parseInt(colour))));
        }
        if (minP != null && minP.length() > 0) {
            cc.add(Restrictions.ge("price", Double.parseDouble(minP)));
        }
        if (maxP != null && maxP.length() > 0) {
            cc.add(Restrictions.lt("price", Double.parseDouble(maxP)));
        }

        List<Product> product = cc.list();
        for (Product p : product) {
    %>
    <div class="col-sm-3" style="margin-top: 40px;">
        <% ProductImage pi = (ProductImage) p.getProductImages().iterator().next();
        %>
        <img id="imgcard" src='<%= pi.getUrl()%>' alt="imge" width="250" height="270"/> 
        <span id="pricetag">Rs:<%= p.getPrice()%>/=</span><br>
        <p><%=p.getName()%></p>
        <button id="viewdetails" class=" btn btn-default" onclick="viewdetails(<%=p.getId()%>)">View Details</button><br>
    </div>
    <% }%>
</div>