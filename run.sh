#!/bin/sh
gradle build 
cd build/libs
java -jar SE_Aufgabe_13.jar
cd ../..