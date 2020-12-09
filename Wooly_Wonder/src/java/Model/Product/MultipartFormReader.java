/*
 *	The MIT License
 *
 *	Copyright © 2018 RoshSoft.
 *
 *	Permission is hereby granted, free of charge, to any person obtaining a copy
 *	of this software and associated documentation files (the "Software"), to deal
 *	in the Software without restriction, including without limitation the rights
 *	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *	copies of the Software, and to permit persons to whom the Software is
 *	furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in
 *	all copies or substantial portions of the Software.
 *
 *	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM
 *	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *	THE SOFTWARE.
 */
package Model.Product;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Roshana Pitigala
 */
public class MultipartFormReader {

    private Map<String, List<FileItem>> files;

    @Override
    public String toString() {
        JSONObject ja = new JSONObject();
        int i = 1;
        for (Map.Entry<String, List<FileItem>> entry : files.entrySet()) {
            List<FileItem> value = entry.getValue();
            JSONArray fija = new JSONArray();
            for (FileItem fi : value) {
                JSONObject fijo = new JSONObject();
                fijo.put("No", i++);
                fijo.put("Name", fi.getName());
                fijo.put("FieldName", fi.getFieldName());
                fijo.put("Type", fi.getContentType());
                fijo.put("Size", fi.getSize());
                fijo.put("IsFormField", fi.isFormField());
                fijo.put("Content", fi.getString());
                fija.put(fijo);
            }
            ja.put(entry.getKey(), fija);
        }

        return ja.toString(2);
    }

    public MultipartFormReader(HttpServletRequest request) throws Exception {
        DiskFileItemFactory df = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(df);
        files = sfu.parseParameterMap(request);
    }

    public String getParameter(String name) {
        try {
            return files.get(name).get(0).getString();
        } catch (Exception e) {
        }
        return null;
    }

//    public String[] getParameterValues(String name) {
//        try {
//            String string = files.get(name).listIterator().next().getString();
//            //String string = files.get(name).get(0).getString();
//            String strArray[] = string.split(" ");
//            for (int i = 0; i < strArray.length; i++) {
//                System.out.println(strArray[i]);
//            }
//            return strArray;
//
//        } catch (Exception e) {
//        }
//        return null;
//    }

    public FileItem getFirstFile(String name) {
        try {
            return files.get(name).get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public List<FileItem> getFileList(String name) {
        try {
            return files.get(name);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param file 1st index is 0. Used as <code>List.get(int index)</code>.
     * @return FileItem or null if nothing found.
     */
    public FileItem getFile(String name, int file) {
        try {
            return files.get(name).get(file);
        } catch (Exception e) {
            return null;
        }
    }

}
