@customerAdmin
Feature: Test Wireless Office application for Customer Admin - Training functionality

###@WO1.1@Tranining
  ###@smoke@VerifyVideos
  @ca-Training-Positive
  Scenario Outline: On support page, verify the offline chat functionality
    Given User navigates to Customer Admin Portal
    Then User click on Login EmailID RadioButton
    Then User enter Login details like "<password>"
    Then User clicks on Login button
    Then User fetch otp from mail
    Then User clicks on Complete button
    Then User clicks on Training
    Then User checks Video
    Then User searches video"<VideoName>"


    Examples:
      | password      | VideoName |
      | 12345@Testing | videos    |