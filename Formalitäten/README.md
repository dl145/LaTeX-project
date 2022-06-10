# Formalitäten

## Inhalt
1. [Header & Footer](#1)
2. [Umlaue und besondere Buchstaben](#2)
3. [andere Sonderzeichen](#3)
4. [Seitenzahlen](#4)
5. [Fußnoten & Randbemerkungen](#5)

## Header & Footer <a name="1"></a>
[Erklärung auf Englisch](https://de.overleaf.com/learn/latex/Headers_and_footers#Standard_page_styles)

## Umlaute und besondere Buchstaben <a name="2"></a>

LaTex erkennet die Umlaute ä, ö, ü oder das Zeichen ß nicht. Es gibt zwei Möglichkeiten, um sie verwenden zu können.

### Möglichkeit 1: Paket einbinden & Buchstaben normal verwenden 

Paketnamen: 

- Windows `\usepackage[ansinew]{inputenc}`
- Linux `\usepackage[latin1]{inputenc}`
- Mac `\usepackage[applemac]{inputenc}`

### Möglichkeit 2: Umlaute indirekt eingeben

ä - `\"a`; ö - `\"o`; ü - `\"u`; ß - `\ss`

## andere Sonderzeichen <a name="3"></a>

[Seite auf Deutsch](https://de.wikibooks.org/wiki/LaTeX-Kompendium:_Sonderzeichen)

## Seitenzahlen <a name="4"></a>

- es bieten sich verschiedene Möglichkeiten von Nummerierungen an
- oft werden z.B. Einleitungen/Vorworte separat gezählt

[Erklärung auf Englisch](https://de.overleaf.com/learn/latex/Page_numbering)

## Fußnoten & Randbemerkungen <a name="5"></a>

- Randnotizen: `\marginpar[*Position auf der Seite*]{*Notiz*}`
- Fußnoten: `\footnote{*Notiz*}`

weiterführende Erklärungen zu [Randnotizen](https://de.overleaf.com/learn/latex/Margin_notes); [Fußnoten](https://de.overleaf.com/learn/latex/Footnotes)
