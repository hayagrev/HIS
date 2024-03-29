package com.qa.HIS.BrowserCompatibility_HIS;
	import java.io.File;

	import java.io.FileInputStream;

	import java.io.IOException;

	import org.apache.poi.hssf.usermodel.HSSFWorkbook;

	import org.apache.poi.ss.usermodel.Row;

	import org.apache.poi.ss.usermodel.Sheet;

	import org.apache.poi.ss.usermodel.Workbook;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.apache.poi.ss.usermodel.Cell;


	import java.io.FileOutputStream;

	public class readExcelFile {

	    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file

	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook Workbook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    Workbook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of HSSFWorkbook class

	        Workbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet Sheet = Workbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = Sheet.getLastRowNum()-Sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = Sheet.getRow(i);
	        
	    //    System.out.print(row.getCell(i).getStringCellValue()+"|| ");
	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();
	    } 

	    }  

	    //Main function is calling readExcel function to read data from excel file

	  
	
	public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{

        //Create an object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook workbook = null;

        //Find the file extension by splitting  file name in substring and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class

        workbook = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of XSSFWorkbook class

            workbook = new HSSFWorkbook(inputStream);

        }    

    //Read excel sheet by sheet name    

    Sheet sheet = workbook.getSheet(sheetName);

    //Get the current count of rows in excel file

    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

    //Get the first row from the sheet

    Row row = sheet.getRow(0);

    //Create a new row and append it at last of sheet

    Row newRow = sheet.createRow(rowCount+1);

    //Create a loop over the cell of newly created Row

    for(int j = 0; j < row.getLastCellNum(); j++){

        //Fill data in row

        Cell cell = newRow.createCell(j);

        cell.setCellValue(dataToWrite[j]);

    }

    //Close input stream

    inputStream.close();

    //Create an object of FileOutputStream class to create write data in excel file

    FileOutputStream outputStream = new FileOutputStream(file);

    //write data in the excel file

    workbook.write(outputStream);

    //close output stream

    outputStream.close();
	
    }
	  public static void main(String...strings) throws IOException{

		    //Create an object of ReadGuru99ExcelFile class

		    	readExcelFile objExcelFile = new readExcelFile();

		    //Prepare the path of excel file

		    //String filePath = System.getProperty("user.dir")+"\\src\\ExcelTestdata";
	String filePath="D:\\Script\\BrowserCompatibility_HIS\\ExcelTestdata";
		    //Call read file method of the class to read data

		    
	      String[] valueToWrite = {"Mr. E","Noida"};

	      //Create an object of current class


	      //Write the file using file name, sheet name and the data to be filled
System.out.println("write the data in excel....");
	     // objExcelFile.writeExcel(filePath,"ExportExcelFile.xlsx","AlterMrp",valueToWrite);
	      System.out.println("read the data in excel....");
	      objExcelFile.readExcel(filePath,"ExportExcelFile.xlsx","AlterMrp");

		    }

	
	}



