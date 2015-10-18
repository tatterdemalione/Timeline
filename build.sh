#!/bin/bash
#
# Script to Build Timeline.jar
#

echo "Checking for Java compiler..."
if [ `which javac` ]; then
	echo "yes."
else 
	echo "No Java Compiler"
	exit 1
fi

echo "Checking for jar maker..."
if [ `which jar` ]; then
	echo "yes."
else
	echo "no jar maker"
	exit 1
fi

#All good lets go.

#Compile..
javac Timeline/*.java
if [ $? == 1 ]; then
	echo "compile failed"; exit 1
fi

# Create Jar
jar cmf Manifest Timeline.jar Timeline 
if [ $? == 1 ]; then
	echo "Making of Jar failed."; exit 1
fi

echo
echo "All done run with 'java -jar Timeline.jar'"
