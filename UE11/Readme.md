# VL11 – Vererbung

## Aufgabe 1

### Verdeutlichen Sie an diesem Beispiel die Begriffe Oberklasse, Unterklasse, Einfachvererbung, Mehrfachvererbung, abstrakte Klasse, Verdecken, Verbergen und Überschreiben

- Oberklasse: Eine Oberklasse bezeichnet eine Klasse von der andere Klassen erben und somit Methoden und bestimmte attribute vererben. In dem UML ist `GObjekt` eine Oberklasse von den beiden anderen.

- Unterklasse: Eine Unterklasse bezeichnet widerum die Klasse die von einer übergeordneten Klasse erbt. In dem UML sind das `GRechteck` und `GEllipse`

- Einfachvererbung: Eine Klasse vererbt von einer einzigen anderen Klasse, sodass eine Klassenhirarchie entsteht. In dem UML ist dies stets der Fall.

- Mehrfachvererbung: Eine Klasse erbt von mehr als einer anderen Klasse. In dem UML nicht der Fall.

- Abstrakte Klasse: Eine vererbbare Klasse. Eine Klasse muss abstract sein wenn min eine Methode abstract ist. Von abstrakten Klassen können keine Objekte erzeugt werden.

- Verdecken: Wenn in einer Unterklasse eine variable mit einem selben namen deklariert wird, wird die von der Oberklasse verdeckt. So sind die variablen `x` und `super.x` vom Namen nicht eindeutig

- Verbergen: Eine in einer Unterklasse überschriebene Methode verbirgt die entsprechende Methode der Oberklasse

- Überschreiben: erleichtert es den Unterklassen, das Verhalten einer bestehenden Klasse zu erweitern

```java
class A // nicht public
{
    private String name;
    public A(String name)
    {
        this.name = name;
    }
}
```

```java
class B extends A
{
    private B(String name) // public B(String name)
    {
        super.name = name; // zugriff auf privates attribut
    }
}
```

```java
class C extends A{}
```

```java
class Haupt
{
    public static void main(String[] args)
    {
        A einA = new A("Hugo");
        B einB = new B("Paul");
        // C einC = new C();
        // This goes not
    }
}
```
