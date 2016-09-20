use pep;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `phone` varchar(255),
  `genderAdm` varchar(255),
  `birthDate` varchar(255),
  `address` varchar(255),
  `maritalStatus` varchar(255),
  `breed` varchar(255),
  `ethnicGroup` varchar(255),
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;
