package StepDefinition;


import org.apache.log4j.Logger;

import PagePanel.CASupportPanel;
import PagePanel.LoginPanel;
import PagePanel.RegisterPanel;
import Resource.LoggerHelper;
import cucumber.api.java.en.Then;

public class CA_SupportStep {
	
	RegisterPanel registerPanel = new RegisterPanel();
    LoginPanel loginPanel = new LoginPanel();
    
    
    public static Logger log = LoggerHelper.getLogger(CA_SupportStep.class);
    
    @Then("^User checks the support button and tootip$")
    public void UserChecksTheSupportButtonAndTootip() throws Throwable {
    	log.info("Checking the Support button and tooltip");
    	CASupportPanel.checksupportbtn();
    	CASupportPanel.checktooltip();
    }
    
    @Then("^User clicks on the support button and checks BMC portal$")
    public void UserClicksOnTheSupportButtonAndChecksBMCPortal() throws Throwable {
    	log.info("Clicking on the support button and checking the BMC portal"); 	
        CASupportPanel.clicksupportbtn();
    }
    
    

}
