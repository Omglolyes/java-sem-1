# VL09 - OBJEKTE UND KLASSEN 2

## Aufgabe 1

### Was ist der Zweck des Geheimnisprinzips?

- 1. Schutz der Attribute vor "illegamlem" Zugriss
- 2. Attribute einer Klasse können anders dargestellt werden, ohne dass der Aufrufer einer Methode dies wissen muss+
- 3. Vermeidung von illegalen Zuständen eines Objekts.

### Was ist der Unterschied zwischen einem Objektattribut und einem Klassenattribut?

- Klassenattribute gelten für alle Objekte einer Klasse
- Klassenattribute werden im Stack gespeichert, während Objektattribute im Heap gespeichert werden.

### Worin besteht der Unterschied, wenn eine Methode innerhalb bzw. außerhalb derdeklarierenden Klasse aufgerufen wird?

- Möchte man von außen zugreifen, darf die Methode nicht private sein
- Möchte man von außen zugreifen, muss man den Objektnamen / Klassennamen nennen

### Worin besteht der Unterschied zwischen call by reference und call by value?

Call bei value beschreibt die Parameterübergabe in Form von Werten, während Call bei reference die Speicheradresse übergibt

## Aufgabe 2

### Welche Ausgabe erzeugen die Zeile 9 und 10? Begründen Sie Ihre Antwort

Ausgabe:

```text
false
true
```
