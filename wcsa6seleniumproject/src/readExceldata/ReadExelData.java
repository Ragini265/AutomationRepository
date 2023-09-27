package readExceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("IPL");
	Row row = sheet.getRow(8);
	Cell cell = row.getCell(1);
	String data = cell.getStringCellValue();
	Thread.sleep(2000);
	System.out.println(data);
	}
}
