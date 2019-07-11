# Qa-software-testing
Download the Appium Software version 1.12.0  
Set up Java path as JAVA_HOME under system variable and sdk path as ANDROID_HOME under user variable  
After step (2) is done , go back to appium and under the desired capabilities , you can add the app's apk , deviceName , platformName and the appWaitActivity
Once you have recorded the app's activity , the scripts will be generated
Download IntelliJ version 2019.1.3 
Dependencies have to be downloaded so that the desired capabilities and other elements can be imported  
Thus , you have to download the java-client (jar file) ver. 5.0.0 , selenium client and webdriver language bindings (java) ver. 3.141.59 and the selenium standalone server ver. 3.141.59
Open a new project in intelliJ , add a lib file and move it to the src folder . Under the lib folder you can place all of the dependencies and add as global library 
Place the script in a new Java class under the src folder and import the elements so that it can run successfully 
