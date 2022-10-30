package StepDefinition;

import PagePanel.PA_SessiontimeoutPanel;
import cucumber.api.java.en.Then;

public class PA_Sessiontimeout {

	PA_SessiontimeoutPanel PAtimeout = new PA_SessiontimeoutPanel();

	@Then("^Admin clicks on Stay Logged In button$")
	public void Admin_clicks_on_Stay_Logged_In_button() {
	PAtimeout.stay_Loggedin();
	}
	
	@Then("^Admin signsout of the Provider admin portal$")
	public void Admin_signsout_of_the_Provider_admin_portal() {
		PAtimeout.signout();
	}
	
	@Then("^Admin clicks on Log Out Now button$")
	public void Admin_clicks_on_Log_Out_Now_button() {
		PAtimeout.logout_Nowbutton();
	}
}
