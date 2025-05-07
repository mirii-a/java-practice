# java-practice

## Exercise 1 - Cat

Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default
constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.

Instead, I have created a controller to add cats to the cat cache, and then an endpoint to return cats as well. Example:

```text
http://localhost:8080/api/v1/cats/add
```

```json
{
    "name": "muffin",
    "age": 3
}
```