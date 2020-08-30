-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 23 May 2013, 11:52:33
-- Sunucu sürümü: 5.5.16
-- PHP Sürümü: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `projekitaplik`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `duyurular`
--

CREATE TABLE IF NOT EXISTS `duyurular` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `duyuru` longtext COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=2 ;

--
-- Tablo döküm verisi `duyurular`
--

INSERT INTO `duyurular` (`id`, `duyuru`) VALUES
(1, 'deneme');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kitaplar`
--

CREATE TABLE IF NOT EXISTS `kitaplar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yazar_adi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `yazar_soyadi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `kitap_adi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `yayin_evi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `kitap_turu` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=15 ;

--
-- Tablo döküm verisi `kitaplar`
--

INSERT INTO `kitaplar` (`id`, `yazar_adi`, `yazar_soyadi`, `kitap_adi`, `yayin_evi`, `kitap_turu`) VALUES
(1, 'musa', 'cöce', 'java', 'kku', 'Ansiklopedi'),
(2, 'seda', 'atabay', 'java', 'kacak', 'Ansiklopedi'),
(3, 'tugba', 'sert', 'java', 'aslkdja', 'Ders Kitab?'),
(4, 'tugba', 'sert', 'java', 'aslkdja', 'Ders Kitab?'),
(5, 'tugba', 'sert', 'java', 'aslkdja', 'Ders Kitab?'),
(6, 'a', 'b', 'c', 'd', 'Hikaye'),
(8, 'musa', 'cöce', 's', 'f', 'Roman'),
(9, 'musa', 'cöce', 'w', 'e', 'Hikaye'),
(10, 'musa', 'cöce', 'w', 'f', 'Hikaye'),
(11, 'a', 'x', 'n', 'm', 'Hikaye'),
(12, 'h', 'h', 'j', 'k', 'Hikaye'),
(13, 'hy', 'kh', 'kjh', '?p?', 'Hikaye'),
(14, 'kg', 'kgk', 'gk', 'lk', 'Hikaye');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `soyadi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `kadi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  `sifre` int(50) NOT NULL,
  `yetkisi` varchar(50) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci AUTO_INCREMENT=6 ;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `adi`, `soyadi`, `kadi`, `sifre`, `yetkisi`) VALUES
(1, 'musa', 'cöce', 'musak', 123, 'Kullanici'),
(2, 'musa', 'cöce', 'musacoce', 123, 'Yetkili'),
(3, 'admin', 'adminsad', 'adminkad', 123, 'Yetkili'),
(4, 'uye', 'uyesad', 'ukad', 123, 'Kullanici'),
(5, 'deneme', 'denemesad', 'denemekad', 123, 'Kullanici');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
