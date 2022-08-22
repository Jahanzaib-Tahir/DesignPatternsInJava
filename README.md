# DesignPatternsInJava
Design Patterns with code example and explanation in java

# Factory Design Pattern 
According to Wikipedia, "a factory is simply an object that returns another object from some other method call, which is assumed to be "new".

Factory pattern is comes under creational patterns, and it is one of the most used design patterns in Java.
Example:
In the example for "FactoryPattern" there is an interface "Food" in the interfaces package.
There are three classes Pizza, Burger and Cake which implement the Food interface,
and they both contain a method getFood() which is basically override from Food interface.
There is a FoodFactory class under factory package which method getFood(String) that returns a new instance of Pizza,Cake or Burger according to its parameter.
The main function is in the FactoryPattern Class which demonstrate the working of Factory Design Pattern.
