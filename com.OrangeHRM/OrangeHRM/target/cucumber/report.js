$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddEmployee.feature");
formatter.feature({
  "line": 1,
  "name": "User Add employee",
  "description": "",
  "id": "user-add-employee",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5710583503,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "User add new employee in the Employee List",
  "description": "",
  "id": "user-add-employee;user-add-new-employee-in-the-employee-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User hoover PIM menu and Clicks on tehe Employee list",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the Add button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Add employee by entering all values in the fields",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the save button.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the Employee list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user verify if the name exits",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_login_to_the_application()"
});
formatter.result({
  "duration": 247831100,
  "status": "passed"
});
formatter.match({
  "location": "addEmployeeSteps.user_hoover_PIM_menu_and_Clicks_on_the_Employee_list()"
});
formatter.result({
  "duration": 2031903559,
  "status": "passed"
});
formatter.match({
  "location": "addEmployeeSteps.user_clicks_on_the_Add_button()"
});
formatter.result({
  "duration": 1667486185,
  "status": "passed"
});
formatter.match({
  "location": "addEmployeeSteps.user_Add_employee_by_entering_all_values_in_the_fields()"
});
formatter.result({
  "duration": 33555,
  "status": "passed"
});
formatter.match({
  "location": "addEmployeeSteps.user_clicks_on_the_save_button()"
});
formatter.result({
  "duration": 33949,
  "status": "passed"
});
formatter.match({
  "location": "addEmployeeSteps.user_clicks_on_the_Employee_list()"
});
formatter.result({
  "duration": 34344,
  "status": "passed"
});
formatter.match({
  "location": "addEmployeeSteps.user_verify_if_the_name_exits()"
});
formatter.result({
  "duration": 27633,
  "status": "passed"
});
formatter.after({
  "duration": 4247096850,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the Application",
  "description": "Exisiting  User should be able to login into account using correct credentials",
  "id": "login-to-the-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4789541832,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Log into the account using correct credentials",
  "description": "",
  "id": "login-to-the-application;log-into-the-account-using-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the username",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter the password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is able to login to the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_login_to_the_application()"
});
formatter.result({
  "duration": 82421936,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_the_username()"
});
formatter.result({
  "duration": 179500055,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_the_password()"
});
formatter.result({
  "duration": 149641343,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_Login_Button()"
});
formatter.result({
  "duration": 947745083,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_able_to_login_to_the_application()"
});
formatter.result({
  "duration": 59996124,
  "status": "passed"
});
formatter.after({
  "duration": 4018395727,
  "status": "passed"
});
});