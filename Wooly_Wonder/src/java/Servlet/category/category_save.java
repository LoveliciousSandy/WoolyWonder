/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.category;

import Model.Category.CategoryModel;
import Model.Product.MultipartFormReader;
import Pojos.ProductCategory;
import Pojos.ProductColour;
import Pojos.ProductSize;
import Pojos.ProductSubcategory;
import hibernate.HibernateSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

//@WebServlet(name = "category_save", urlPatterns = {"/categorySave"})
public class category_save extends HttpServlet {

    String PATH = "category/img/";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session ses = HibernateSession.getSession();
        final String action = req.getParameter("action");
        String status = "";
        String radio = req.getParameter("status");
        if (radio != null && radio.equals("Active")) {
            status = "Active";
        } else if (radio != null && radio.equals("Disable")) {
            status = "Disable";
        }

        if (action.equals("category")) {
            String rootlevel = req.getParameter("rootlevel");
            String cname = req.getParameter("cname");
            try {
                if (rootlevel == null) {
                    resp.sendRedirect(req.getContextPath() + "/Admin_panel/category.add.jsp?msg=rootnull");
                    return;
                } else if (rootlevel.equals("0")) {
                    Criteria c1 = HibernateSession.createCriteria(ses, ProductCategory.class);
                    List<ProductCategory> l1 = c1.list();
                    for (ProductCategory productCategory : l1) {
                        if (productCategory.getName().equalsIgnoreCase(cname)) {
                            resp.sendRedirect(req.getContextPath() + "/Admin_panel/category.add.jsp?msg=0");
                            return;
                        }
                    }
                    ProductCategory category = new ProductCategory();
                    category.setName(cname);
                    category.setStatus(status);
                    CategoryModel cm = new CategoryModel();
                    cm.createcategory(ses, category);
                } else {
                    Session sess = HibernateSession.getSession();
                    ProductCategory category = HibernateSession.Load(sess, ProductCategory.class, rootlevel);

                    Criteria c1 = HibernateSession.createCriteria(ses, ProductSubcategory.class);
                    c1.add(Restrictions.eq("productCategory", category));
                    List<ProductSubcategory> l1 = c1.list();
                    for (ProductSubcategory psc : l1) {
                        if (psc.getSubcategory().equalsIgnoreCase(cname)) {
                            resp.sendRedirect(req.getContextPath() + "/Admin_panel/category.add.jsp?msg=0");
                            return;
                        }
                    }

                    ProductSubcategory productSubcategory = new ProductSubcategory();
                    productSubcategory.setProductCategory(category);
                    productSubcategory.setSubcategory(cname);
                    productSubcategory.setStatus(status);
                    CategoryModel cm = new CategoryModel();
                    cm.createSubcategory(sess, productSubcategory);

                }

                resp.sendRedirect(req.getContextPath() + "/Admin_panel/category.add.jsp");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (action.equals("size")) {

            try {
                Criteria c2 = HibernateSession.createCriteria(ses, ProductSize.class);
                List<ProductSize> l2 = c2.list();
                for (ProductSize productSize : l2) {
                    if (productSize.getName().equalsIgnoreCase(req.getParameter("sname"))) {
                        resp.sendRedirect(req.getContextPath() + "/Admin_panel/category.add.jsp?msg=00&tab=Sizers");
                        return;
                    }
                }
                ProductSize productSize = new ProductSize();
                productSize.setName(req.getParameter("sname"));
                productSize.setStatus(status);
                CategoryModel cm = new CategoryModel();
                cm.createSize(ses, productSize);

                resp.sendRedirect(req.getContextPath() + "/Admin_panel/category.add.jsp?tab=Sizers");
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (action.equals("colour")) {
            try {
                MultipartFormReader mf = new MultipartFormReader(req);

                radio = mf.getParameter("status");
                if (radio != null && radio.equals("Active")) {
                    status = "Active";
                } else if (radio != null && radio.equals("Disable")) {
                    status = "Disable";
                }

                Criteria c3 = HibernateSession.createCriteria(ses, ProductColour.class);
                List<ProductColour> list3 = c3.list();
                for (ProductColour pc : list3) {
                    if ((pc.getName().equals(req.getParameter("cname")))) {
                        resp.sendRedirect(req.getContextPath() + "/Admin_panel/category.add.jsp?msg=000&tab=Colours");
                        return;
                    }
                }

                ProductColour productcolour = new ProductColour();
                productcolour.setName(mf.getParameter("cname"));

                //get image as a FileItem from the request.
                FileItem pic = mf.getFirstFile("pic1");

                // Upload image to server
                if (pic != null) {
                    String picPath = uploadImage(pic, req);
                    System.out.println(picPath);
                    productcolour.setImage(picPath);
                }

                productcolour.setStatus(status);
                CategoryModel cm = new CategoryModel();
                cm.createColour(ses, productcolour);
                resp.sendRedirect(req.getContextPath() + "/Admin_panel/category.add.jsp?tab=Colours");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private String uploadImage(FileItem fileItem, HttpServletRequest req) {
        try {
            String fileExt = "jpg";
            try {
                fileExt = fileItem.getName().split("\\.")[1];
            } catch (Exception e) {
                e.printStackTrace();
            }

            String file = System.currentTimeMillis() + "." + fileExt,
                    path = req.getServletContext().getRealPath("/") + PATH;

            File f = new File(path);
            if (!f.exists()) {
                f.mkdirs();
            }
            f = new File(path + file);
            fileItem.write(f);
            return (req.getContextPath() + "/" + PATH + file);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
