-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2016 at 05:31 PM
-- Server version: 10.1.8-MariaDB
-- PHP Version: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biglietteria_on_line`
--

-- --------------------------------------------------------

--
-- Table structure for table `biglietti`
--

CREATE TABLE `biglietti` (
  `COD_OPERAZIONE` int(6) NOT NULL,
  `COD_CLIENTE` varchar(4) DEFAULT NULL,
  `COD_REPLICA` varchar(4) DEFAULT NULL,
  `DATA_ORA` datetime DEFAULT NULL,
  `TIPO_PAGAMENTO` varchar(20) DEFAULT NULL,
  `QUANTITA` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `clienti`
--

CREATE TABLE `clienti` (
  `COD_CLIENTE` varchar(4) NOT NULL,
  `COGNOME` varchar(20) DEFAULT NULL,
  `NOME` varchar(20) DEFAULT NULL,
  `TELEFONO` varchar(14) DEFAULT NULL,
  `EMAIL` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clienti`
--

INSERT INTO `clienti` (`COD_CLIENTE`, `COGNOME`, `NOME`, `TELEFONO`, `EMAIL`) VALUES
('0001', 'Alfieri', 'Valeria', '011/4328346', 'alf@libero.it'),
('0002', 'Bellotti', 'Cinzia', '011/76586548', 'fai@virgilio.it'),
('0003', 'Morgeri', 'Giuseppe', '011/76547648', 'dig@email.it'),
('0004', 'Bastioni', 'Gianluca', '011/76586548', 'fai@virgilio.it'),
('0005', 'Francini', 'Massimiliano', '011/543326565', 'fra@virgilio.it'),
('0006', 'Mattone', 'Fabrizio', '011/98765762', 'gat@tin.it'),
('0007', 'Maistoni', 'Ivan', '011/5483678', 'mai@email.it'),
('0008', 'Parenti', 'Michele', '011/5367548', 'mik@tin.it'),
('0009', 'Morrini', 'Marco', '011/53645872', 'mor@libero.it'),
('0010', 'Pagini', 'Giuliana', '011/78363459', 'pag@yahoo.it'),
('0011', 'Picati', 'Annamaria', '011/67598721', 'pic@email.it'),
('0012', 'Rugliese', 'Antonio', '011/3678465', 'pug@tin.it'),
('0013', 'Romanotti', 'Davide', '011/34254367', 'rom@libero.it'),
('0014', 'Straniti', 'Annamaria', '011/845673865', 'str@libero.it');

-- --------------------------------------------------------

--
-- Table structure for table `repliche`
--

