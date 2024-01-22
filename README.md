# Design-Patterns
This Repository consists of design pattern implemented with reference to a online Course(Coursera)  "Design Patterns by University of Alberta"
I completed the "Design Patterns" course offered by the University of Alberta on Coursera under Software Design and Architecture Specialization. This course covered a wide array of design patterns commonly used in software development.
## Course Overview
- **Provider**: Coursera
- **University**: University of Alberta
- **Course Name**: Design Patterns
## Course Experience
The course provided a comprehensive understanding of various design patterns used in software engineering. It covered creational, structural, and behavioral design patterns. Throughout the course, I learned about:
####  Creational design patterns
- Singleton
- Factory method Pattern
- Builder Pattern
- Prototype Pattern
####  Structural design patterns
- Facade Pattern
- Adapter Pattern
- Composite Pattern
- Proxy Pattern
####  Behavioral design patterns
- Template Method Pattern
- Chain of Responsibility Pattern
- State Pattern
- Command Pattern
- Observer Pattern
#### MVC architecture
#### Design Principles Underlying Design Patterns(SOLID)
- **Single-Responsibility Principle**
  - A class should have one and only one reason to change, meaning that a class should have only one job.
- **Open/Closed Principle**
    - Classes should be open for extension but closed for change
      - we can use inheritance in **classes** by creating subclasses which can extend the feature.
      - if the class is **abstract** we can use open close principle through Polymorphism
      - The Open/Closed Principle is used to keep the stable parts of your system separate from the varying parts. Well, you want to be able to add more features to your system. You don't want to do it at the expense of disrupting something that works. By using extension over change, you can work on the varying parts without introducing unwanted side effects into the stable parts.
- **Liskov's substitution principle**
  - If a class, S, is a subtype of a class, B, then S can be used to replace all instances of B without changing the behaviors of a program.
- **Interface Segregation Principle** 
  - The interface segregation principle states that a class should not be forced to depend on methods it does not use. This means that any classes that implement an interface should not have dummy implementations of any methods defined in the interface. Instead, you should split large interfaces into smaller generalizations.
- **Dependency Inversion Principle**
  - The principle states that high level modules should depend on high level generalizations and not on low level details.
    - Software Dependency means degree Coupling
    - We use the dependency inversion principle to make our systems more robust and flexible.
    - Client classes should depend on interfaces or Abstract class(considered as high level Generalization) not on concrete classes(low level concrete classes)
- **Composing Objects Principle**
  -  This principle states that classes should achieve code reuse through aggregation rather than inheritance.
        - Composite and Decorator design pattern use this principle
        - The composing objects principle will provide a means of code reuse without the tight coupling of inheritance.
        - Allow objects to dynamically add behaviors at run time.
        - Provide your system with more flexibility.
        - **_The biggest drawback of composition is that you must provide implementations for all behavior without the benefit of inheritance to share code. This means that you night have very similar implementations across classes. With inheritance, you don't need to provide each subclass with their own implementation of a shared behavior. The common implementation is simply accessed within the super class. Needing to provide implementations for every class means that it will take time and resources. A programmer working on providing multiple implementations of the same behaviors means you'll have one less programmer working on other features._** 
- **Principle of Least Knowledge**
  - This principle is also realized in a rule known as The Law of Demeter. The underlying idea of this law is that classes should know about and interact with as few other classes as possible. This means that any class should only communicate with its immediate friends. These friends would be other classes that one class should only know about.
  - **Rules**
    - A method, M, in an object, O, can call on any other method within O itself.
    - A method, M, can call the methods of any parameter, P. 
    - A method, M, can call a method, N, of an object, I, if I is instantiated within M.
    - A method, M, in object, O, can invoke methods of any type of object that is a direct component of O.
  - Returned objects must be of the same type as: 
    - those declared in the method parameter.
    - those declared and instantiated locally in the method.
    - those declared in instance variables of the class that encapsulates the method.
  - According to this design principle, a method, M, of an object should only call other methods if they are: 
    - Encapsulated within the same object
    - Encapsulated within an object that is in the parameters of M
    - Encapsulated within an object that is instantiated inside M,
    - Encapsulated within an object that is reference in an instance variable of the class for M.

#### Code smells
- Comments
- Duplicate Codes
- Long Method
- Large Class
- Data Classes
- Data Clumps (using same set of parameter over and over again instead we can pass a object)
- Long Parameter list
- Divergent Change (The divergent change code smells occur when you have to change a class in many different ways for many different reason.)
- Shotgun Surgery (change in one place require many place to change)
- Feature Envy (Feature envy occurs when you've got a method that is more interested in the details of a class other than the one that it's in.)
- Inappropriate intimacy 
- Message Chain (Violate the law of Demeter)
- Primitive Obsession (Rely mostly on build In types)
- Switch statements (use polymorphism)
- Speculative Generality (Creating classes thinking that it may be useful in future)
- Refused bequest (having methods in a class that are not needed)

## Implementation in Java
While completing the course, I implemented the design patterns using Java. The implementations are available in my repository.
