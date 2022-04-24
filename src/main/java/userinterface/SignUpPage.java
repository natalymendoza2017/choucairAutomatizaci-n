package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage extends PageObject {
    public static final Target SIGN_UP_BUTTON = Target
            .the("button that show us sign up form")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
