CS542 Design Patterns
FALL 2016
ASSIGNMENT <ASSIGNMENT 3> README FILE

Due Date: <ASSIGNMENT DUE DATE,  Friday, October 28, 2016>
Submission Date: <DATE SUBMITED,  Friday, October 28, 2016>
Author(s): <Sagar Kale> 
           <Saurabh Chaudhari>
e-mail(s): <skale4@binghamton.edu>
		   <schaud14@binghamton.edu>

PURPOSE:
Identify and Enforce a design pattern to the given requirements.
Pattern Enforced: Builder Pattern

PERCENT COMPLETE:
We believe that we have completed this assignment to 100%.

FILES:
Driver.java
Results.java
StdoutDisplayInterface.java
BU2017OrientationPlanner.java
BU2017OrnDirector.java
BuyBooksInterface.java
BuyBooks.java
CampusTourInterface.java
CampusTour.java
CarbonFootPrintInterface.java
CarbonFootPrint.java
CostInterface.java
Cost.java
Director.java
DurationInterface.java
Duration.java
EffortInterface.java
Effort.java
Logger.java
Orientation.java
OrientationPlanner.java
RegistrationInterface.java
Registration.java
SelectingDormInterface.java
SelectingDorm.java
StudentOrientation.java

SAMPLE OUTPUT:
For DebugValue = 2
Student has selected BUS RIDE option for Campus Tour...
[Current Duration: 0] + [Duration Add: 45] = [New Duration: 45]
[Current Cost: 0.0] + [Cost Add: 2.0] = [New Cost: 2.0]
[Current CO2: 0] + [CO2 Add: 2] = [New CO2: 2]
[Current Efforts: 0] + [Efforts Add: 100] = [New Efforts: 100]
.
.

For DebugValue = 1
TOTAL DURATION: 250
TOTAL COST: 1657.0
TOTAL CARBON FOOTPRINT: 15
TOTAL EFFORTS: 960

TO COMPILE: 
ant -buildfile src/build.xml all

TO RUN:
ant -buildfile src/build.xml run

TO CLEAN: 
ant -buildfile src/build.xml clean

DATA STRUCTURES USED:
No Data Structure used.