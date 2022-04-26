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
    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String language;

    public Step1(String firstName, String lastName, String email, String month, String day, String year, String language) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.month = month;
            this.day = day;
            this.year = year;
            this.language = language;
    }

    public static Step1 OnThePage() {
        return Tasks.instrumented(Step1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.firstName).into(step1Page.First_Name),
                Enter.theValue(this.lastName).into(step1Page.Last_Name),
                Enter.theValue(this.email).into(step1Page.Email),
                SelectFromOptions.byValue(this.month).from(step1Page.BirthMonth),
                SelectFromOptions.byValue(this.day).from(step1Page.BirthDay),
                SelectFromOptions.byValue(this.year).from(step1Page.BirthYear),
                Enter.theValue(this.language).into(step1Page.Ui_select_search),
                Click.on(Step1Page.Btn_blue)
        );
    }

}


