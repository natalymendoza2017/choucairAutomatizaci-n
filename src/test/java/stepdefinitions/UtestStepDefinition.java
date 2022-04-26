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

    }

    @Given("^given that the user completes the personal data form$")
    public void givenThatTheUserCompletesThePersonalDataForm() {
    }

    @When("^the user writes in the field first name \"([^\"]*)\" last name \"([^\"]*)\" email address \"([^\"]*)\" month \"([^\"]*)\" day \"([^\"]*)\" year \"([^\"]*)\" language \"([^\"]*)\" and clicks on the next button$")
    public void theUserWritesInTheFieldFirstNameLastNameAddressMonthDayYearLanguageAndClicksOnTheNextButton
            (String firstName, String lastName, String email, String month, String day, String year, String language) {

        final Step1 step1 = new Step1(
                firstName,
                lastName,
                email,
                month,
                day,
                year,
                language
        );

        OnStage.theActorCalled( "Nataly").wasAbleTo(step1.OnThePage());
    }

    @Then("^continue to stepTwo$")
    public void continueToStepTwo() {
    }
}
