package com.greatlearning.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import commonUtils.BaseTest;
import commonUtils.GenericUtility;

public class GreatLearningPage extends BaseTest {
	private static final Logger log = LoggerFactory.getLogger(GreatLearningPage.class.getName());

	GenericUtility common = new GenericUtility();

	@FindBy(xpath = "//div[@data-event-type='Explore Programs']")
	private WebElement explorePrograms;

	@FindBy(xpath = "//li[@data-event-type='Cloud Computing']")
	private WebElement cloudComputing;

	@FindBy(xpath = "(//p[.='Cloud Computing'])[1]/following-sibling::ul/li//p[.='PG Program in Cloud Computing']")
	private WebElement clickOnLearningSnippet;

	@FindBy(xpath = "//a[.='Apply Now']")
	private WebElement clickOnApplyNow;

	@FindBy(id = "name")
	private WebElement nameField;

	@FindBy(id = "phone")
	private WebElement phoneField;

	@FindBy(id = "email")
	private WebElement emailField;

	@FindBy(id = "myCity")
	private WebElement myCityField;

	@FindBy(id = "experience")
	private WebElement experienceField;

	@FindBy(id = "app_step_1")
	private WebElement basicNextButton;

	@FindBy(xpath = "//label[.='Years of programming experience']/../select/option[6]")
	private WebElement programmingExprience;

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	private WebElement programmingchekbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement programmingadditionChekbox;

	@FindBy(xpath = "//input[@name='other_planguages']")
	private WebElement OtherprogrammingLanguage;

	@FindBy(id = "professional_section")
	private WebElement nextButton;

	@FindBy(id = "grad_degree")
	private WebElement degreeDropdown;

	@FindBy(xpath = "//input[@name='grad_specialization']")
	private WebElement specilization;

	@FindBy(xpath = "//input[@name='grad_college']")
	private WebElement college;

	@FindBy(id = "grad_year")
	private WebElement graduationYear;

	@FindBy(id = "grad_cgpa")
	private WebElement graduationCGPA;

	@FindBy(id = "prof_details_end")
	private WebElement professionaldetailsEndNextButton;

	@FindBy(xpath = "//input[@name='linkedinurl']")
	private WebElement linkedlnURL;

	@FindBy(id = "upload_next")
	private WebElement clickNextButtonAfterEnterUrl;

	@FindBy(id = "new_question1")
	private WebElement aditionalQuestion;

	@FindBy(xpath = "(//label[@for='declare'])[1]")
	private WebElement acknoledgeCheckbox;

	@FindBy(id = "submit_app")
	private WebElement submitForm;

	/**
	 * @return the getExplorePrograms
	 */
	public WebElement getExplorePrograms() {
		return explorePrograms;
	}

	/**
	 * @return the getCloudComputing
	 */
	public WebElement getCloudComputing() {
		return cloudComputing;
	}

	/**
	 * @return the getClickOnLearningSnippet
	 */
	public WebElement getClickOnLearningSnippet() {
		return clickOnLearningSnippet;
	}

	/**
	 * @return the getClickOnApplyNow
	 */
	public WebElement getClickOnApplyNow() {
		return clickOnApplyNow;
	}

	/**
	 * @return the getNameField
	 */
	public WebElement getNameField() {
		return nameField;
	}

	/**
	 * @return the getPhoneField
	 */
	public WebElement getPhoneField() {
		return phoneField;
	}

	/**
	 * @return the getEmailField
	 */
	public WebElement getEmailField() {
		return emailField;
	}

	/**
	 * @return the getMyCityField
	 */
	public WebElement getMyCityField() {
		return myCityField;
	}

	/**
	 * @return the getExperienceField
	 */
	public WebElement getExperienceField() {
		return experienceField;
	}

	/**
	 * @return the getBasicNextButton
	 */
	public WebElement getBasicNextButton() {
		return basicNextButton;
	}

	/**
	 * @return the getProgrammingExprience
	 */
	public WebElement getProgrammingExprience() {
		return programmingExprience;
	}

	/**
	 * @return the getProgrammingchekbox
	 */
	public WebElement getProgrammingchekbox() {
		return programmingchekbox;
	}

	/**
	 * @return the getProgrammingadditionChekbox
	 */
	public WebElement getProgrammingadditionChekbox() {
		return programmingadditionChekbox;
	}

	/**
	 * @return the getOtherprogrammingLanguage
	 */
	public WebElement getOtherprogrammingLanguage() {
		return OtherprogrammingLanguage;
	}

	/**
	 * @return the getNextButton
	 */
	public WebElement getNextButton() {
		return nextButton;
	}

