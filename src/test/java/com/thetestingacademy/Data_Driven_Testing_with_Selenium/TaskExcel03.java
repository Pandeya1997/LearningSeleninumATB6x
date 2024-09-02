 package com.thetestingacademy.Data_Driven_Testing_with_Selenium;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaskExcel03 {

    public static void main(String[] args) throws IOException {

        // Create cell at specific Position

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Main");

        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("Abhishek");






        FileOutputStream outputStream = new FileOutputStream(new File("SELLSPECIFIC.xlsx"));
        workbook.write(outputStream);
        outputStream.close();
    }

}
