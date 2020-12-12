Feature: To verify user is able to submit home enquiry form to compare home insurance quotes

  Background:
    Given user is on the Details Policy Expert Page

  @PolicyExpertDetailsPage
  Scenario Outline: Verify the customer is able to submit his details on the details page of Home Insurance
    When user selects "<Title>" from dropdown
    And user enters "<FirstName>" in "Firstname"
    And user enters "<LastName>" in "Lastname"
    And user selects "<Day>" from dropdown
    And user selects "<Month>" from dropdown
    And user selects "<Year>" from dropdown
    And user selects "<MaritalStatus>" from dropdown
    And user enters "<Occupation>" in "Occupation"
    And user clicks on "<SmokingStatus>" of "SmokingStatus" button



    Examples:

      | Title | FirstName | LastName | Day | Month   | Year | MaritalStatus | Occupation        | SmokingStatus |
      | Mrs   | Surbhi    | Yadav    | 27  | January | 1992 | Married       | Software Engineer | No            |