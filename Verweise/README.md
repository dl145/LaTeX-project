# Verweise

Man benutzt Verweise, um automatisiert auf bereits geschriebene Kapitel zu verweisen.

Vorteil: Die Verweise sind automatisch geändert, wenn sich z.B. Kapitelzahlen ändern

## Vorgehensweise

1. Im Kapitel, auf das Verwiesen werden soll schreibst du nach dem Befehl `\section{xy}` `\label{sec:xy}`

2. An der Stelle im Text, wo auf das entsprechende Kapitel verwiesen werden soll, schreibst du `\ref{sec:xy}`

## Bennenung der Verweise

Es bietet sich an, die Verweisnamen passend zu wählen (z.B. sec: section + Kurzform des Kapitelnamen), um bei vielen Verweisen in einem großen Dokument eine Übersicht zu behalten
