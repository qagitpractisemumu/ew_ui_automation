package StepDefinition;


import PagePanel.DashboardPanel;
import cucumber.api.java.en.Then;

import static Resource.UtilityClass.log;

public class DashboardStep {
    DashboardPanel dashboard = new DashboardPanel();

    @Then("^User will be in Dashboard menu and validate the submenus under the main dashboard menu$")
    public void user_will_be_in_Dashboard_menu_and_validate_the_submenus_under_the_main_dashboard_menu()
            throws Throwable {
        log.info("user is in dashboard menu");
        log.info("user is validating the submenus under dashboard mainmenu");
        DashboardPanel.checkSubMenusDashboard();
    }
 
    @Then("^User verifies the Dashboard MainMenu and submenus$")
    public void user_verifies_the_Dashboard_MainMenu_and_submenus() throws Throwable {
    	log.info("user is in dashboard menu");
        log.info("user is validating the Main Menu and Sub Menu submenus under dashboard");
        DashboardPanel.checkSubMenusDashboard();
    }
    
    @Then("^User verifies UI of Compute Utilization tab$")
    public void user_verifies_UI_of_Compute_Utilization_tab() throws Throwable {
        log.info("user is validating the Compute Utilization tab");
        DashboardPanel.checkComputeUtilizationTab();       
    }
         
    @Then("^User verifies UI of Memory Utilization tab$")
    public void user_verifies_UI_of_Memory_Utilization_tab() throws Throwable {
        log.info("user is validating the Memory Utilization tab");
        DashboardPanel.checkMemoryUtilizationTab();      
    }
    
    @Then("^User verifies UI of Disk Utilization tab$")
    public void user_verifies_UI_of_Disk_Utilization_tab() throws Throwable {
        log.info("user is validating the Disk Utilization tab");
        DashboardPanel.checkDiskUtilizationTab();      
    }
    
    @Then("^User verifies UI of Network Read Write tab$")
    public void user_verifies_UI_of_NetworkReadWrite_tab() throws Throwable {
        log.info("user is validating the NetworkReadWrite tab");
        DashboardPanel.checkNetworkReadWriteTab();      
    }
        
    @Then("^User will validate dashboard UI$")
    public void userWillValidateDashboardUI() throws InterruptedException {
        log.info("Checking labels and page elements in Dashboard tabs");
        DashboardPanel.checkDashboardUI();
    }
}
