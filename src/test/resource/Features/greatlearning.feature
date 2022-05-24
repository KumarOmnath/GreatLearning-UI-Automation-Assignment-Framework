@Sanity
Feature: GreatLearning pages automation

  Background: Verify GreatLearning application naviage to form screen
    Given Load the browser and Navigate to GreatLearning URL
    When User hover over Explore Programs List from the header
    And User Select Cloud Computing domain from  the domain list
    And User select greatlakes CourseSnippet from the course snippet list
    Then User naviagte to apply screen & from that screen user click on ApplyNow button

  @smaoke
  Scenario Outline: Verify GreatLearning form filling
    Given validate new  window open & user enter "<Name>" and "<Mobilenumber>" and "<email>" and "<Currentcity>"
    When User  select "<workexprience>" from dropdown
    And User click on next button
    And User  click YearOfProgramming from dropdown
    And User select checkbox ProgrammingLanguage comfortable from list
    And User Enter "<AnyProgramming>" Languag
    And User click on next button after fill details
    And User select degree "<Degree>" from dropdown
    And User enter Specialization "<Specialization>"  in filed and User enter college "<university>" name
    And User select Year of Graduation "<Year of Graduation>" from dropdown
    And User enter CGPA "<CGPA>" in field
    And User click on next button after fill instutation details
    And User Enter Linkdeln profile "<Linkdeln profile>" url
    And User click on next button after enter Linkdeln url
    And User enter additional "<Statement of Purpose>" in field
    And User select checkbox of terms & condition
    Then User Submit  the Application

    Examples: 
      | Name                 | Mobilenumber | email                   | Currentcity | workexprience | AnyProgramming | Degree       | Specialization                 | university        | Year of Graduation | CGPA | Linkdeln profile                | Statement of Purpose                             |
      | KumarTesting Purpose |   1234567898 | kumartest@mailcache.com | Bangalore   | PG Student    | JavaSelenium   | B.E./B.Tech. | Electronic and Instrumentation | madras University |               2019 |   78 | https://www.linkedin.com/signup | Please ignore,its for testing Assignment Purpose |
