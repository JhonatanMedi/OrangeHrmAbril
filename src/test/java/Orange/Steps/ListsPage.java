package Orange.Steps;

import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListsPage {

    private WebDriver driver;

    public ListsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void leaveType(String typeLeave){
        WebElement list = driver.findElement(By.xpath("//div//label[text()='Leave Type']//..//..//div[@class = 'oxd-select-text--after']//i"));
        list.click();

        WebElement leaveTypes = list.findElement(By.xpath("//*[text()='"+typeLeave+"']"));
        leaveTypes.click();

    }

}
