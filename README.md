# Lab: 08 - OO Design and GSON

## description 

This app reads from a local json file and returns random data form it on each run, it uses the GSON library for parsing json and a buffer reader to print the data on the terminal.


## Configuration 

Java doesn't have it's own built-in JSON parser. We need to add a dependency on one Google built called GSON. Add this to your project dependencies in build.gradle.


 **dependencies {<br>
 compile 'com.google.code.gson:gson:2.8.2'<br>
}<br>**

Then refresh gradle build.