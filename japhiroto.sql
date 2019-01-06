-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Erstellungszeit: 06. Jan 2019 um 19:35
-- Server-Version: 10.1.31-MariaDB
-- PHP-Version: 7.2.3

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

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `accountId` int(16) NOT NULL,
  `mitarbeiterId` int(16) NOT NULL,
  `benutzername` varchar(32) COLLATE latin1_german1_ci NOT NULL,
  `passwort` varchar(32) COLLATE latin1_german1_ci NOT NULL,
  `rolle` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`accountId`, `mitarbeiterId`, `benutzername`, `passwort`, `rolle`) VALUES
(1, 1, 'm.mustermann.leiter', 'muster123', 0),
(2, 1, 'm.mustermann.kasse', 'muster123', 1),
(3, 1, 'm.mustermann.lager', 'muster123', 2);

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `accountId` int(16) NOT NULL,
  `mitarbeiterId` int(16) NOT NULL,
  `benutzername` varchar(32) COLLATE latin1_german1_ci NOT NULL,
  `passwort` varchar(32) COLLATE latin1_german1_ci NOT NULL,
  `rolle` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`accountId`, `mitarbeiterId`, `benutzername`, `passwort`, `rolle`) VALUES
(1, 1, 'm.mustermann.leiter', 'muster123', 0),
(2, 1, 'm.mustermann.kasse', 'muster123', 1),
(3, 1, 'm.mustermann.lager', 'muster123', 2);

-- --------------------------------------------------------

--
-- Table structure for table `artikel`
--

CREATE TABLE `artikel` (
  `artikelNr` int(16) NOT NULL,
  `artikelNummer` char(32) COLLATE utf8_german2_ci NOT NULL,
  `bezeichnung` varchar(64) COLLATE utf8_german2_ci NOT NULL,
  `preis` double(9,2) NOT NULL,
  `bestand` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_german2_ci;

--
-- Dumping data for table `artikel`
--

INSERT INTO `artikel` (`artikelNr`, `artikelNummer`, `bezeichnung`, `preis`, `bestand`) VALUES
(1, '1', 'Testartikel1', 9.99, 10),
(2, '2', 'Testartikel2', 4.49, 1),
(3, '3', 'Testartikel3', 29.99, 59),
(4, '9006900014773', 'Pfanner Roter Tee Zitrone Granatapfel 2L', 1.99, 10),
(5, '4006613002932', 'Hello Kitty Adventskalender', 4.99, 25);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bestellteartikel`
--

CREATE TABLE `bestellteartikel` (
  `bestellID` char(32) NOT NULL,
  `artikelID` char(32) NOT NULL,
  `anzahl` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `bestellteartikel`
--

INSERT INTO `bestellteartikel` (`bestellID`, `artikelID`, `anzahl`) VALUES
('123456789', '4006613002932', 2),
('123456789', '9006900014773', 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bestellung`
--

CREATE TABLE `bestellung` (
  `bestellNummer` char(32) NOT NULL,
  `lieferant` char(64) NOT NULL,
  `erledigt` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `bestellung`
--

INSERT INTO `bestellung` (`bestellNummer`, `lieferant`, `erledigt`) VALUES
('123456789', 'Obst und Gemüse GmbH', 0);

-- --------------------------------------------------------

--
-- Table structure for table `mitarbeiter`
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
-- Dumping data for table `mitarbeiter`
--

INSERT INTO `mitarbeiter` (`mitarbeiterId`, `anrede`, `vorname`, `nachname`, `strasse`, `hausNr`, `plz`, `ort`, `stundenLohn`) VALUES
(1, 'Herr', 'Max', 'Mustermann', 'Musterstrasse', 1, 12345, 'Musterstadt', 8.50),
(2, 'Frau', 'Maxia', 'Musterfrau', 'Mustergasse', 2, 67890, 'ZweiteMusterstadt', 5.80),
(3, 'Dive', 'Maxia*innen', 'Musterfrau*innen', 'Mustergasse*innen', 61, 7531459, 'ZweiteMusterstadt*innen', 0.01);

--
-- Table structure for table `mitarbeiter`
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
-- Dumping data for table `mitarbeiter`
--

INSERT INTO `mitarbeiter` (`mitarbeiterId`, `anrede`, `vorname`, `nachname`, `strasse`, `hausNr`, `plz`, `ort`, `stundenLohn`) VALUES
(1, 'Herr', 'Max', 'Mustermann', 'Musterstrasse', 1, 12345, 'Musterstadt', 8.50),
(2, 'Frau', 'Maxia', 'Musterfrau', 'Mustergasse', 2, 67890, 'ZweiteMusterstadt', 5.80),
(3, 'Dive', 'Maxia*innen', 'Musterfrau*innen', 'Mustergasse*innen', 61, 7531459, 'ZweiteMusterstadt*innen', 0.01);

--
-- Indexes for dumped tables
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
  ADD PRIMARY KEY (`artikelNr`,`artikelNummer`);
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`accountId`);

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

-- AUTO_INCREMENT für Tabelle `artikel`
--
ALTER TABLE `artikel`
  MODIFY `artikelNr` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

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
