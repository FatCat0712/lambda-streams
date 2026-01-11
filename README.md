# Stream In Java

## Stream API is used to process collections of objects
A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels

Streams don't change the original data structure, they only provide the result as per the pipelined methods

## Why we need stream ?
Functional Programming
Code Reduce
Bulk Operation

## Methods:
Filter - for conditional check <br/>
forEach - for iteration

### Map() & flatMap()
Java 8 Stream API provides map() and flatMap() method. Both these methods are intermediate methods and returns another
stream as part of the output

map() method used for transformation

flatMap() used for transformation & flattering

flatMap() -> map() + flattering

#### map() method -> Data Transformation

map() takes Stream\<T> as input and return Stream\<R>

Stream\<R> map(Stream\<T> input) {} <br/>
\<R>Stream\<R> map(Function<? super T, ? extends R> mapper);

It's mapper function produces single value for each input value. hence it is also called One-To-One mapping

#### flatMap() method -> map() + Flattering

flatMap() takes Stream<Stream\<T>> as input and return Stream\<R>

Stream\<R> flatMap(Stream<Stream\<T>> input) {}

It's a mapper function produces multiple value for each input value. hence it is also called One-To-Many mapping

Differences between Java 8 Map() Vs flatMap() :

map() | flatMap() | 
--- | --- |  
It processes stream of values. | It processes stream of stream of values. 
It does only mapping. | It performs mapping as well as flattening.
It’s mapper function produces single value for each input value. | It’s mapper function produces multiple values for each input value. 
It is a One-To-One mapping. | It is a One-To-Many mapping. 
Data Transformation : From Stream\<T> to Stream\<R> | Data Transformation : From Stream<Stream\<T> to Stream\<R> 
Use this method when the mapper function is producing a single value for each input value. | Use this method when the mapper function is producing multiple values for each input value. 





