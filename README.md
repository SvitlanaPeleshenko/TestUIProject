## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com

#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/

#### Expectations
We will be evaluating
1. Quality of test cases
2. Variety  of testing types (examples: boundary, happy path, negative, etc)
3. Code structure and organization
4. Naming conventions
5. Code readability
6. Code modularity

#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases
Happy path:
1. Placing the order  (with all filled fields)
2. Placing the order  (with mandatory filled fields only)
3. Reset order form 
4. Test for verification of cost calculation

Negative:
1. Placing the order (without filled 'Name','Phone' fields)
2. Placing the order (without filled 'Name' field)
3. Placing the order (without filled 'Phone' field)
4. Placing the order (select both Payment Information pickers, fill all fields)

Validation:
1. Test for validation of mandatory fields ('Name','Phone')(I need requirements)
2. Test for validation of quantity and cost fields (I need requirements) For checking negative cases use(letters
, special characters)

For checking boundary values the requirements are required for fields  

Issues:
1. Selected toppings are not displayed on confirmation popup.
2. 'Toppings 1' and 'Toppings2' fields are not reset after click on 'Reset' button.
3. There is no sense to place order without filled info in "Pizza Order Form" (Now it is possible)
4. It is possible to select both toppings if selected pizza type without toppings.
5. There are no validation for 'Phone','Email','Quantity' fields
6. Calculated cost value should not be changed manually


