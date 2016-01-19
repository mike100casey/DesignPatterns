---
title: Observer
package: observer
categories: Behavioral

---

**Also known as:** Publish-Subscribe

**Intent:** Define a one-to-many dependency between objects so that when one
object changes state_after, all its dependents are notified and updated
automatically.

![alt text](https://github.com/mike100casey/DesignPatterns/blob/master/img/Observer.PNG?raw=true)

**Applicability:** Use the Observer pattern in any of the following situations

* when an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently
* when a change to one object requires changing others, and you don't know how many objects need to be changed
* when an object should be able to notify other objects without making assumptions about who these objects are.
