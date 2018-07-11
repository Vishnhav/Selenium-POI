import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

   XSSFWorkbook workBook;
	 XSSFSheet sheet;
	 public ReadExcelFile(String excelPath)
	 {
	 try
	 {
	 File fileSource = new File(excelPath);
	 FileInputStream fis = new FileInputStream(fileSource);
	 workBook = new XSSFWorkbook(fis);
	 }
	 catch(Exception e)
	 {
	 System.out.println(e.getMessage());
	 }
	 }
	 public String dataFromExcel(int sheetnumber, int row, int column)
	 {
	 sheet = workBook.getSheetAt(sheetnumber);
	 String data = sheet.getRow(row).getCell(column).getStringCellValue();
	 return data;
	 }
	 public int getRowCount(int sheetIndex)
	 {
	 int row = workBook.getSheetAt(sheetIndex).getLastRowNum();
	 row = row + 1;
	 return row;
	 }

}
