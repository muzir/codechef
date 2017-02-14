#!/bin/bash
cp ALTARAY.txt src/main/java/$1.txt
cp src/main/java/org/muzir/codechef/practice/beginner/ALTARAY.java  src/main/java/org/muzir/codechef/practice/beginner/$1.java
chmod 744 src/main/java/org/muzir/codechef/practice/beginner/$1.java
gedit src/main/java/org/muzir/codechef/practice/beginner/$1.java &
gedit src/main/java/$1.txt &
echo $1
