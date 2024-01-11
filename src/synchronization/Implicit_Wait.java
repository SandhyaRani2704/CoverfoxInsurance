package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upstox.com/open-demat-account/v2/?utm_source=google&utm_term=upstox&utm_creative=Responsive_Search_Ads&utm_campaign=ADS_Upstox_Brand_Exact_Oct23&utm_device=c&utm_content=search&utm_adgroup=Upstox&utm_placement=&utm_medium=cpc&gclid=Cj0KCQiAgqGrBhDtARIsAM5s0_m5qpTZjvNMdriBJSJfN6brglu1VYztyV9ta1UmWzi-QyIQozUVnDEaAn8SEALw_wcB");
        Thread.sleep(1000);
        
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
         
	}

}
