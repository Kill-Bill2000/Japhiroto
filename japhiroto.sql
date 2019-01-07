-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 05. Jan 2019 um 19:29
-- Server-Version: 10.1.37-MariaDB
-- PHP-Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `japhiroto`
--
CREATE DATABASE IF NOT EXISTS `japhiroto` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `japhiroto`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `accounts`
--

CREATE TABLE `accounts` (
  `accountId` int(16) NOT NULL,
  `mitarbeiterId` int(16) NOT NULL,
  `benutzername` varchar(32) COLLATE latin1_german1_ci NOT NULL,
  `passwort` varchar(32) COLLATE latin1_german1_ci NOT NULL,
  `rolle` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;

--
-- Daten für Tabelle `accounts`
--

INSERT INTO `accounts` (`accountId`, `mitarbeiterId`, `benutzername`, `passwort`, `rolle`) VALUES
(1, 1, 'm.mustermann.leiter', 'muster123', 0),
(2, 1, 'm.mustermann.kasse', 'muster123', 1),
(3, 1, 'm.mustermann.lager', 'muster123', 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `artikel`
--

CREATE TABLE `artikel` (
  `artikelNummer` char(32) NOT NULL,
  `artikelName` char(64) NOT NULL,
  `verkaufPreis` double NOT NULL,
  `bestand` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `artikel`
--

INSERT INTO `artikel` (`artikelNummer`, `artikelName`, `verkaufPreis`, `bestand`) VALUES
('9006900014773', 'Pfanner Roter Tee Zitrone Granatapfel 2L', 1.99, 10);
INSERT INTO `artikel` (`artikelNummer`, `artikelName`, `verkaufPreis`, `bestand`) VALUES
('457842','Coca Cola 1L',0.65,25);
INSERT INTO `artikel` (`artikelNummer`, `artikelName`, `verkaufPreis`, `bestand`) VALUES
('789456','Jack Daniels Whiskey 0,75L',19.95,8);
INSERT INTO `artikel` (`artikelNummer`, `artikelName`, `verkaufPreis`, `bestand`) VALUES
('531874','Nutella 2,5KG',14.99,100);

-- --------------------------------------------------------
--
-- Tabellenstruktur für Tabelle `umsatz`
--

CREATE TABLE `umsatz` (
  `umsatzNr` int NOT NULL,
  `zeitstempel` timestamp NOT NULL,
  `umsatz` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `artikel`
--

INSERT INTO `umsatz` (`umsatzNr`, `zeitstempel`, `umsatz`) VALUES
('0','2019-01-07 01:05:00','1.00');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bestellteartikel`
--

CREATE TABLE `bestellteartikel` (
  `bestellID` int(10) NOT NULL,
  `artikelID` int(10) NOT NULL,
  `anzahl` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bestellung`
--

CREATE TABLE `bestellung` (
  `bestellNummer` char(32) NOT NULL,
  `lieferant` char(64) NOT NULL,
  `erledigt` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `mitarbeiter`
--

CREATE TABLE `mitarbeiter` (
  `mitarbeiterId` int(16) NOT NULL,
  `anrede` varchar(4) COLLATE latin1_german1_ci DEFAULT NULL,
  `vorname` varchar(32) COLLATE latin1_german1_ci NOT NULL,
  `nachname` varchar(32) COLLATE latin1_german1_ci NOT NULL,
  `strasse` varchar(32) COLLATE latin1_german1_ci DEFAULT NULL,
  `hausNr` int(8) DEFAULT NULL,
  `plz` int(5) DEFAULT NULL,
  `ort` varchar(61) COLLATE latin1_german1_ci DEFAULT NULL,
  `stundenLohn` double(9,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;

--
-- Daten für Tabelle `mitarbeiter`
--

INSERT INTO `mitarbeiter` (`mitarbeiterId`, `anrede`, `vorname`, `nachname`, `strasse`, `hausNr`, `plz`, `ort`, `stundenLohn`) VALUES
(1, 'Herr', 'Max', 'Mustermann', 'Musterstrasse', 1, 12345, 'Musterstadt', 8.50),
(2, 'Frau', 'Maxia', 'Musterfrau', 'Mustergasse', 2, 67890, 'ZweiteMusterstadt', 5.80),
(3, 'Dive', 'Maxia*innen', 'Musterfrau*innen', 'Mustergasse*innen', 61, 7531459, 'ZweiteMusterstadt*innen', 0.01);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`accountId`);

--
-- Indizes für die Tabelle `artikel`
--
ALTER TABLE `artikel`
  ADD PRIMARY KEY (`artikelNummer`);

--
-- Indizes für die Tabelle `bestellteartikel`
--
ALTER TABLE `bestellteartikel`
  ADD PRIMARY KEY (`bestellID`,`artikelID`);

--
-- Indizes für die Tabelle `bestellung`
--
ALTER TABLE `bestellung`
  ADD PRIMARY KEY (`bestellNummer`);

--
-- Indizes für die Tabelle `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  ADD PRIMARY KEY (`mitarbeiterId`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `accounts`
--
ALTER TABLE `accounts`
  MODIFY `accountId` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  MODIFY `mitarbeiterId` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
