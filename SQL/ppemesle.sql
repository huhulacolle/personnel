SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ppemesle`
--

-- --------------------------------------------------------



--
-- Structure de la table `employe`
--

DROP TABLE IF EXISTS `employe`;
CREATE TABLE IF NOT EXISTS `employe` (
  `IDEmploye` int NOT NULL,
  `NomE` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `Datedebut` date DEFAULT NULL,
  `DateFin` date DEFAULT NULL,
  `PrenomE` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `EMailE` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `MdpE` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `IDLigue` int NOT NULL,
  PRIMARY KEY (`IDEmploye`),
  FOREIGN KEY (`IDLigue`) REFERENCES ligue(`IDLigue`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ligue`
--

DROP TABLE IF EXISTS `ligue`;
CREATE TABLE IF NOT EXISTS `ligue` (
  `IDLigue` int NOT NULL,
  `NomLigue` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`IDLigue`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
