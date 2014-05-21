#!/bin/sh

javac -classpath /usr/share/java/junit4-4.11.jar /home/cola/javatraining/suda_animal/src/*.java
java -cp $PWD:/usr/share/java/junit4-4.11.jar org.junit.runner.JUnitCore src.active_test

