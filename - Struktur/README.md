# Struktur

Überdeckt sich teilweise mit dem Inhalt aus 'Mein_Erstes_LaTex_Dokument'.

## Inhalt

1. [(Unter)Kapitel](#1)
2. [Inhaltsverzeichnis](#2)
3. [Glossar](#3)
4. [Verlinkungen](#4)

## (Unter)Kapitel <a name="1"></a>

- normales Kapitel: `\section{...}`
- Unterkapitel: `\subsection{...}`
- Unterunterkapitel: `\subsubsection{...}`

Es gibt [weitere Unterteilungen](https://de.overleaf.com/learn/latex/Sections_and_chapters), die man verwenden kann. 

## Inhaltsverzeichnis <a name="2"></a>

- An der gewünschten Seite '\tabeleofcontents' schreiben. Anhand der benannten Kapitel (s. (Unter)Kapitel) wird das inhaltsverzeichnis automatisiert erstellt und ggf. erweitert.

[Mehr Optionen/Informationen](https://de.overleaf.com/learn/latex/Table_of_contents)

## Glossar <a name="3"></a>

Stichwörterverzeichnis

1. Paket einbinden mit `\usepackage{glossaries}`
2. An gewünschte Seite `\printglossaries` schreiben

Einträge in der Präambel reinschreiben.

1. Zuerst `\makeglossaries` schreiben
2. Beispiel für einen Eintrag:

```
\newglossaryentry{latex}
{
    name=latex,
    description={Is a markup language specially suited 
    for scientific documents}
}
```

[ausführliche Erklärung](https://de.overleaf.com/learn/latex/Glossaries)

## Verlinkungen <a name="4"></a>

Ermöglicht eine schnelle Navigation im PDF Dokument zu den Abschnitten.

- Paket mit `\usepackage{hyperref}` einbinden

Wenn du an Erweiterungen interessiert bist:
[Englisch](https://de.overleaf.com/learn/latex/Hyperlinks);
[Deutsch](https://www.namsu.de/Extra/pakete/Hyperref.html)

