package GoogleMailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIntestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.gmail.com");
        Thread.sleep(3000);
        WebElement EmailId=driver.findElement(By.id("Email"));
        EmailId.sendKeys("sampletest98765");
        Thread.sleep(2000);
        driver.findElement(By.id("next")).click();
        Thread.sleep(3000);
       
        driver.findElement(By.id("Passwd")).sendKeys("Asdf@420");
        Thread.sleep(2000);
        
        driver.findElement(By.id("signIn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id(":j")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("J-N-Jz")).click();
        Thread.sleep(2000);
       // driver.findElement(By.id(":bq")).click();
        //Thread.sleep(2000);
        driver.findElement(By.className("HqHr")).click();
        Thread.sleep(2000);
        
        
        

	}

}
