# VL03 – Einfache Datentypen

## Aufgabe 1

### as ist der Unterschied zwischen einem unären Operator und einem binären Operator?

Ein unärer Operator nimmt als Argument einen Parameter, ein binärer zwei.

## Welche Werte enthalten die Variablen x,y und z nach Ausführung der folgenden Programmsequenz

```java
int x = 31;
int y = x>>4;
int z = y<<2;
```

Output

```java
31
1
4
```

## Aufgabe 2

### Wie lautet die Zweierkomplement-Darstellung der folgenden Dezimalzahlen

#### 20

> 0000010100<sub>2</sub>

#### -11

> 1111110101<sub>2</sub>

### Welche Dezimalzahl verbirgt sich in der Zweierkomplement-Darstellung hinter 1010111011<sub>2</sub>?

> 699

## Aufgabe 3

### Gegeben sei das folgende Java-Programm. Welche Werte gibt das Programm aus?

```java
public class PlusMinus {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(a++ + " " + --b);
    }
}
```

Output

```java
2
2
2
3
2 2
```

## Aufgabe 4

### Welche der folgenden Zuweisungen an die Variable y sind korrekt? Korrigieren Sie ggfs. durch explizite Typanpassung

```java
//a
int x = 13;   int y = x;  // korrekt

//b
int x = 0;    byte y = x; // byte muss int sein

//c
byte x = 0;   int y = x;  // korrekt

//d
int y = 3.1415;           // int muss double sein

//e
float y = 3.1415;         // float muss double, oder 3.1415 muss 3.1415f sein

//f
double y = 3.1415f;       // korrekt
```

## Aufgabe 5

### Welche Anweisungen erzeugen einen Compiler-Fehler? Setzen Sie fehlerhafte Anweisungen in Kommentar und erläutern Sie den Fehler

from: [UE03A5.java#17](./UE03A5.java#17): `System.out.println(""");`

from: [UE03A5.java#26](./UE03A5.java#26): `System.out.println(0xFG);`

from: [UE03A5.java#29](./UE03A5.java#29): `System.out.println("Zahl " + 0,344e-17f );`

### Welche Ausgabe/Wirkung haben die einzelnen Anweisungen? Dokumentieren Sie die Ausgabe/Wirkung der Zeile. Wie lässt sich die Ausgabe jeweils erklären

?
