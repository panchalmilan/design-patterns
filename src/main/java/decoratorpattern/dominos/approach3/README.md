When you add Olive on to something, it should be of _Pizza Type_. <br/>
And _return type_ after addition is Pizza type.

To summarize:
```java
    Pizza newPizza = new OliveTopping(pizza)
```
![Screenshot 2024-11-09 at 7.36.33 PM.png](imgs%2FScreenshot%202024-11-09%20at%207.36.33%E2%80%AFPM.png)
<br/>

So, OliveTopping has **super type of Pizza**
* Here Pizza will be abstract class/interface
* OliveTopping will be concrete class implemented against Pizza

---
Key thing here to understand is:
* OliveTopping takes pizza instance (i.e. of type Pizza)<br/>
* Then **decorates** it will olive (Toppings)<br/>
* Then returns the **same** type i.e. Pizza

![Screenshot 2024-11-09 at 7.36.33 PM.png](imgs%2FScreenshot%202024-11-09%20at%207.36.33%E2%80%AFPM.png)


---

```java
    Pizza pizza = new OnionTopping(
            new OliveTopping(
                    new WheatBasePizza()
            )
        );
```

<br/>
<br/>


### Decorator Pattern
![Screenshot 2024-11-09 at 7.48.29 PM.png](imgs%2FScreenshot%202024-11-09%20at%207.48.29%E2%80%AFPM.png)