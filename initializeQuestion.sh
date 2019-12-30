#!/bin/bash
touch src/main/inputs/$1.txt
touch src/main/java/org/muzir/codechef/practice/beginner/$1.java
touch src/test/java/org/muzir/codechef/practice/beginner/$1Test.java
chmod 744 src/main/java/org/muzir/codechef/practice/beginner/$1.java
chmod 744 src/test/java/org/muzir/codechef/practice/beginner/$1Test.java
chmod 744 src/main/inputs/$1.txt
echo "package org.muzir.codechef.practice.beginner;import java.io.*;import java.util.Arrays;public class $1 {}" > src/main/java/org/muzir/codechef/practice/beginner/$1.java
echo "package org.muzir.codechef.practice.beginner;import org.junit.Test;public class $1Test {@Test public void test(){}}" > src/test/java/org/muzir/codechef/practice/beginner/$1Test.java
echo $1
