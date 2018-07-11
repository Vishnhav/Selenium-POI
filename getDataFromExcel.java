import static org.testng.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import packageName.ReadPOI;

public Object[][] DataFeed()
	{  
	ReadExcelFile filePath = new ReadExcelFile("filepath/filename.xlsx");
	int rows = config.getRowCount(0);
	Object[][] excelLineItem = new Object[rows][2];
	for(int i=0;i<rows;i++)
	{
	excelLineItem[i][0] = config.dataFromExcel(0, i, 0);
	excelLineItem[i][1] = config.dataFromExcel(0, i, 1);
	}
	return excelLineItem;
	}
