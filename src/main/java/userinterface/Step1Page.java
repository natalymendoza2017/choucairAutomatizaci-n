package userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step1Page extends PageObject {
    public static final Target First_Name = Target
            .the("Were do write fisrt name")
            .located(By.id("firstName"));

    public static final Target Last_Name = Target
            .the("Were do write Last name")
            .located(By.id("lastName"));

    public static final Target Email = Target
            .the("Were do write email")
            .located(By.id("email"));

    public static final Target BirthMonth = Target
            .the("Were do select birthMonth")
            .located(By.id("birthMonth"));

    public static final Target BirthDay = Target
            .the("Were do select birthDay")
            .located(By.id("birthDay"));

    public static final Target BirthYear = Target
            .the("Were do Select birthYear")
            .located(By.id("birthYear"));

    public static final Target Ui_select_search = Target
            .the("Were do select ui_select_search ")
            .located(By.className("ui-select-search"));

    public static final Target Btn_blue = Target
            .the("Were do Click btn_blue ")
            .located(By.className("btn-blue"));

}
