#!/bin/bash
touch src/main/inputs/$1.txt
touch src/main/java/org/muzir/codechef/practice/beginner/$1.java
touch src/test/java/org/muzir/codechef/practice/beginner/$1Test.java
chmod 744 src/main/java/org/muzir/codechef/practice/beginner/$1.java
chmod 744 src/test/java/org/muzir/codechef/practice/beginner/$1Test.java
chmod 744 src/main/inputs/$1.txt
echo $1
