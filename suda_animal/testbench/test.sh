#!/bin/sh

javac -classpath /usr/share/java/junit4-4.8.2.jar suda_animal/src/*.java
java -cp $PWD:/usr/share/java/junit4-4.8.2.jar org.junit.runner.JUnitCore src.active_test

