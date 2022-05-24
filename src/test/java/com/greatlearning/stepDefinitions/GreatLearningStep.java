package com.greatlearning.stepDefinitions;

import java.io.FileOutputStream;
import java.io.PrintStream;

import com.greatlearning.page.GreatLearningPage;

import commonUtils.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GreatLearningStep {

	GreatLearningPage greatLearningPage;

	@Given("^Load the browser and Navigate to GreatLearning URL$")
	public void load_the_browser_and_Navigate_to_GreatLearning_URL() throws Throwable {
		PrintStream logs = new PrintStream(new FileOutputStream("AllLogs.txt"));
		System.setOut(logs);
		BaseTest.initialization();
	}

	@When("^User hover over Explore Programs List from the header$")
	public void user_hover_over_Explore_Programs_List_from_the_header() throws Throwable {
		greatLearningPage = new GreatLearningPage();
		greatLearningPage.hoverOnHeader();
	}

	@When("^User Select Cloud Computing domain from  the domain list$")
	public void user_Select_Cloud_Computing_domain_from_the_domain_list() throws Throwable {
		greatLearningPage.domainSubheaderList();
	}

	@When("^User select greatlakes CourseSnippet from the course snippet list$")
	public void user_select_greatlakes_CourseSnippet_from_the_course_snippet_list() throws Throwable {
		greatLearningPage.selectcoursList();

	}

	@When("^User naviagte to apply screen & from that screen user click on ApplyNow button$")
	public void user_naviagte_to_apply_screen_from_that_screen_user_click_on_ApplyNow_button() throws Throwable {
		greatLearningPage.clickonApplyNowButton();
	}

	@Given("^validate new  window open & user enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void validate_new_window_open_user_enter_and_and_and(String name, String mobile, String emailid,
			String currentcity) throws Throwable {
		greatLearningPage.enterBasicInfo(name, mobile, emailid, currentcity);
	}

	@When("^User  select \"([^\"]*)\" from dropdown$")
	public void user_select_from_dropdown(String workexprience) throws Throwable {
		greatLearningPage.selectWorkExprience(workexprience);
	}

	@When("^User click on next button$")
	public void user_click_on_next_button() throws Throwable {
		greatLearningPage.basicNextButton();
	}

	@When("^User  click YearOfProgramming from dropdown$")
	public void user_click_YearOfProgramming_from_dropdown() throws Throwable {
		greatLearningPage.selectProgramingExprience();
	}

	@When("^User select checkbox ProgrammingLanguage comfortable from list$")
	public void user_select_checkbox_ProgrammingLanguage_comfortable_from_list() throws Throwable {
		greatLearningPage.selectProgrrammingComfortable();
	}

	@When("^User Enter \"([^\"]*)\" Languag$")
	public void user_Enter_Languag(String otherProgramming) throws Throwable {
		greatLearningPage.otherProgrrammingLanguage(otherProgramming);
	}

	@When("^User click on next button after fill details$")
	public void user_click_on_next_button_after_fill_details() throws Throwable {
		greatLearningPage.professionalNextButton();
	}

	@When("^User select degree \"([^\"]*)\" from dropdown$")
	public void user_select_degree_from_dropdown(String dropdown) throws Throwable {
		greatLearningPage.selectDegree(dropdown);
	}

	@When("^User enter Specialization \"([^\"]*)\"  in filed and User enter college \"([^\"]*)\" name$")
	public void user_enter_Specialization_in_filed_and_User_enter_college_name(String specialization, String college)
			throws Throwable {
		greatLearningPage.selectspecilizationCollege(specialization, college);
	}

	@When("^User select Year of Graduation \"([^\"]*)\" from dropdown$")
	public void user_select_Year_of_Graduation_from_dropdown(String year) throws Throwable {
		greatLearningPage.graduateYear(year);
	}

	@When("^User enter CGPA \"([^\"]*)\" in field$")
	public void user_enter_CGPA_in_field(String cgpa) throws Throwable {
		greatLearningPage.enterCGPA(cgpa);
	}

	@When("^User click on next button after fill instutation details$")
	public void user_click_on_next_button_after_fill_instutation_details() throws Throwable {
		greatLearningPage.professionalendNextButton();
	}

	@When("^User Enter Linkdeln profile \"([^\"]*)\" url$")
	public void user_Enter_Linkdeln_profile_url(String URL) throws Throwable {
		greatLearningPage.enterLinkdelnUrl(URL);
	}

	@When("^User click on next button after enter Linkdeln url$")
	public void user_click_on_next_button_after_enter_Linkdeln_url() throws Throwable {
		greatLearningPage.clicknextButtonOnEnterLinkdelnUrl();
	}

	@When("^User enter additional \"([^\"]*)\" in field$")
	public void user_enter_additional_in_field(String question) throws Throwable {
		greatLearningPage.enterAdditionalQuestion(question);
	}

	@When("^User select checkbox of terms & condition$")
	public void user_select_checkbox_of_terms_condition() throws Throwable {
		greatLearningPage.selectTermsandCondition();
	}

	@Then("^User Submit  the Application$")
	public void user_Submit_the_Application() throws Throwable {
		greatLearningPage.submitForms();
	}

}
