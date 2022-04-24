package tasks;

import  net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.Step1Page;

public class Step1 implements Task {
    private Step1Page step1Page;
    public static Step1 OnThePage() {
        return Tasks.instrumented(Step1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("nataly").into(step1Page.First_Name),
                Enter.theValue("mendoza").into(step1Page.Last_Name),
                Enter.theValue("mail@gmail.com").into(step1Page.Email),
                SelectFromOptions.byValue("April").from(step1Page.BirthMonth),
                SelectFromOptions.byValue("21").from(step1Page.BirthDay),
                SelectFromOptions.byValue("1995").from(step1Page.BirthYear),
                Enter.theValue("Spanish").into(step1Page.Ui_select_search),
                Click.on(Step1Page.Btn_blue)
        );
    }

}


