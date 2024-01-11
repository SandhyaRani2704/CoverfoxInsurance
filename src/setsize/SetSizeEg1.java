package setsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
        Thread.sleep(1000);
        
        Dimension defaultsize = driver.manage().window().getSize();
        
        Dimension d=new Dimension(300, 90);
	}

}
