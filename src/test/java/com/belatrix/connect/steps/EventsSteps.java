package com.belatrix.connect.steps;

import org.testng.Assert;

import com.belatrix.connect.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class EventsSteps extends ParentScenario{
	@When("^I click in Events tab$")
	public void iClickInEventsButton() throws Throwable {
	    mainProfilePage.clickEventsTab();
	}
	 
	@And("^I click in More button on Other locations events$")
    public void iClickInMoreButtonOnOtherLocationsEvents() throws Throwable {
        events.clickEventMore();
    }

    @And("^I click in \"([^\"]*)\"$")
    public void iClickIn(String title) throws Throwable {
        events.clickEvent(title);
    }

    
    
    @And("^I click in Register button$")
    public void iClickInRegisterButton() throws Throwable {
        events.registerToEvent();
    }

    
    
    @And("^I verify registration confirmed \"([^\"]*)\"$")
    public void iVerifyRegistrationConfirmed(String message) throws Throwable {
        confirmationPage.waitForMessage();
        Assert.assertEquals(confirmationPage.getMessage(), message);
    }

    
    
    @And("^I click on Registered button$")
    public void iClickOnRegisteredButton() throws Throwable {
        events.unregisterToEvent();
    }


    
    @And("^I verify unregistration confirmed \"([^\"]*)\"$")
    public void iVerifyUnregistrationConfirmed(String message) throws Throwable {
        confirmationPage.waitForMessage();
        Assert.assertEquals(confirmationPage.getMessage(), message);
    }
}