CREATE TABLE `repliche` (
  `COD_REPLICA` varchar(4) NOT NULL,
  `COD_SPETTACOLO` varchar(4) DEFAULT NULL,
  `DATA_REPLICA` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `repliche`
--

INSERT INTO `repliche` (`COD_REPLICA`, `COD_SPETTACOLO`, `DATA_REPLICA`) VALUES
('R001', 'S001', '2010-01-05'),
('R002', 'S001', '2010-01-06'),
('R003', 'S001', '2010-01-07'),
('R004', 'S001', '2010-01-08'),
('R005', 'S001', '2010-01-09'),
('R006', 'S002', '2010-01-12'),
('R007', 'S002', '2010-01-13'),
('R008', 'S002', '2010-01-14'),
('R009', 'S002', '2010-01-15'),
('R010', 'S002', '2010-01-16'),
('R011', 'S003', '2010-01-05'),
('R012', 'S003', '2010-01-06'),
('R013', 'S003', '2010-01-07'),
('R014', 'S003', '2010-01-08'),
('R015', 'S003', '2010-01-09'),
('R016', 'S004', '2010-01-12'),
('R017', 'S004', '2010-01-13'),
('R018', 'S004', '2010-01-14'),
('R019', 'S004', '2010-01-15'),
('R020', 'S004', '2010-01-16'),
('R021', 'S005', '2010-01-05'),
('R022', 'S005', '2010-01-06'),
('R023', 'S005', '2010-01-07'),
('R024', 'S005', '2010-01-08'),
('R025', 'S005', '2010-01-09'),
('R026', 'S006', '2010-01-12'),
('R027', 'S006', '2010-01-13'),
('R028', 'S006', '2010-01-14'),
('R029', 'S006', '2010-01-15'),
('R030', 'S006', '2010-01-16');

-- --------------------------------------------------------

--
-- Table structure for table `spettacoli`
--

CREATE TABLE `spettacoli` (
  `COD_SPETTACOLO` varchar(4) NOT NULL,
  `TITOLO` varchar(50) DEFAULT NULL,
  `AUTORE` varchar(25) DEFAULT NULL,
  `REGISTA` varchar(25) DEFAULT NULL,
  `PREZZO` float(6,2) DEFAULT NULL,
  `COD_TEATRO` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `spettacoli`
--

INSERT INTO `spettacoli` (`COD_SPETTACOLO`, `TITOLO`, `AUTORE`, `REGISTA`, `PREZZO`, `COD_TEATRO`) VALUES
('S001', 'Appunti per un film sulla lotta di classe', 'Ascanio Celestini', 'Ascanio Celestini', 20.00, 'T001'),
('S002', 'Il birraio di Preston', 'Andrea Camilleri', 'Giuseppe Dipasquale', 20.00, 'T001'),
('S003', 'La Traviata', 'Giuseppe Verdi', 'Laurent Pelly', 40.00, 'T002'),
('S004', 'La Boheme', 'Giacomo Puccini', 'Giuseppe Petroni Griffi', 40.00, 'T002'),
('S005', 'Poveri, ma belli', 'Gianni Togni', 'Massimno Ranieri', 25.00, 'T003'),
('S006', 'Il sogno del piccolo imperatore', 'Gian Mestruino', 'Alberto Barbi', 25.00, 'T003');

-- --------------------------------------------------------

--
-- Table structure for table `teatri`
--

CREATE TABLE `teatri` (
  `COD_TEATRO` varchar(4) NOT NULL,
  `NOME` varchar(30) DEFAULT NULL,
  `INDIRIZZO` varchar(30) DEFAULT NULL,
  `CITTA` varchar(25) DEFAULT NULL,
  `PROVINCIA` varchar(2) DEFAULT NULL,
  `TELEFONO` varchar(14) DEFAULT NULL,
  `POSTI` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teatri`
--

INSERT INTO `teatri` (`COD_TEATRO`, `NOME`, `INDIRIZZO`, `CITTA`, `PROVINCIA`, `TELEFONO`, `POSTI`) VALUES
('T001', 'Teatro Carignano', 'Piazza Carignano 6', 'Torino', 'TO', '011/3456759', 875),
('T002', 'Teatro Regio', 'Piazza Castello 2', 'Torino', 'TO', '011/9870654', 1592),
('T003', 'Teatro Alfieri', 'Piazza Solferino 4', 'Torino', 'TO', '011/6574895', 1500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `biglietti`
--
ALTER TABLE `biglietti`
  ADD PRIMARY KEY (`COD_OPERAZIONE`),
  ADD KEY `FK_CLIENTE` (`COD_CLIENTE`),
  ADD KEY `FK_REPLICA` (`COD_REPLICA`);

--
-- Indexes for table `clienti`
--
ALTER TABLE `clienti`
  ADD PRIMARY KEY (`COD_CLIENTE`);

--
-- Indexes for table `repliche`
--
ALTER TABLE `repliche`
  ADD PRIMARY KEY (`COD_REPLICA`),
  ADD KEY `FK_SPETTACOLO` (`COD_SPETTACOLO`);

--
-- Indexes for table `spettacoli`
--
ALTER TABLE `spettacoli`
  ADD PRIMARY KEY (`COD_SPETTACOLO`),
  ADD KEY `FK_TEATRO` (`COD_TEATRO`);

--
-- Indexes for table `teatri`
--
ALTER TABLE `teatri`
  ADD PRIMARY KEY (`COD_TEATRO`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `biglietti`
--
ALTER TABLE `biglietti`
  ADD CONSTRAINT `FK_CLIENTE` FOREIGN KEY (`COD_CLIENTE`) REFERENCES `clienti` (`COD_CLIENTE`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_REPLICA` FOREIGN KEY (`COD_REPLICA`) REFERENCES `repliche` (`COD_REPLICA`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `repliche`
--
ALTER TABLE `repliche`
  ADD CONSTRAINT `FK_SPETTACOLO` FOREIGN KEY (`COD_SPETTACOLO`) REFERENCES `spettacoli` (`COD_SPETTACOLO`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `spettacoli`
--
ALTER TABLE `spettacoli`
  ADD CONSTRAINT `FK_TEATRO` FOREIGN KEY (`COD_TEATRO`) REFERENCES `teatri` (`COD_TEATRO`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
