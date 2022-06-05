Literaturverzeichnis

1. Neues .bib File erstellen

2. In gleichem Ordner wie .tex File speichern (Passiert in Overleaf automatisch)

3. Quellen hinzufügen, dabei auf Art der Quelle achten (z.B. 'book', 'article', 'misc'). 
--> Unterschiedliche Quellenarten haben unterschiedliche Attribute (z.B. 'title', 'howpublished', 'journal'  'author')

4. In .tex. File auf der gewünschten Seite einbinden mit den Befehlen

\addcontentsline{toc}{section}{*Dateiname*}
\bibliography{*Dateiname*}
\bibliographystyle{plain}

-----------------------------------------------------------------------------------------------------------------------------------
Syntax + ausführliche Beschreibung: https://www.heise.de/tipps-tricks/LaTeX-Literaturverzeichnis-erstellen-so-klappt-s-4401420.html
-----------------------------------------------------------------------------------------------------------------------------------

Beispiel für einen Artikel, der im Lit.Verzeichnis steht:

@article{first, 
author={J. Brimberg and S. P. Ladany and W. J. Hurley},
title={Choosing a winning team for mixed medley events},
journal={Int. J. Operational Research},
volume={31},
pages={300 - 312},
year={2018}
}
