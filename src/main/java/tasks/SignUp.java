package tasks;
import  net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SignUpPage;

public class SignUp implements Task {
    private SignUpPage signUpPage;
    public static SignUp OnThePage() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(Click.on(signUpPage.SIGN_UP_BUTTON));
    }

}

