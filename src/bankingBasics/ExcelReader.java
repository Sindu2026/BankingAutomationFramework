package bankingBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	private Workbook workbook;
	private Sheet sheet;
	
	
	//Constructor to open the excel file
	
	public ExcelReader(String filepath, String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(filepath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			System.out.println("Excel file opened successfully");
		}catch(IOException e) {
			System.out.println("Error opening Excel file: " + e.getMessage());	
		}
		
	}
	// Get total number of rows (excluding header)
	public int getRowCount() {
		return sheet.getLastRowNum();
	}
	
	// Get total number of columns
	public int getColumnCount() {
		return sheet.getRow(0).getLastCellNum();
	}
		
	  // Get data from specific row and column
	public String getCellData(int rowNum,int ColNum) {
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(ColNum);
		
		if (cell==null) {
			return "";
		}
		// Handle different cell types
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
	}
	
	// Close the workbook
    public void closeWorkbook() {
        try {
            workbook.close();
            System.out.println("Excel file closed successfully!");
        } catch (IOException e) {
            System.out.println("Error closing Excel file: " + e.getMessage());
        }
    }
}
