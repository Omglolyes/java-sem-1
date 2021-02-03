# VL12 - Polymorphie

## Aufgabe 1

```java
class A {
    protected int x;
    protected int y;
    protected static int z;

    public A() {
        x++;
        y++;
        z++;
    }

    public void addiere(int x) {
        this.x = this.x + x;
        this.y = this.y + 2 * x;
        z = z + x; // Zeitpunkt a
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(z);
    }
}
```

```java
class B extends A {
    protected int x;

    public B() {
        x++;
        y++;
        z++;
    }

    public void addiere(int x) {
        this.x = this.x + x;
        super.x = super.x + 2 * x;
        this.y = this.y + 3 * x;
        super.y = super.y + 4 * x;
        z = z + x; // Zeitpunkt b
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
        System.out.println(this.y);
        System.out.println(super.y);
        System.out.println(z);
    }
}
```

```java
class Haupt {
    public static void main(String[] args) {
        A einA = new A();
        einA.addiere(10);
        B einB = new B();
        einB.addiere(20);
    }
}
```

Ausgabe:

`10 11 21 11 20 21 41 142 142 33`

## Aufgabe 2

B kann nicht private aufrufen

C kann weder private noch package (~) aufrufen (demo.tools)
