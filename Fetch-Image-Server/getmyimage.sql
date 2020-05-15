-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 15, 2020 at 03:01 AM
-- Server version: 5.6.47-cll-lve
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `NavlakhumbreDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `getmyimage`
--

CREATE TABLE `getmyimage` (
  `id` int(10) NOT NULL,
  `imagename` varchar(100) NOT NULL,
  `imagepath` varchar(100) NOT NULL,
  `imageinfo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `getmyimage`
--

INSERT INTO `getmyimage` (`id`, `imagename`, `imagepath`, `imageinfo`) VALUES
(1, 'BomJesus.jpg', 'http://www.fabridgeengg.com/Root_NavlakhUmbre/Fetch-Image-Server/BomJesus.jpg', 'Bom Jesus Church image'),
(2, 'FortAguada.jpg', 'http://www.fabridgeengg.com/Root_NavlakhUmbre/Fetch-Image-Server/FortAguada.jpg', 'Fort Aguda'),
(3, 'CalanguteBeach.jpg', 'http://www.fabridgeengg.com/Root_NavlakhUmbre/Fetch-Image-Server/CalanguteBeach.jpg', 'Calangute Beach'),
(4, 'ChurchCajetan.jpg', 'http://www.fabridgeengg.com/Root_NavlakhUmbre/Fetch-Image-Server/ChurchCajetan.jpg', 'Church Cajetan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `getmyimage`
--
ALTER TABLE `getmyimage`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `getmyimage`
--
ALTER TABLE `getmyimage`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
