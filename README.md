# Lambdas

## Level one:

### Task one:

**Goal**: Filter a list of strings that start with a specific letter using lambda functions.

run:

```bash
java src/main/java/levelone/TaskOne.java
```

___

### Task two:

**Goal**: Filter a list of strings that contain a specific letter and has a greater length than the provided one using
lambda functions.

run:

```bash
java src/main/java/levelone/TaskTwo.java
```

___

### Task three:

**Goal**: Print the contents of a string list using a lambda function.

run:

```bash
java src/main/java/levelone/TaskThree.java
```

___

### Task four:

**Goal**: Print the contents of a string list using method reference.

run:

```bash
java src/main/java/levelone/TaskFour.java
```

___

### Task five:

#### Functional interfaces

**Goal**: create a functional interface with a getPiValue method, instantiate it and execute the method in order to get
the return value of the instantiation.
**Bonus**: create a lambda function that implements the functional interface. Created another functional interface
called CalculateCircleArea and implemented it using a lambda function in an array map to print all the areas of radius
contained in the array .
Conclusion: Both functional interfaces are pretty much identical, the only difference is the semantics given by the
Interface name and the method's name.

run:

```bash
java src/main/java/levelone/TaskFive.java
```

___

### Task six:

**Goal**: Use lambda functions to sort a list of strings by their lengths in ascending order.

run:

```bash
java src/main/java/levelone/TaskSix.java
```

___

### Task seven:

**Goal**: Use lambda functions to sort a list of strings by their lengths in descending order.

run:

```bash
java src/main/java/levelone/TaskSeven.java
```

___

### Task eight:

**Goal**:

1. Create a functional interface that has a method that receives a string and returns a string.
2. Create a lambda function that receives a string and returns the string in reverse order.
3. Apply the function to a string and print the result.

run:

```bash
java src/main/java/levelone/TaskEight.java
```

___

## Level two:

### Task one:

**Goal**: Filter a list of strings returning only those that start with a specific character (case sensitive), and have
a specific length.

run:

```bash
java src/main/java/leveltwo/TaskOne.java
```

___

### Task two:

**Goal** Use lambda functions to process numbers and react to them based on their value.
**Approach**

1. Implemented a standard utils functional interface `IntFuction<String>` to apply the requested logic, that is if a
   number is even return e+number else return o+number.
2. Mapped the numbers to create a new lists of strings and returned them joined with the String.join method.

run:

```bash
java src/main/java/leveltwo/TaskTwo.java
```

___

### Task three:

**Goal**: create a functional interface with a method operate that takes and returns floats, implement 4 methods in a
Calculator class and use them to calculate the sum, subtraction, multiplication and division of two numbers.

run:

```bash 
java src/main/java/leveltwo/TaskThree.java
```

___

### Task four:

**Goal**: apply different operations to a list of strings using lambda functions.

1. Sort a list of strings by the numeric value of the first character.
2. Sort the same list by grouping first the strings that contains a specific character.
3. Replace al the letters 'a' with '4' in all the strings in the list.
4. Filter the strings that can be cast into Numbers, eg. "123", "123.4", "1.2f", "1.2L" and print them.
   - To do this I used the `apache-commons-lang3` library to check if the string is a number.

run:

```bash
java src/main/java/leveltwo/TaskFour.java
```


