package com.zensar.webservice.download;
import javax.ws.rs.GET;
import java.io.File;



import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
@Path("/download")
public class FileDownloadService {
	
  private static final String textFile="D:\\Priya\\gitfile.txt";
  private static final String imageFile="C:\\Users\\Zensar123\\Desktop\\download.jfif";
  private static final String pdfFile="C:/Users/Zensar123/Desktop/dummy.pdf";
  @GET
  @Path("/text")
  @Produces("text/plain")
  public Response getTextFile()
  {
	  File f=new File(textFile);
	  ResponseBuilder builder=Response.ok(f);
	  builder.header("Content-Disposition", "attachment;filename=gitfile1.txt");
       return builder.build();
  }
  
  @GET
  @Path("/images")
  @Produces("image/jfif")
  public Response getImgFile()
  {
	  File f=new File(imageFile);
	  ResponseBuilder builder=Response.ok(f);
	  builder.header("Content-Disposition", "attachment;filename=img1.jfif");
       return builder.build();
  }
  @GET
  @Path("/pdf")
  @Produces("application/pdf")
  public Response getPdfFile()
  {
	  File f=new File(pdfFile);
	  ResponseBuilder builder=Response.ok(f);
	  builder.header("Content-Disposition", "attachment;filename=pdf1.pdf");
       return builder.build();
  }
  }
