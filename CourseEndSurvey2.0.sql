-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Nov 26, 2019 at 05:42 PM
-- Server version: 5.7.26
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `CourseEndSurvey`
--
CREATE DATABASE IF NOT EXISTS `CourseEndSurvey` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `CourseEndSurvey`;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `c_id` varchar(15) NOT NULL,
  `c_name` varchar(50) DEFAULT NULL,
  `sem` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`c_id`, `c_name`, `sem`) VALUES
('16IS5DCDBM', 'Database Management Systems', '5'),
('16IS5DCDCN', 'Data Communication and Networking', '5'),
('16IS5DCJAV', 'Programming with Java', '5'),
('16IS5DCWEP', 'Web Programming', '5'),
('16IS5DEPYP', 'Python Programming', '5');

-- --------------------------------------------------------

--
-- Table structure for table `course_assign`
--

DROP TABLE IF EXISTS `course_assign`;
CREATE TABLE IF NOT EXISTS `course_assign` (
  `c_id` varchar(15) DEFAULT NULL,
  `fac_id` varchar(10) DEFAULT NULL,
  KEY `course_assign_ibfk_1` (`c_id`),
  KEY `course_assign_ibfk2` (`fac_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course_assign`
--

INSERT INTO `course_assign` (`c_id`, `fac_id`) VALUES
('16IS5DCWEP', 'F004');

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
CREATE TABLE IF NOT EXISTS `faculty` (
  `fac_id` varchar(10) NOT NULL,
  `fac_name` varchar(30) NOT NULL,
  `fac_pass` varchar(30) NOT NULL,
  PRIMARY KEY (`fac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`fac_id`, `fac_name`, `fac_pass`) VALUES
('F001', 'ANITHA HM', 'A123'),
('F002', 'ROOPA R', 'R123'),
('F003', 'NALINA V', 'N123'),
('F004', 'SREELATHA R', 'S123'),
('F005', 'CHANDRAKALA R', 'C123');

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

DROP TABLE IF EXISTS `rating`;
CREATE TABLE IF NOT EXISTS `rating` (
  `usn` varchar(10) NOT NULL,
  `c_id` varchar(15) NOT NULL,
  `q1` int(11) DEFAULT NULL,
  `q2` int(11) DEFAULT NULL,
  `q3` int(11) DEFAULT NULL,
  `q4` int(11) DEFAULT NULL,
  `q5` int(11) DEFAULT NULL,
  PRIMARY KEY (`usn`,`c_id`),
  KEY `c_id` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `usn` varchar(10) NOT NULL,
  `sem` varchar(4) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`usn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`usn`, `sem`, `name`) VALUES
('1BM17IS056', NULL, 'PRAJWAL.K'),
('1BM17IS057', NULL, 'PRATEEKA CHANDRASHEKAR BHAT'),
('1BM17IS058', NULL, 'PRAVALIKHA C'),
('1BM17IS059', NULL, 'PUSHYA D'),
('1BM17IS060', NULL, 'PUSHYA TIWARI'),
('1BM17IS061', NULL, 'RAGHAVENDRA RAJ'),
('1BM17IS062', NULL, 'RAHUL BHASKAR'),
('1BM17IS063', NULL, 'RAHUL GUPTA'),
('1BM17IS064', NULL, 'RAHUL RAMAN R'),
('1BM17IS065', NULL, 'RAHUL R SUBRAMANIAM'),
('1BM17IS066', NULL, 'RITHIKA SHIVA KUMAR'),
('1BM17IS067', NULL, 'RITHVIK MOHAN VIJALAPURAM'),
('1BM17IS068', NULL, 'ROHAN.H.S'),
('1BM17IS069', NULL, 'ROOPA MARUTI SHET'),
('1BM17IS070', NULL, 'SAGAR P'),
('1BM17IS071', NULL, 'SAHANA B'),
('1BM17IS072', NULL, 'SANJANA V'),
('1BM17IS073', NULL, 'SATHVIK B K'),
('1BM17IS074', NULL, 'SHREYA P'),
('1BM17IS075', NULL, 'SHREYAS N'),
('1BM17IS076', NULL, 'SHREYAS P'),
('1BM17IS077', NULL, 'SIDDHARTH ATHREYAS'),
('1BM17IS078', NULL, 'SUMUKH BHOOPALAM'),
('1BM17IS079', NULL, 'URMIKA KASI'),
('1BM17IS080', NULL, 'UZMA AZIZ'),
('1BM17IS081', NULL, 'VAISHNAVI SINHA'),
('1BM17IS082', NULL, 'VEDANSH SHARMA'),
('1BM17IS083', NULL, 'VEMURI ANVESH SAI'),
('1BM17IS084', NULL, 'VIKRAM K'),
('1BM17IS085', NULL, 'VIPIN R BHARADWAJ'),
('1BM17IS086', NULL, NULL),
('1BM17IS087', NULL, NULL),
('1BM17IS088', NULL, NULL),
('1BM17IS089', NULL, NULL),
('1BM17IS090', NULL, NULL),
('1BM17IS091', NULL, NULL),
('1BM17IS092', NULL, NULL),
('1BM17IS093', NULL, NULL),
('1BM17IS094', NULL, NULL),
('1BM17IS095', NULL, NULL),
('1BM17IS096', NULL, NULL),
('1BM17IS097', NULL, NULL),
('1BM17IS098', NULL, NULL),
('1BM17IS099', NULL, NULL),
('1BM17IS100', NULL, NULL),
('1BM17IS101', NULL, NULL),
('1BM17IS102', NULL, NULL),
('1BM17IS103', NULL, NULL),
('1BM17IS104', NULL, NULL),
('1BM17IS105', NULL, NULL);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `course_assign`
--
ALTER TABLE `course_assign`
  ADD CONSTRAINT `FOREIGN KEY` FOREIGN KEY (`fac_id`) REFERENCES `faculty` (`fac_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `course_assign_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `course` (`c_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rating`
--
ALTER TABLE `rating`
  ADD CONSTRAINT `rating_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `course` (`c_id`),
  ADD CONSTRAINT `rating_ibfk_2` FOREIGN KEY (`usn`) REFERENCES `student` (`usn`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
