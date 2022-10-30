# WirelessOffice
1. Git pull the code.

2. Open eclipse and click on File > import project, select maven > existing maven project, browse project folder, and click on finish button.

3. Let project download all dependency and get ready.

########################################################################

#To Run project
1. Go to src/test/java folder, open TestRunner.java file, right click on file, Run as testNG.

This will run all the test cases in sequence. There might be a possibility that test case may fail that will be becuase of profile section.


2. Another way to run is open testNG.xml file, right click and run. By running this way we can run entire suite based on TestRunner.java setup.



########################################################################

#Report

There are 2 reporting done in this project

1. ExtendReport: There is a folder name ExtendReport, open the folder, TestReport.html file will be there that is the report file.

2. TestNG report: "test-output folder" > Under default Suite folder we have "Default test.html" open html file.

3. Under "test-output folder" there is a file called emailable-report.html, that is used 


########################################################################
#Logs:

There is a file names logs.out that contains all the logs for test execution.


