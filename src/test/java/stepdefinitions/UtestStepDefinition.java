package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;
import tasks.SignUp;
import tasks.Step1;

class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a user who wants to register$")
    public void aUserWhoWantsToRegister() {
        OnStage.theActorCalled( "Nataly").wasAbleTo(OpenUp.thePage());
    }

    @When("^click the join today button$")
    public void clickTheJoinTodayButton() {
        OnStage.theActorCalled( "Nataly").wasAbleTo(SignUp.OnThePage());
    }

    @Then("^redirects to log view$")
    public void redirectsToLogView() {
        OnStage.theActorCalled( "Nataly").wasAbleTo(Step1.OnThePage());
    }


}
