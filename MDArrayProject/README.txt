****************
* Project 1/Grid Monitor: Avoiding An Unscheduled Space Walk
* CS 221
* 24/01/2016
* <Name>
**************** 

OVERVIEW:

 Grid Monitor project analyzes input two-dimensional array of 
 level readings and inform about the danger level in every cell.


INCLUDED FILES:

 List the files required for the project with a brief
 explanation of why each is included.

 e.g.
 * GridMonitor.java - All the APIs required to achieve the objective are defined in this source file.
 * GridMonitorInterface.java - All the APIs required to achieve the objective are declared in this source file.
 * GridMonitorTest.java - Source file to test the Grid Monitor project with different set of input files.
 * README - this file


COMPILING AND RUNNING:

 Command for compiling the program, 
 > javac GridMonitorTest.java
 Command for running the program,
 > java GridMonitor 
	While running the project user must put the sample file in the same directory 
	where the compiled class file is present
 
 e.g.
 From the directory containing all source files, compile the
 driver class (and all dependencies) with the command:
 $ javac GridMonitorTest.java

 Run the compiled class file with the command:
 $ java GridMonitor

 Console output will give the results after the program finishes.

 gridMonitorInterfaceTest                           PASS
 loadSampleTest                                     PASS
 getBaseGridSampleTest                              PASS
 getSurroundingSumGridSampleTest                    PASS
 getSurroundingAvgGridSampleTest                    PASS
 getDeltaGridSampleTest                             PASS
 getDangerGridSampleTest                            PASS
 toString() output:
 GridMonitor : [
 Grid Size : {3*3}
 Grid Data : {
 {2.0, 10.0, 7.0},
 {4.0, 5.0, 8.0},
 {5.0, 6.0, 9.0}}
 ]
 lameToStringTest                                   PASS
 getBaseEncapsulationTest                           PASS
 getSurroundingSumGridEncapsulationTest             PASS
 getSurroundingAvgGridEncapsulationTest             PASS
 noSuch.txt (The system cannot find the file specified)

 noSuchFileTest                                     PASS

 Total Tests: 12,  Passed: 12,  Failed: 0

PROGRAM DESIGN AND IMPORTANT CONCEPTS:

 The project has two classes and one interface
 GridMonitor - All the APIs required to achieve the objective are defined in this source file.
 GridMonitorInterface.java - All the APIs required to achieve the objective are declared in this source file.
 GridMonitorTest.java - Source file to test the Grid Monitor project with different set of input files.

TESTING:

 The project has been test with various set of inputs and produced proper result every time as expected

----------------------------------------------------------------------------

