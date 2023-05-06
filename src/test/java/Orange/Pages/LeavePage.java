package Orange.Pages;

import Orange.Steps.ButtonPages;
import Orange.Steps.ListsPage;
import Orange.Steps.Questions;
import org.openqa.selenium.WebDriver;

public class LeavePage {

    private ButtonPages buttonPages;
    private ListsPage listsPage;
    private Questions questions;

    public LeavePage(WebDriver driver) {
        this.buttonPages = new ButtonPages(driver);
        this.listsPage = new ListsPage(driver);
        this.questions = new Questions(driver);
    }

    public void searchLeave(String typeLeave){
        this.buttonPages.btnLeave();
        this.questions.tiempoSegundos(1);
        this.listsPage.leaveType(typeLeave);
    }
}
