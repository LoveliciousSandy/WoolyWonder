/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet.product;

import Model.Product.MultipartFormReader;
import Model.Product.ProductModel;
import Model.Product.ProductRequestModel;
import Pojos.Product;
import Pojos.ProductCategory;
import Pojos.ProductColour;
import Pojos.ProductImage;
import Pojos.ProductRequest;
import Pojos.ProductSize;
import Pojos.ProductSubcategory;
import hibernate.HibernateSession;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.hibernate.Session;

/**
 *
 * @author Senani
 */
public class update_product extends HttpServlet {

    Session session;
    String PATH = "product/img/";
    StringBuilder SizeValue = new StringBuilder(), colorValue = new StringBuilder();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MultipartFormReader mf;
        String update = null;
        try {
            mf = new MultipartFormReader(request);
        } catch (Exception ex) {
            response.sendError(501);
            return;
        }
        update = mf.getParameter("update");
        session = HibernateSession.getSession();
        String status = "";
        String radio = mf.getParameter("status");
        if (radio.equals("Active")) {
            status = "Active";
        } else if (radio.equals("Hidden")) {
            status = "Hidden";
        } else if (radio.equals("Disable")) {
            status = "Disable";
        }

        try {
            Product product = HibernateSession.Load(session, Product.class, update);
            product.setName(mf.getParameter("pname"));
            ProductCategory productCategory = HibernateSession.Load(session, ProductCategory.class, (mf.getParameter("pcategory")));
            product.setProductCategory(productCategory);
            ProductSubcategory productSubcategory = HibernateSession.Load(session, ProductSubcategory.class, mf.getParameter("psubcategory"));
            product.setProductSubcategory(productSubcategory);
            product.setPrice(Double.parseDouble(mf.getParameter("pprice")));
            product.setShipping(Double.parseDouble(mf.getParameter("pshipping")));

            ProductColour productcolour = HibernateSession.Load(session, ProductColour.class, (mf.getParameter("pcolour")));
            product.setProductColour(productcolour);

            ProductSize productSize = HibernateSession.Load(session, ProductSize.class, (mf.getParameter("psize")));
            product.setProductSize(productSize);
            product.setQty(Integer.parseInt(mf.getParameter("pqty")));
            product.setStatus(status);

            ProductRequest productRequest = product.getProductRequest();
            productRequest.setDescription(mf.getParameter("rdescription"));
            productRequest.setPrice(Double.parseDouble(mf.getParameter("rprice")));

//            for (FileItem fi : mf.getFileList("rsize")) {
//                if (SizeValue.length() == 0) {
//                    SizeValue.append(fi.getString());
//                } else {
//                    SizeValue.append(",");
//                    SizeValue.append(fi.getString());
//                }
//            }
//            productRequest.setSize(SizeValue.toString());
//
//            for (FileItem fi : mf.getFileList("pcolour")) {
//                if (colorValue.length() == 0) {
//                    colorValue.append(fi.getString());
//                } else {
//                    colorValue.append(",");
//                    colorValue.append(fi.getString());
//                }
//            }
//            productRequest.setColour(colorValue.toString());

            ProductRequestModel prm = new ProductRequestModel();
            prm.updateProductRequest(session, productRequest);
            session = HibernateSession.getSession();

            ProductModel productModel = new ProductModel();
            productModel.updateProduct(session, product);
            session = HibernateSession.getSession();
            saveImages(mf, request, response, product.getId());
            response.sendRedirect(request.getContextPath() + "/Admin_panel/products.update.jsp?update=" + update);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/Admin_panel/products.update.jsp?err=1&update=" + update);
        }
    }

    protected void saveImages(MultipartFormReader mF, HttpServletRequest req, HttpServletResponse resp, Integer pId) throws ServletException, IOException {
        try {
            FileItem firstFile1 = mF.getFile("pic1", 0);
            FileItem firstFile2 = mF.getFirstFile("pic2");
            FileItem firstFile3 = mF.getFirstFile("pic3");
            Product p = new Product();
            p.setId(pId);

            ProductImage productImage;
            String uploadImage1;
            String uploadImage2;
            String uploadImage3;
            if (firstFile1 != null && firstFile1.getSize() > 0) {
                System.out.println("IMG1: " + firstFile1);
                uploadImage1 = uploadImage(firstFile1, req);
                productImage = new ProductImage();
                productImage.setProduct(p);
                productImage.setUrl(uploadImage1);
                HibernateSession.update(session, productImage);
            }
            if (firstFile2 != null && firstFile2.getSize() > 0) {
                System.out.println("IMG2: " + firstFile2);
                uploadImage2 = uploadImage(firstFile2, req);
                productImage = new ProductImage();
                productImage.setProduct(p);
                productImage.setUrl(uploadImage2);
                HibernateSession.update(session, productImage);
            }
            if (firstFile3 != null && firstFile3.getSize() > 0) {
                System.out.println("IMG3: " + firstFile3);
                uploadImage3 = uploadImage(firstFile3, req);
                productImage = new ProductImage();
                productImage.setProduct(p);
                productImage.setUrl(uploadImage3);
                HibernateSession.update(session, productImage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String uploadImage(FileItem fileItem, HttpServletRequest req) {
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
