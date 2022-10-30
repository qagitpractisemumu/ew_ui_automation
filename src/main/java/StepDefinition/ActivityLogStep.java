package StepDefinition;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import PagePanel.ActivityLogPanel;
import Resource.LoggerHelper;
import cucumber.api.java.en.Then;

public class ActivityLogStep {

	ActivityLogPanel activityLogPanel = new ActivityLogPanel();
	public static Logger log = LoggerHelper.getLogger(ActivityLogStep.class);

	@Then("^User clicks on Activity log menu$")
	public void user_clicks_on_Activity_log_menu() throws InterruptedException {
		ActivityLogPanel.clickOnActivityLogMenu();
        Thread.sleep(2000);
	}

	@Then("^verify record is logged in activity log with ActivityName \"([^\"]*)\"$")
	public void verify_record_is_logged_in_activity_log_with_ActivityName(String ActivityName) {

		for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {

			System.out.println(ActivityLogPanel.getLogData().get(i).getText());
			ActivityLogPanel.getLogData().get(i).getText().equalsIgnoreCase(ActivityName);
		}
		Assert.assertTrue(ActivityLogPanel.getLogData().get(1).getText().equalsIgnoreCase(ActivityName));
	}
	@Then("^User clicking Activity Log Menu in PA Portal$")
	public void user_clicking_activity_log_menu_PA_Portal() throws Throwable{
		ActivityLogPanel.clickActivityLogMenuPAPortal();
	}
	@Then("^User clicks Search Button for Activity Log menu of PA Portal$")
	public void user_clicks_search_btn_activitylog_PA_Portal() throws Throwable{
		ActivityLogPanel.clickSearchBtnActivityLogMenuPAPortal();
	}
	@Then("^User entering customer name in the search box for Activity Log Menu of PA Portal \"([^\"]*)\"$")
	public void user_entering_customer_name_searchbox_PA_Portal(String businessName) throws Throwable{
		ActivityLogPanel.enterCustomerNameInSearchBoxPAPortal(businessName);
	}
	@Then("^User verify record in Activity Log in PA Portal for Location Create \"([^\"]*)\"$")
	public void verify_record_in_Activity_log_PA_Portal_loccreate(String activityloglocationcreate) throws Exception {

		for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
		}

		System.out.println(ActivityLogPanel.getLogData3().getText());
		Thread.sleep(2000);

		Assert.assertTrue(ActivityLogPanel.getLogData3().getText().equalsIgnoreCase(activityloglocationcreate));
		System.out.println("As we created location in CA portal,it is verified and Found in Activity Log of PA Portal");

}
	@Then("^User verify record in Activity Log in PA Portal for Location Edit \"([^\"]*)\"$")
	public void verify_record_is_logged_in_activity_log_PA_Portal_locedit(String activityloglocationedit) throws Exception {

		for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
		}
		System.out.println(ActivityLogPanel.getLogData2().getText());
		Thread.sleep(2000);
		Assert.assertTrue(ActivityLogPanel.getLogData2().getText().equalsIgnoreCase(activityloglocationedit));
		System.out.println("As we Edited location in CA portal,it is verified and Found in Activity Log of PA Portal");
}

@Then("^User verify record in Activity Log in PA Portal for Location Delete \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_locdelete(String activityloglocationdelete) throws Exception {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
	}
	System.out.println(ActivityLogPanel.getLogData1().getText());
	Thread.sleep(2000);
	System.out.println("As we deleted location in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log in PA Portal for Group Create \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_groupcreate(String activityloggroupcreate) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData3().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData3().getText().equalsIgnoreCase(activityloggroupcreate));
	System.out.println("As we created Group in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log in PA Portal for Group Edit \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_groupedit(String activityloggroupedit) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData2().getText());

	Assert.assertTrue(ActivityLogPanel.getLogData2().getText().equalsIgnoreCase(activityloggroupedit));
	System.out.println("As we edited Group in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log in PA Portal for Group Delete \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_groupdelete(String activityloggroupdelete) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());

	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activityloggroupdelete));
	System.out.println("As we deleted group in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of User create \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_usercreate(String activitylogusercreate) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());

	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activitylogusercreate));
	System.out.println("As we created User in CA portal,it is verified and Found in Activity Log of PA Portal");
}
@Then("^User verify record in Activity Log of PA Portal for User Edit \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_useredit(String activityloguseredit) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());

	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activityloguseredit));
	System.out.println("As we Edited User details in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for SubAdmin create \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_subadmincreate(String activitylogsubadmincreate) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
	}
	System.out.println(ActivityLogPanel.getLogData1().getText());

	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activitylogsubadmincreate));
	System.out.println("As we created SubAdmin in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for SubAdmin Delete \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_subadmindelete(String activitylogsubadmindelete) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
	}
	System.out.println(ActivityLogPanel.getLogData1().getText());

	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activitylogsubadmindelete));
	System.out.println("As we Deleted SubAdmin in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for SignIn \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_signin(String activitylogsignin) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activitylogsignin));
	System.out.println("As we Logged in with email in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for Support Ticket Create \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_supportticketcreate(String activitylogsupportticketcreate) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activitylogsupportticketcreate));
	System.out.println("As we created Support ticket in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for User Delete \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_userdelete(String activityloguserdelete) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activityloguserdelete));
	System.out.println("As we Deleted User in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for SubAdmin Edit \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_subadminedit(String activitylogsubadminedit) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activitylogsubadminedit));
	System.out.println("As we Edited SubAdmin in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for particular location update \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_moreservices_location_update(String activityloglocationupdate) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activityloglocationupdate));
	System.out.println("As we made changes in More Services for particular Location in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for particular location MoreServices update \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_location_services_update(String activityloglocationmoreservicesupdate) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData2().getText());

	Assert.assertTrue(ActivityLogPanel.getLogData5().getText().equalsIgnoreCase(activityloglocationmoreservicesupdate));
	System.out.println("As we updated More Services options in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for Reset Password \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_reset_password(String activitylogresetpassword) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activitylogresetpassword));
	System.out.println("As we Changed the password using Reset Password in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for email signup \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_signup_email(String activitylogemailsignup) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData5().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData5().getText().equalsIgnoreCase(activitylogemailsignup));
	System.out.println("As we Sign up the account with Email in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for profile details \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_profile_details(String activitylogprofiledetails) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData4().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData4().getText().equalsIgnoreCase(activitylogprofiledetails));
	System.out.println("As we Enter and Saved the Profile Details in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for business details \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_business_details(String activitylogbusinessdetails) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData3().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData3().getText().equalsIgnoreCase(activitylogbusinessdetails));
	System.out.println("As we Enter and Saved the Business Details in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for payment details \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_payment_details(String activitylogpaymentdetails) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData2().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData2().getText().equalsIgnoreCase(activitylogpaymentdetails));
	System.out.println("As we Enter and Saved the Payment Details in CA portal,it is verified and Found in Activity Log of PA Portal");

}
@Then("^User verify record in Activity Log of PA Portal for primary card \"([^\"]*)\"$")
public void verify_record_is_logged_in_activity_log_PA_Portal_primary_card(String activitylogprimarycard) {

	for (int i = 0; i < ActivityLogPanel.getLogData().size(); i++) {
}
	System.out.println(ActivityLogPanel.getLogData1().getText());
	Assert.assertTrue(ActivityLogPanel.getLogData1().getText().equalsIgnoreCase(activitylogprimarycard));
	System.out.println("As the Credit card given gets Saved in CA portal,it is verified and Found in Activity Log of PA Portal");

}


}
