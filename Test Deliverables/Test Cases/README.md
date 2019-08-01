<h1>QE Todolist</h1>
<h1>Prepared by: </h1>
Siphahle Nomnganga
31 July 2019
<h1>Test Cases</h1>

 
Test case id | Test scenairo           | Step Details           | Expected Results| Actual Results| Pass/Fail/Not executed/Suspended| Automated
------------ | -------------  | ------------  | ------------  | ------------  | ------------  | ------------
1|  Test if the application can deploy in docker | Navigate to http://localhost:8081/ | The web application should be loaded.| The web application is loaded successful| Pass | Yes
2|  Test if the user able to add todo items | 1. Click on the create new todo item text area to add todo items 2. Enter text "Testing" 3. Click button submit | The user should be able to add to do items| Todo Items are added successful| Pass | Yes
3|  Test if the user can be able to Edit todo items successful | Enter the data in the update value text area to update todo items and click the update button. | The todo items should be update and appear on the left-hand side of the update value text field| The todo items is updated successful and it appears on the left-hand side of the update value text field.| Pass| Yes
4|  Test if the user can be able to delete todo items  | Click the X button to delete todo items. | The todo items should be deleted | The X button delete the todo items successful. | Pass| Yes
5|  Test if the list items persist after browser refresh  | Click the refresh button on the browser. | The todo items should not disappear | The todo items does not disappear.| Pass| Yes
6|  Test if the todo items can be updated with an empty text field   | Click the update button without entering any information to the Update Value text area.  | The todo items should not be updated without entering information in the Update Value text area an error message should be displayed requesting or telling the user to add information.| The user is able to Update the todolist without entering information in the update value text area. | Fail| Yes
7|  Test if Multiple users can be able to view the shared public todo list after clicking the refresh browser button | Click the refresh button on the browser | Users can be able to view the public shared todo list after clicking the browser refresh| Users can't view the public shared todo list after clicking the browser refresh button| fail| Yes


