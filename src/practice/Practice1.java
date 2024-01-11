package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Sandhyarani");
		driver.findElement(By.id("email")).sendKeys("sandhyaranikshirsagar666@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8208833940");
		driver.findElement(By.id("textarea")).sendKeys("Pune");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("thursday")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		Iterator<String> it = allwindows.iterator();
		String mainpage = it.next();// mainpage
		String newbrowser = it.next();//new browser window
		driver.switchTo().window(newbrowser);
		//WebElement scrolltothis = driver.findElement(By.xpath("//p[contains(text(),'iPhone is a')]"));
		Actions act=new Actions(driver);
		//act.scrollToElement(scrolltothis).perform();
		//act.scrollByAmount(0, 2000);
		//driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		
		
		driver.switchTo().window(mainpage);
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("Hello Sandhyarani There");
		alt2.accept();
		
		boolean sun = driver.findElement(By.id("sunday")).isSelected();
		System.out.println(sun);
		
		WebElement field1 = driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("Hello Sandhyarani");
		
		WebElement doubleclick1 = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		//Actions act2=new Actions(driver);
		act.doubleClick(doubleclick1).perform();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(drag, drop).perform();
		
	
		
		WebElement slider = driver.findElement(By.id("slider"));
		act.dragAndDropBy(slider, 40, 0).perform();
		WebElement drpdwncountry = driver.findElement(By.id("country"));
		Select scountry=new Select(drpdwncountry);
		scountry.selectByValue("india");
		
		WebElement colors = driver.findElement(By.id("colors"));
		Select scolors=new Select(colors);
		System.out.println(scolors.isMultiple());
		scolors.selectByVisibleText("Red");
		scolors.selectByValue("white");
		scolors.selectByIndex(1);
		scolors.selectByIndex(2);
		scolors.deselectByValue("white");
		
		driver.findElement(By.id("datepicker")).sendKeys("27/04/2000");
		
		WebElement scroll = driver.findElement(By.xpath("//h2[text()='Web Table']"));
		act.scrollToElement(scroll).perform();
		
		//handle the iframe
		WebElement frame = driver.findElement(By.id("frame-one796456169"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("RESULT_TextField-0")).sendKeys("This is Frame");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.className("icon_calendar")).click();
        for(int i=0;i<=7;i++)
        {driver.findElement(By.xpath("//a[@title='Prev']")).click();}
        WebElement yeardrpdwn = driver.findElement(By.className("ui-datepicker-year"));
        Select syear=new Select(yeardrpdwn);
        syear.selectByValue("2000");
        
        driver.findElement(By.xpath("//a[text()='27']")).click();
        
        WebElement profile = driver.findElement(By.className("drop_down"));
        Select sprofile=new Select(profile);
        System.out.println(sprofile.isMultiple());
        sprofile.selectByValue("Radio-0");
        
        int numOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int numOfColoumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
        
        System.out.println(numOfRows);
        System.out.println(numOfColoumns);
        
        System.out.println("============================================");

        for(int i=1;i<=numOfRows;i++)
        {
        	for(int j=1;j<=numOfColoumns;j++)
        	{
        		if(i==1)
        		{
        			WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
        			System.out.print(data.getText() +" ");
        		}
        		else
        		{
        			WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
        			System.out.print(data.getText()+" ");
        		}
        	}
        	System.out.println();
            System.out.println("=================================");
        }
}}
