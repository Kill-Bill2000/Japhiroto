-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2019 at 06:27 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `japhiroto`
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
-- Table structure for table `artikel`
--

CREATE TABLE `artikel` (
  `artikelNr` int(16) NOT NULL,
  `bezeichnung` varchar(64) COLLATE utf8_german2_ci NOT NULL,
  `preis` double(9,2) NOT NULL,
  `bestand` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_german2_ci;

--
-- Dumping data for table `artikel`
--

INSERT INTO `artikel` (`artikelNr`, `bezeichnung`, `preis`, `bestand`) VALUES
(1, 'Testartikel1', 9.99, 10),
(2, 'Testartikel2', 4.49, 1),
(3, 'Testartikel3', 29.99, 59);

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
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`accountId`);

--
-- Indexes for table `artikel`
--
ALTER TABLE `artikel`
  ADD PRIMARY KEY (`artikelNr`);

--
-- Indexes for table `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  ADD PRIMARY KEY (`mitarbeiterId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `accountId` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `artikel`
--
ALTER TABLE `artikel`
  MODIFY `artikelNr` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  MODIFY `mitarbeiterId` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
