Feature: Login for Leaptaps
Background: Login
#Given Opens the Browser 

#And Maximizes the window
#And Loads the URL
#And Sets the Timeout
#And Enters the Username as DemoSalesManager
#And Enters the password as crmsfa
#And Clicks on the Login Button
#And Verifys the Login is successfull
#When clicks on the crmsfa link
Then Clickss on the Leads button

@createlead
Scenario: Leadcreation
And click on the create lead button
And Enters the company name as NST
And Enters the first name as joe
And Enters the last name as joel
When clicks on the create lead button
Then verifys the first name as NST

@editlead
Scenario: editlead
And click the Findleads button
And Enter the first name as A
And Click the Findleads button
And Click on the first resultant lead
#And verify the title of the page
And click on the edit butotn
And update the company name as BON
And click on the update button
And verify the updated company name as BON
And close the browser
@duplicatelead
Scenario: duplicatelead
And click the Findleads button
And Enter the Email ID as mramyasri1996@gmail.com 
And Click the Findleads button
And Click on the first resultant lead
And capture the first name
And click on the duplicate lead button
And verify the title of the page
And click on the createleadbutton in the duplicate page
When capture the first name in duplicate page
And  close the browser

