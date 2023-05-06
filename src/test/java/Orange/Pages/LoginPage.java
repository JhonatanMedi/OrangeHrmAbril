package Orange.Pages;

import Orange.DataBase.ConsultDataBase;
import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;


//esto es una clase
public class LoginPage {

    private ButtonPages buttonPages;
    private Questions questions;
    private ConsultDataBase consultDataBase;

    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUser;

    @FindBy(how = How.XPATH, using = "//input[@placeholder= 'Password']")
    private WebElement txtPass;

    //esto es un constructor
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);

    }

    //esto es un metodo
    public void fillOutLogin(String userName, String password) throws SQLException {
        this.txtUser.sendKeys(userName);
        this.txtPass.sendKeys(password);
        this.buttonPages.btnLogin();
        this.consultDataBase.consultUsers();
    }

    public void validateDashboard() {
        this.questions.tiempoSegundos(1);
        this.questions.validateDashboard();
    }
}
