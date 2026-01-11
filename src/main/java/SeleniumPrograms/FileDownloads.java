package SeleniumPrograms;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloads {

	@Test
public void DownloadFile() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='File Download']")).click();
		String filePath=System.getProperty("user.dir") + File.separator +"downloads";
		String downloadPath = System.getProperty("user.dir") + File.separator + "downloads";
		
		File directory=new File(filePath);
		if(!directory.exists()) {
			directory.mkdir();
		}
		Map<String,Object> prefs=new HashMap<>();
		prefs.put("download.default_directory", filePath);//prefs.put("download.default_directory", downloadPath);
		prefs.put("download.prompt_for_download", false);//prefs.put("download.prompt_for_download", false);
		prefs.put("plugins.always_open_pdf_externally", true);
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		
		driver.findElement(By.xpath("//a[contains(text(),'Image')]")).click();
		
	/*	//Verify file exists
		File Folder=new File(filePath);
		File[] listOfFiles=Folder.listFiles();
		
		for(File file:listOfFiles){
			System.out.println("Downloaded file is : " +file.getName());
		}*/
		
        File file = new File(filePath + "/some-file.txt");
        if (file.exists()) {
            System.out.println("File downloaded successfully");
        } else {
            System.out.println("File download failed");

		driver.quit();
	}

	}}
