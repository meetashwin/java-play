# Java-Play
Java repository for learning and practice

## LambdaPlay.java

A single method interface is also sometimes referred to as a functional interface. Matching a Java lambda expression against a functional interface is divided into these steps:

* Does the interface have only one abstract (unimplemented) method?
* Does the parameters of the lambda expression match the parameters of the single method?
* Does the return type of the lambda expression match the return type of the single method?

If the answer is yes to these three questions, then the given lambda expression is matched successfully against the interface.

## PredicatePlay.java

Java 8 Stream interface introduces filter() method which can be used to filter out some elements from object collection based on a particular condition. 
This condition should be specified as a predicate which the filter() method accepts as an argument.

The java.util.function.Predicate interface defines an abstract method named test() that accepts an object of generic type T and returns a boolean.

## SubArraySum.java

Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
