---
title: Factory Method
package: factory-method
categories: Creational

---

**Also known as:** Virtual Constructor

**Intent:** Define an interface for creating an object, but let subclasses
decide which class to instantiate. Factory Method lets a class defer
instantiation to subclasses.

![alt text](https://github.com/mike100casey/DesignPatterns/blob/master/img/Factory.PNG?raw=true)

**Applicability:** Use the Factory Method pattern when

* a class can't anticipate the class of objects it must create
* a class wants its subclasses to specify the objects it creates