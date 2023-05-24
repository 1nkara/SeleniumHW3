import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        WebElement fname=driver.findElement(By.cssSelector("input[name='first_name']"));
        fname.sendKeys("Kara");
        WebElement lname=driver.findElement(By.cssSelector("input[name='last_name']"));
        lname.sendKeys("Smith");
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("karasmith@gmail.com");
        WebElement phone=driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("8485463789");
        WebElement address=driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys("7667 Amberwoodway");
        WebElement city=driver.findElement(By.cssSelector("input[data-bv-field='city']"));
        city.sendKeys("Mason");
        WebElement state=driver.findElement(By.cssSelector("select[data-bv-field='state']"));
        state.sendKeys("Ohio");
        WebElement zipcode=driver.findElement(By.cssSelector("input[placeholder='Zip Code']"));
        zipcode.sendKeys("45678");
        WebElement website=driver.findElement(By.xpath("//input[@name='website']"));
        website.sendKeys("instagram.com");
        WebElement host=driver.findElement(By.cssSelector("input[value='no']"));
        host.click();
        WebElement comment=driver.findElement(By.cssSelector("textarea[name='comment']"));
        comment.sendKeys("anau minau");
        WebElement send = driver.findElement(By.xpath("//button[text()='Send ']"));
        send.click();






    }
}
