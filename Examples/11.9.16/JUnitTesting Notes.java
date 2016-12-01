junit.org
> download and install 
download both 
junit.jar
hamcrest-core.jar
they'll just be another set of extensions
if you click on one, click the jar at the top, the topest top 
then click the other one and click on jar at the top and download 
then go to C drive and create a folder JUnitWorkSpace or whatever you want to call it 
then you want to drag what downloaded into this folder 

tutorialspoint.com
they walk you through for what to do 

go to systems propoerties 
edit system variables
then click on new 
variable JUNIT_HOME
Variable value: put what you did on c, whatever you called your folder C:\JUnitWorkSpace

classpath variable
depends on if we have one or not 
when you're typing it in, you need to put a dash -  in because the file name has a dash 

shes having trouble with something she says is "handpressed"? hampress? 
shes googling 

first thing we did was we created 2 new variables 
JUNIT_HOME
then another one for HANCREST_HOME 
and set the value to both as C:\JUnitWorkSpace

then in your class path you want this 
%CLASSPATH%;%JUNIT_HOME%\junit-4.12.jar;.;
%CLASSPATH%;%HAMCREST_HOME%\hamcrest-core-1.3.jar;.; 
(i took a picture of this just in case )

the sample is the 2 that we got from the website
there's usually 3 files in testing but we'll work with 2 
the usual test grouping: test code, test case, and test runner 
we have a test case and test runner 

test driven development next time 
based on the requirements given to you, and what the results should be and you code accordingly
we're going to be working backwards so we get a feeling of testing 
its going to be hard 