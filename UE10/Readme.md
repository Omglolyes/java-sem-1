# VL10 – Assoziationen

## Aufgabe 1

### Wozu dienen Assoziationen?

Eine Assoziation stellt eine Beziehung zwischen zwei Klassen her.

### Was ist der Unterschied zwischen einer Kann- und einer Muss-Beziehung?

In einer kann Beziehung kann einem Objekt 0 oder mehrere Objekte zugeordnet sein.

In einer muss Beziehung muss einem Objekt mindestens 1 Objekt zugeordnet sein.

### Worin unterscheiden sich unidirektionale und bidirektionale Beziehungen?

Unidirekttional: Objekt einer Klasse kennt Objekte der assoziierten Klasse, diese wissen aber nicht, mit wem sie verbunden sind.

Bidirektional: Objekte der assoziierten Klassen kennen sich gegenseitig

## Aufgabe 2

### Wie kann mit Hilfe der Assoziationen festgestellt werden, ob zwei Mitarbeiter Kollegen sind? Beschreiben Sie umgangssprachlich einen Algorithmus für die Methode `isKollege`

Wenn getAbteilung(kollege1) == getAbteilung(kollege2), also beide Mitarbeiter derselben Abteilung zugewiesen sind, sind sie Kollegen.

### Wie können mit Hilfe der Assoziationen die Kollegen eines Mitarbeiters bestimmt werden? Beschreiben Sie umgangssprachlich einen Algorithmus für die Methode `bestimmeKollegen`

In der Methode `bestimmeKollegen` werden alle Kollegen, also Mitarbeiter derselben Abteilung zurückgegeben (vllt ausschließlich des Mitarbeiters, auf dem die Methode angewendet wird).
