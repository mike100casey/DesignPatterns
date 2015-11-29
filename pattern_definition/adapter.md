---
title: Adapter
package: adapter
categories: Structural

---

![alt text](https://github.com/mike100casey/DesignPatterns/blob/master/img/Adapter.PNG?raw=true)

**Also known as:** Wrapper

**Intent:** Convert the interface of a class into another interface the clients
expect. Adapter lets classes work together that couldn't otherwise because of
incompatible interfaces.

**Applicability:** Use the Adapter pattern when

* you want to use an existing class, and its interface does not match the one you need
* you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
* you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one.