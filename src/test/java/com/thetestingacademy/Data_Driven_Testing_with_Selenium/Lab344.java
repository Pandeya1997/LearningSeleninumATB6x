package com.thetestingacademy.Data_Driven_Testing_with_Selenium;
import org.apache.poi.poifs.crypt.temp.SXSSFWorkbookWithCustomZipEntrySource;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab344 {
    public static void main(String[] args) throws IOException {
        //workbook
        // sheet
        // Row, cell
        // XSSF work book --> xslx --> 2008
        // HSSF work book --> xls < 2004
        // Create a  Excel file and Add Data

        // Task 1 - Crate a Excel File and add Data

        Map<String, Object> data = new TreeMap<>();
        data.put("1", new Object[]{"LoginId", "Email", "Password"});
        data.put("2", new Object[]{"1", "pramod@live.com", "123456"});
        data.put("3", new Object[]{"2", "test@gmail.com", "password123"});

        createExcel("CTD2.xls",data );

    }
    public static String createExcel(String name, Map data) throws IOException {


        Set<String> keyset = data.keySet();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Main");

        int rownum = 0;

        for (String key : keyset) {
            Row r = sheet.createRow(rownum++);
            Object[] objectA = (Object[]) data.get(key);
            int cellnum = 0;
            for (Object o : objectA) {
                Cell cell = r.createCell(cellnum++);
                if ( o instanceof String){
                    cell.setCellValue((String) o);
                }
                if( o instanceof Integer){
                    cell.setCellValue((Integer)o);
                }

            }

        }


        FileOutputStream outputStream = new FileOutputStream(new File(name));
        workbook.write(outputStream);
        outputStream.close();
        return name;
    }


}