	/**
	 * @return the getDegreeDropdown
	 */
	public WebElement getDegreeDropdown() {
		return degreeDropdown;
	}

	/**
	 * @return the getSpecilization
	 */
	public WebElement getSpecilization() {
		return specilization;
	}

	/**
	 * @return the getCollege
	 */
	public WebElement getCollege() {
		return college;
	}

	/**
	 * @return the getGraduationYear
	 */
	public WebElement getGraduationYear() {
		return graduationYear;
	}

	/**
	 * @return the getGraduationCGPA
	 */
	public WebElement getGraduationCGPA() {
		return graduationCGPA;
	}

	/**
	 * @return the getProfessionaldetailsEndNextButton
	 */
	public WebElement getProfessionaldetailsEndNextButton() {
		return professionaldetailsEndNextButton;
	}

	/**
	 * @return the getLinkedlnURL
	 */
	public WebElement getLinkedlnURL() {
		return linkedlnURL;
	}

	/**
	 * @return the getClickNextButtonAfterEnterUrl
	 */
	public WebElement getClickNextButtonAfterEnterUrl() {
		return clickNextButtonAfterEnterUrl;
	}

	/**
	 * @return the getAditionalQuestion
	 */
	public WebElement getAditionalQuestion() {
		return aditionalQuestion;
	}

	/**
	 * @return the getAcknoledgeCheckbox
	 */
	public WebElement getAcknoledgeCheckbox() {
		return acknoledgeCheckbox;
	}

	/**
	 * @return the getSubmitForm
	 */
	public WebElement getSubmitForm() {
		return submitForm;
	}

	// **********Intilize the page**********
	public GreatLearningPage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @verify hoverOnHeader
	 */

	public void hoverOnHeader() throws Exception {
		common.WaitForTheVisibilityOfElement(getExplorePrograms(), 20);
		common.JseHighlightTheElement(getExplorePrograms());
		common.actionsMouseOver(getExplorePrograms());
		common.clickElement(getExplorePrograms());
		common.wait(4);

	}

	/**
	 * @verify domainSubheaderlist
	 */

	public void domainSubheaderList() throws Exception {
		common.WaitForTheVisibilityOfElement(getCloudComputing(), 20);
		common.JseHighlightTheElement(getCloudComputing());
		common.clickElement(getCloudComputing());
		common.wait(2);

	}

	/**
	 * @verify selectcoursList
	 */

	public void selectcoursList() throws Exception {
		common.WaitForTheVisibilityOfElement(getClickOnLearningSnippet(), 20);
		common.clickElement(getClickOnLearningSnippet());

	}

	/**
	 * @verify clickonApplyNow
	 */

	public void clickonApplyNowButton() throws Exception {
		common.wait(2);
		common.WaitForTheVisibilityOfElement(getClickOnApplyNow(), 20);
		common.JseHighlightTheElement(getClickOnApplyNow());
		common.clickElement(clickOnApplyNow);

	}

	/**
	 * @enter basic information
	 */

	public void enterBasicInfo(String name, String mobile, String emailid, String currentcity) throws Exception {
		common.WaitForTheVisibilityOfElement(getNameField(), 20);
		common.JseHighlightTheElement(getNameField());
		common.typeTextToTextBox(getNameField(), name);
		common.JseHighlightTheElement(getPhoneField());
		common.typeTextToTextBox(getPhoneField(), mobile);
		common.JseHighlightTheElement(getEmailField());
		common.typeTextToTextBox(getEmailField(), emailid);
		common.scrollToview(getMyCityField());
		common.JseHighlightTheElement(getMyCityField());
		common.typeTextToTextBox(getMyCityField(), currentcity);

	}

	/**
	 * @enter select work exprience
	 */

	public void selectWorkExprience(String workexp) throws Exception {
		common.WaitForTheVisibilityOfElement(getExperienceField(), 20);
		common.JseHighlightTheElement(getExperienceField());
		common.selectDropdown(getExperienceField(), workexp);
	}

	/**
	 * @verify basic Next button
	 */

	public void basicNextButton() throws Exception {
		common.WaitForTheVisibilityOfElement(getBasicNextButton(), 20);
		common.JseHighlightTheElement(getBasicNextButton());
		common.clickElement(getBasicNextButton());
		common.wait(2);

	}

	/**
	 * @enter select programming exprience
	 */

	public void selectProgramingExprience() throws Exception {
		common.scrollToview(getProgrammingExprience());
		common.JseHighlightTheElement(getProgrammingExprience());
		common.clickElement(getProgrammingExprience());
		common.wait(4);

	}

	/**
	 * @enter select programming language comfortable
	 */

