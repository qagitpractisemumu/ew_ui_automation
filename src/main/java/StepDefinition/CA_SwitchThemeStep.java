package StepDefinition;

import org.apache.log4j.Logger;

import PagePanel.CA_SwitchThemePanel;
import Resource.LoggerHelper;
import cucumber.api.java.en.Then;

public class CA_SwitchThemeStep {
	
	CA_SwitchThemePanel  ca_SwitchThemePanel = new CA_SwitchThemePanel();
    public static Logger log = LoggerHelper.getLogger(CA_SwitchThemeStep.class);
    
    @Then("^User clicks on switch theme toogle button$")
    public void user_clicks_on_switch_theme_toogle_button() throws Throwable {
    	log.info("Clicking on the switch theme toogle button");
        CA_SwitchThemePanel.clickSwitchTheme();
    }
    
    @Then("^User checks the theme changed to dark or not$")
    public void user_checks_the_theme_changed_to_dark_or_not() throws Throwable {
    	log.info("Checking the theme");
        CA_SwitchThemePanel.checkdarkSwitchTheme();
    }
    
    @Then("^User checks the theme changed to light or not$")
    public void user_checks_the_theme_changed_to_light_or_not() throws Throwable {
    	log.info("Checking the theme");
        CA_SwitchThemePanel.checklightSwitchTheme();
    }
    
    @Then("^User checks the default theme mode$")
    public void User_checks_the_theme_default_theme_mode() throws Throwable {
    	log.info("Checking the default theme");
        CA_SwitchThemePanel.checkdefaultSwitchTheme();
    }

}
