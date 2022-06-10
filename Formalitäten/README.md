# Formalitäten

## Inhalt
1. [Fett, Kursiv, Unterstrichen](#6)
2. [Header & Footer](#1)
3. [Umlaue und besondere Buchstaben](#2)
4. [andere Sonderzeichen](#3)
5. [Seitenzahlen](#4)
6. [Fußnoten & Randbemerkungen](#5)

## Fett, Kursiv, Unterstrichen <a name="6"></a>

- Fett: `\textbf{...}`
- Kursiv: `\textit{...}`
- Unterstrichen: `\underline{...}`

Übung: Schreibe das Wort 'LaTex' fett, kursiv und unterstrichen

[Mehr Optionen/Informationen](https://de.overleaf.com/learn/latex/Bold%2C_italics_and_underlining)

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