	public void selectProgrrammingComfortable() throws Exception {
		common.wait(4);
		common.scrollToview(getProgrammingchekbox());
		common.JseHighlightTheElement(getProgrammingchekbox());
		common.clickElement(getProgrammingchekbox());
		common.JseHighlightTheElement(getProgrammingadditionChekbox());
		common.clickElement(getProgrammingadditionChekbox());
	}

	/**
	 * @enter enter other programming language
	 */

	public void otherProgrrammingLanguage(String otherProgramming) throws Exception {
		common.WaitForTheVisibilityOfElement(getOtherprogrammingLanguage(), 20);
		common.JseHighlightTheElement(getOtherprogrammingLanguage());
		common.typeTextToTextBox(getOtherprogrammingLanguage(), otherProgramming);

	}

	/**
	 * @verify professional Next button
	 */

	public void professionalNextButton() throws Exception {
		common.scrollToview(getNextButton());
		common.WaitForTheVisibilityOfElement(getNextButton(), 20);
		common.clickElement(getNextButton());
		common.wait(4);

	}

	/**
	 * @verify select degree
	 */

	public void selectDegree(String dropdown) throws Exception {
		common.scrollToview(getDegreeDropdown());
		common.WaitForTheVisibilityOfElement(getDegreeDropdown(), 20);
		common.selectDropdown(getDegreeDropdown(), dropdown);
		common.JseHighlightTheElement(getDegreeDropdown());
		common.wait(4);

	}

	/**
	 * @verify select selectspecilizationCollege
	 */

	public void selectspecilizationCollege(String specialization, String college) throws Exception {
		common.WaitForTheVisibilityOfElement(getSpecilization(), 20);
		common.JseHighlightTheElement(getSpecilization());
		common.typeTextToTextBox(getSpecilization(), specialization);
		common.scrollToview(getCollege());
		common.JseHighlightTheElement(getCollege());
		common.typeTextToTextBox(getCollege(), college);
		common.wait(4);

	}

	/**
	 * @verify select graduateYear
	 */

	public void graduateYear(String year) throws Exception {

		common.WaitForTheVisibilityOfElement(getGraduationYear(), 20);
		common.selectDropdown(getGraduationYear(), year);
		common.JseHighlightTheElement(getGraduationYear());
		common.wait(4);

	}

	/**
	 * @verify select selectspecilizationCollege
	 */

	public void enterCGPA(String cgpa) throws Exception {
		common.WaitForTheVisibilityOfElement(getGraduationCGPA(), 20);
		common.JseHighlightTheElement(getGraduationCGPA());
		common.typeTextToTextBox(getGraduationCGPA(), cgpa);

	}

	/**
	 * @verify professional Next button
	 */

	public void professionalendNextButton() throws Exception {
		common.scrollToview(getProfessionaldetailsEndNextButton());
		common.WaitForTheVisibilityOfElement(getProfessionaldetailsEndNextButton(), 20);
		common.clickElement(getProfessionaldetailsEndNextButton());
		common.wait(4);

	}

	/**
	 * @verify select selectspecilizationCollege
	 */

	public void enterLinkdelnUrl(String URL) throws Exception {
		common.WaitForTheVisibilityOfElement(getLinkedlnURL(), 20);
		common.JseHighlightTheElement(getLinkedlnURL());
		common.typeTextToTextBox(getLinkedlnURL(), URL);

	}

	/**
	 * @verify clicknextButtonOnEnterLinkdelnUrl
	 */

	public void clicknextButtonOnEnterLinkdelnUrl() throws Exception {
		common.scrollToview(getClickNextButtonAfterEnterUrl());
		common.WaitForTheVisibilityOfElement(getClickNextButtonAfterEnterUrl(), 20);
		common.clickElement(getClickNextButtonAfterEnterUrl());

	}

	/**
	 * @verify enterAdditionalQuestion
	 */

	public void enterAdditionalQuestion(String question) throws Exception {
		common.WaitForTheVisibilityOfElement(getAditionalQuestion(), 20);
		common.JseHighlightTheElement(getAditionalQuestion());
		common.scrollToview(getAditionalQuestion());
		common.typeTextToTextBox(getAditionalQuestion(), question);
		common.wait(2);

	}

	/**
	 * @verify select TermsandCondition
	 */

	public void selectTermsandCondition() throws Exception {
		common.wait(2);
		common.clickElement(getAcknoledgeCheckbox());

	}

	/**
	 * @verify submit form
	 */

	public void submitForms() throws Exception {
		common.WaitForTheVisibilityOfElement(getSubmitForm(), 20);
		common.clickElement(getSubmitForm());
		common.wait(4);

	}

}
