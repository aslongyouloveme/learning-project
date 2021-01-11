package com.ineverleft.leraning.file;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PdfUtilImg {

  public static void main(String[] args) throws IOException, DocumentException {
    File root = new File("/Users/ineverleft/Desktop");
    String outputFile = "output.pdf";
    List<String> files = new ArrayList<String>();
    files.add("aaa.jpg");

    Document document = new Document();
    PdfWriter.getInstance(document, new FileOutputStream(new File(root, outputFile)));
    document.open();
    for (String f : files) {
      document.newPage();
      Image image = Image.getInstance(new File(root, f).getAbsolutePath());
      image.setAbsolutePosition(0, 0);
      image.setBorderWidth(0);
      image.scaleAbsolute(PageSize.A4);
      document.add(image);
    }
    document.close();
  }
}
