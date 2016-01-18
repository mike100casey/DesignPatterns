---
title: Composite
package: st_composite
categories: Structural

---

**Intent:** Compose objects into tree structures to represent part-whole
hierarchies. Composite lets clients treat individual objects and compositions
of objects uniformly.  
 
![alt text](https://github.com/mike100casey/DesignPatterns/blob/master/img/Composite.PNG?raw=true)

**Applicability:** Use the Composite pattern when:
 
* you want to represent part-whole hierarchies of objects
* you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the st_composite structure uniformly

**Examples:**

* In this example we have sentences composed of words composed of letters. All of the objects can
* be treated through the same interface.
