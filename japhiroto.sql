-- phpMyAdmin SQL Dump
-- version 4.6.6deb4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Erstellungszeit: 06. Jan 2019 um 19:26
-- Server-Version: 10.1.23-MariaDB-9+deb9u1
-- PHP-Version: 7.0.33-0+deb9u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `test`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `artikel`
--

CREATE TABLE `artikel` (
  `artikelNr` int(16) NOT NULL,
  `artikelNummer` char(32) COLLATE utf8_german2_ci NOT NULL,
  `bezeichnung` varchar(64) COLLATE utf8_german2_ci NOT NULL,
  `preis` double(9,2) NOT NULL,
  `bestand` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_german2_ci;

--
-- Daten für Tabelle `artikel`
--

INSERT INTO `artikel` (`artikelNr`, `artikelNummer`, `bezeichnung`, `preis`, `bestand`) VALUES
(1, '1', 'Testartikel1', 9.99, 10),
(2, '2', 'Testartikel2', 4.49, 1),
(3, '3', 'Testartikel3', 29.99, 59),
(4, '9006900014773', 'Pfanner Roter Tee Zitrone Granatapfel 2L', 1.99, 10),
(5, '4006613002932', 'Hello Kitty Adventskalender', 4.99, 25);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `artikel`
--
ALTER TABLE `artikel`
  ADD PRIMARY KEY (`artikelNr`,`artikelNummer`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `artikel`
--
ALTER TABLE `artikel`
  MODIFY `artikelNr` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
