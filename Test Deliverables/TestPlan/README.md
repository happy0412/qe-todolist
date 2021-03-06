<h1>QE Todolist</h1>
<h1>Prepared by: </h1>
Siphahle Nomnganga
31 July 2019
<h1>Test Plan</h1>

The Test Plan has been created to communicate the test approach to team members. It includes the objectives, application requirements, Assumptions/ risks and approach.  This document will clearly identify what the test deliverables will be and what is deemed in and out of scope.

<h1>1.1 Objectives</h1>
QE Todolist is a web-based application that creates, update, edit, and delete items. This software was built with node js. The team is responsible for testing the application and ensuring it meet the minimum requirements and the team will strictly focus on the forntend of the application.

<h1>1.2 Team Members</h1>

Resource Name | Role
------------ | -------------
Siphahle Nomnganga| QA
 


 <h1>2 Application requirements</h1>
The initial phase will include all must have requirements. These and any other requirements that get included must all be tested. At the end of the project a tester must be able to implement the following:

* 	Application must be able to deploy in docker
* 	Multiple users should be able to view the shared public todo list (no live updates, only on refresh)
* 	Todo list items should persist after browser refresh
* 	Todo items should not be able to be empty
* 	Should be able to add todo items
* 	Should be able to delete todo items
* 	Should be able to edit todo items

<h1>3 Features not to be Tested</h1>

In this section, we list out the features which are not included in the project can be tested in the future.

* The application (frontend only) should be ported to Cordova and run as a mobile application.
* The application backend should run in Kubernetes on a 3 node cluster with multiple replicas of each pod.
* Should be able to do rolling updates on the backend service without downtime
  Application should be self healing after network issues, node outages, node restarts and other issues


<h1>4 Assumptions /Risks</h1>
One of the risks in our project is that data is not being stored after adding a list.

 <h1>5 Test Approach </h1>
 
The project is using an agile approach, with weekly iterations. At the end of each week the requirements identified for that iteration will be delivered to the team and will be tested
Exploratory testing will play a huge role of the testing since I have never used this type of tool and will be learning as the process moves forward. Functional Testing will also be carried out during the testing of the software.
 <h1>5.1 Test Automation/ Manual Testing </h1>
Both manual and Automation Testing will be performed.
<h1>6 Test Environment  </h1>
A  web server is required. The application will be tested on windows 10 operating system and it will run on FireFox.

 <h1> 6. Major Deliverables</h1>
 
Deliverable | For           | Date/ Milestone
------------ | -------------  | ------------
Test Plan|  QE Manager | 01/08/2019
Test Cases|  QE Manager | 01/08/2019
Test Script|  QE Manager | 01/08/2019
Bug Report|  QE Manager | 01/08/2019
