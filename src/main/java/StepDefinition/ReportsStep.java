package StepDefinition;


import org.apache.log4j.Logger;

import PagePanel.LoginPanel;
import PagePanel.RegisterPanel;
import PagePanel.ReportsPanel;
import Resource.LoggerHelper;
import cucumber.api.java.en.Then;

public class ReportsStep {
	
	RegisterPanel registerPanel = new RegisterPanel();
    LoginPanel loginPanel = new LoginPanel();
    ReportsPanel reportspanel = new ReportsPanel();
    
    public static Logger log = LoggerHelper.getLogger(ReportsStep.class);
    
    @Then("^User clicks on Reports menu$")
    public void userClicksOnReportsMenu() throws Throwable {
        log.info("Navigate to Reports menu page");
        ReportsPanel.clickReportsMenu();
        log.info("Navigated to Reports menu page");
    }
    
    @Then("^User selects the checkbox and checks the export button$")
    public void UserSelectsTheCheckboxAndChecksTheExportButton() throws Throwable {
    	log.info("User selecting the checkbox");
        ReportsPanel.clickcheckbox();
    }

    @Then("^User selects the date from the dropdown and clicks on the export button$")
    public void UserSelectsTheDateFromTheDropDownAndClicksOnTheExportButton() throws Throwable {
    	log.info("User selecting the date from the dropdown");
        ReportsPanel.clickdropdown();
    }

    @Then("^User unselects the checkbox and checks the export button$")
    public void UserUnselectsTheCheckboxAndChecksTheExportButton() throws Throwable {
    	log.info("User selecting the checkbox");
        ReportsPanel.clickuncheckbox();
    }
    
    @Then("^User checks the required elements$")
    public void UserChecksTheRequiredElements() throws Throwable {
    	log.info("User checking the required elements");
        ReportsPanel.checkrequiredelmnts();
    }
    
    @Then("^User searches the reports$")
    public void UserSearchesTheReports() throws Throwable {
    	log.info("User searching the report");
        ReportsPanel.searchwithvaliddata();
        ReportsPanel.searchwithinvaliddata();
    }
    
    @Then("^User selects the date less than ninty days$")
    public void UserSelectsTheDateLessThanNintyDays() throws Throwable {
    	log.info("User searching the report");
        ReportsPanel.selectdatelessthanninty();
        
    }
    
    @Then("^User selects the date more than ninty days$")
    public void UserSelectsTheDateMoreThanNintyDays() throws Throwable {
    	log.info("User searching the report");
        ReportsPanel.selectdatemorethanninty();
        
    }
    
    @Then("^User selects the checkbox and unselects$")
    public void UserSelectsTheCheckboxAndUnselects() throws Throwable {
    	log.info("User selecting the checkbox and unselects");
        ReportsPanel.clickcheckbox();
        ReportsPanel.clickuncheckbox();
        
    }
    
    

}
