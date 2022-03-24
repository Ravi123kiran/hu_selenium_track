import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag_Drop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ravikumaa\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions l=new Actions(driver);
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement from=driver.findElement(By.id("draggable"));
        WebElement to=driver.findElement(By.id("droppable"));
        l.dragAndDrop(from,to).perform();

        }
        }
