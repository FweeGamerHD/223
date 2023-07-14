# Coworking Space Webapplikation

Diese Webapplikation ermöglicht die Verwaltung eines Coworking Spaces, einschliesslich der Buchung von Arbeitsplätzen und der Benutzerverwaltung.

## Projekt-Setup

Um das Projekt aufzusetzen, führen Sie die folgenden Schritte aus:

1. Klone das Repository auf deinen lokalen Computer.

2. Stelle sicher, dass die erforderlichen Abhängigkeiten installiert sind. Führen Sie `npm install` aus, um die erforderlichen Node.js-Module zu installieren.

3. Konfiguriere die Datenbankverbindung in der Datei `application.properties`. Stelle sicher, dass der Datenbank-URL, der Benutzername und das Passwort korrekt sind.

4. Führe die Datenbankmigrationen aus, um die erforderlichen Tabellen zu erstellen. Verwende das Kommando `./mvnw flyway:migrate` (für Maven) oder `./gradlew flywayMigrate` (für Gradle).

## Projektstart

Um das Projekt zu starten, führen Sie die folgenden Schritte aus:

1. Starte den Spring Boot-Server mit dem Kommando `./mvnw spring-boot:run` (für Maven) oder `./gradlew bootRun` (für Gradle).

2. Öffne einen Webbrowser und navigiere zur URL `http://localhost:8080`. Die Anwendung sollte nun geladen und einsatzbereit sein.

## Laden von Testdaten

Um Testdaten zu laden, befolgen Sie diese Schritte:

1. Navigiere zum Verzeichnis `src/test/resources` im Projekt.

2. Öffne die Datei `testdata.sql` und füge deine gewünschten Testdaten hinzu.

3. Führe die Datenbankmigrationen erneut aus, um die Testdaten zu laden. Verwende das Kommando `./mvnw flyway:migrate` (für Maven) oder `./gradlew flywayMigrate` (für Gradle).

Bitte beachten Sie, dass das Laden von Testdaten optional ist und Sie diese Schritte überspringen können, wenn Sie keine Testdaten benötigen.

