package com.dollop.imageUpload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/ImageUpload")
public class ImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
      ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
      
      try {
		List<FileItem> images = upload.parseRequest(request);
		for(FileItem image: images) {
			String name = image.getName();
			String name = image.getName();
			int i=10;
			int j=20;
			//try{name = name.substring(name.lastIndexOf("\\")+1);} catch(Exception e) {}
			System.out.println(name);
			//image.write(new File("c:/images/"+name));
		System.out.println(name);
		}
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		String name = image.getName();
	}
      
      
      
      
      
      
	}

}
