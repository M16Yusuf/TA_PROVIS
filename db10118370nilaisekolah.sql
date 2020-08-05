/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 10.4.11-MariaDB : Database - db10118370nilaisekolah
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db10118370nilaisekolah` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db10118370nilaisekolah`;

/*Table structure for table `tb_admin` */

DROP TABLE IF EXISTS `tb_admin`;

CREATE TABLE `tb_admin` (
  `id_admin` varchar(10) NOT NULL,
  `nama_admin` varchar(25) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_admin` */

insert  into `tb_admin`(`id_admin`,`nama_admin`,`password`) values 
('10118365','Alif Ramdhan Kusaeri','admin'),
('10118367','Yanuar Tisya Dwi Putra','admin'),
('10118370','Muhammad Yusuf','admin'),
('10118371','Bintang Farhandika Editya','admin'),
('10118381','Muhammad Rizqi Hidayatull','admin');

/*Table structure for table `tb_guru` */

DROP TABLE IF EXISTS `tb_guru`;

CREATE TABLE `tb_guru` (
  `nip` varchar(18) NOT NULL,
  `nama_guru` varchar(25) NOT NULL,
  `alamat_guru` varchar(15) NOT NULL,
  `tgl_lahir_guru` date NOT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_guru` */

insert  into `tb_guru`(`nip`,`nama_guru`,`alamat_guru`,`tgl_lahir_guru`) values 
('0108199720180004','Yogi Agustian','Lampung','1997-08-01'),
('0401200020200003','Alif Ramdhan Kusaeri','Indramayu','2000-01-04'),
('0505199920190005','Fathia Fannisa Azzara','Kudus','1999-05-05'),
('0507200020200006','Ahmad Fauzi','Jakarta ','2000-07-05'),
('0701199320160005','Imam Apidin','bekasi','1993-01-07'),
('0809199920190011','Nadia Dini ','Surabaya','1999-09-08'),
('0902199920190008','Bayu hansyah Putra','bandung','1999-02-09'),
('0909199720150004','Asep Sutarjo','Cianjur','1997-09-09'),
('1001200020190015','Yanuar Tisya ','Banjar','2000-01-10'),
('1003199820170045','Bunga Citra Aprilia ','Tanggerang ','1998-03-10'),
('1011199920190014','Muhammad Rizki H ','Bengkulu','1999-11-10'),
('1105200020190003','Khairotul Mushfirah','Bengkulu','2000-05-11'),
('1108200020200002','Bintang Farhandika E','Padang','2000-08-11'),
('1110199920190010','Ilham Pratama hadi','Pacitan','1999-10-11'),
('1111199920190012','Tara Mashela','jakarta Utara','1999-11-11'),
('1208200020190005','Kinanti Muslimah','Cimahi','2000-08-12'),
('1210199820160007','Muhammad Gofur ','Bandung','1998-10-12'),
('1212199920150020','Muhammad Rizal ','bengkulu','1999-12-12'),
('1219200020180003','Kimas Linggo Alam','Bengkulu','2000-09-12'),
('1406199420110012','Ahmad tarjo','majalengka ','1994-06-14'),
('1607200020200001','Muhammad Yusuf','Sumedang','2000-07-16'),
('1612199620190013','Sella Putri Safitri','Pangandaran','1996-12-16'),
('1801199820190007','Aulia Aul','Sukabumi','1998-01-18'),
('2004199920190006','Rio Pramudya ','Solo','1999-04-20'),
('2108199020140032','Harry Andrian','Semarang','1990-08-21'),
('2812200020200040','Dinda Saputri','Yogyakarta','2000-12-28'),
('2901200020190009','Dini Nurvira','Batam','2000-01-29'),
('2905200020190004','Anisa Nurkholifa Ashar ','Bandung','2000-05-29');

/*Table structure for table `tb_kelas` */

DROP TABLE IF EXISTS `tb_kelas`;

CREATE TABLE `tb_kelas` (
  `id_kelas` varchar(3) NOT NULL,
  `tingkat_kelas` int(11) NOT NULL,
  `nip_walikelas` varchar(18) NOT NULL,
  PRIMARY KEY (`id_kelas`),
  KEY `nip_walikelas` (`nip_walikelas`),
  CONSTRAINT `tb_kelas_ibfk_1` FOREIGN KEY (`nip_walikelas`) REFERENCES `tb_guru` (`nip`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_kelas` */

insert  into `tb_kelas`(`id_kelas`,`tingkat_kelas`,`nip_walikelas`) values 
('1A',1,'0108199720180004'),
('1B',1,'0809199920190011'),
('2A',2,'0505199920190005'),
('2B',2,'0401200020200003'),
('3A',3,'1108200020200002'),
('3B',3,'1011199920190014'),
('4A',4,'1001200020190015'),
('4B',4,'1105200020190003'),
('5A',5,'1607200020200001'),
('5B',5,'2905200020190004'),
('6A',6,'0909199720150004'),
('6B',6,'2108199020140032');

/*Table structure for table `tb_nilai` */

DROP TABLE IF EXISTS `tb_nilai`;

CREATE TABLE `tb_nilai` (
  `id_nilai` int(11) NOT NULL AUTO_INCREMENT,
  `nilai` int(11) NOT NULL,
  `nis` varchar(12) NOT NULL,
  `id_pelajaran` int(11) NOT NULL,
  PRIMARY KEY (`id_nilai`),
  KEY `nis` (`nis`),
  KEY `id_pelajaran` (`id_pelajaran`),
  CONSTRAINT `tb_nilai_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `tb_siswa` (`nis`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tb_nilai_ibfk_2` FOREIGN KEY (`id_pelajaran`) REFERENCES `tb_pelajaran` (`id_pelajaran`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_nilai` */

insert  into `tb_nilai`(`id_nilai`,`nilai`,`nis`,`id_pelajaran`) values 
(2,70,'160720150016',13),
(3,80,'011020140005',13),
(4,85,'011020140005',14);

/*Table structure for table `tb_pelajaran` */

DROP TABLE IF EXISTS `tb_pelajaran`;

CREATE TABLE `tb_pelajaran` (
  `id_pelajaran` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pelajaran` varchar(40) NOT NULL,
  `tingkat` int(11) NOT NULL,
  `nip_pengajar` varchar(18) NOT NULL,
  PRIMARY KEY (`id_pelajaran`),
  KEY `nip_pengajar` (`nip_pengajar`),
  CONSTRAINT `tb_pelajaran_ibfk_1` FOREIGN KEY (`nip_pengajar`) REFERENCES `tb_guru` (`nip`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_pelajaran` */

insert  into `tb_pelajaran`(`id_pelajaran`,`nama_pelajaran`,`tingkat`,`nip_pengajar`) values 
(4,'Ilmu Pengetahuan Alam',5,'1607200020200001'),
(5,'Ilmu Pengetahuan Sosial',5,'2905200020190004'),
(6,'Pendidikan Kewarganegaraan',5,'0401200020200003'),
(7,'Matematika',5,'1108200020200002'),
(8,'Bahasa Indonesia',5,'1011199920190014'),
(9,'Bahasa Inggris',5,'1001200020190015'),
(10,'Seni Budaya Keterampilan',5,'1105200020190003'),
(11,'Agama',5,'1110199920190010'),
(12,'Pendidikan jasmani dan Olahraga',5,'0902199920190008'),
(13,'Ilmu Pengetahuan Alam ',1,'0108199720180004'),
(14,'Ilmu Pengetahuan Sosial',1,'0809199920190011'),
(15,'Pendidikan Kewarganegaraan',1,'0507200020200006'),
(16,'Matematika',1,'1003199820170045'),
(17,'Bahasa Indonesia',1,'0701199320160005'),
(18,'Seni Budaya Keterampilan',1,'1105200020190003'),
(19,'Agama',1,'1110199920190010'),
(20,'Pendidikan Jasmani dan Olahraga',1,'0902199920190008'),
(21,'Ilmu Pengetahuan Alam',2,'0108199720180004'),
(22,'Ilmu Pengetahuan Sosial',2,'2905200020190004'),
(23,'Pendidikan Kewarganegaraan',2,'0507200020200006'),
(24,'Matematika',2,'1003199820170045'),
(25,'Bahasa Indonesia',2,'0701199320160005'),
(26,'Seni Budaya Keterampilan',2,'1801199820190007'),
(27,'Agama',2,'0701199320160005'),
(28,'Ilmu Pendidikan Jasmani',2,'1219200020180003'),
(29,'Ilmu Pengetahuan Alam',3,'1208200020190005'),
(30,'Ilmu Penetahuan Sosial',3,'0809199920190011'),
(31,'Pendidikan Kewarganergaraan',3,'0401200020200003'),
(32,'Matematika',3,'1108200020200002'),
(33,'Bahasa Indonesia',3,'1003199820170045'),
(34,'Seni Budaya Keterampilan',3,'1801199820190007'),
(35,'Agama',3,'0701199320160005'),
(36,'Pendidikan Jasmani dan Olahraga',3,'1219200020180003'),
(37,'Ilmu Pengetahuan Alam',4,'1208200020190005'),
(38,'Ilmu Pengetahuan Sosial',4,'0809199920190011'),
(39,'Pendidikan Kewarganegaraan',4,'0507200020200006'),
(40,'Matematika',4,'1001200020190015'),
(41,'Bahasa Indonesia ',4,'1011199920190014'),
(42,'Bahasa Inggris',4,'1111199920190012'),
(43,'Seni Budaya Keterampilan',4,'1105200020190003'),
(44,'Agama',4,'1210199820160007'),
(45,'Pendidikan Jasmani dan Olahraga',4,'1219200020180003'),
(46,'Ilmu Pengetahuan Alam',6,'1607200020200001'),
(47,'Ilmu Pengetahuan Sosial',6,'2905200020190004'),
(48,'Pendidikan Kewarganegaraan',6,'0401200020200003'),
(49,'Matematika',6,'1108200020200002'),
(50,'Bahasa Indonesia',6,'1011199920190014'),
(51,'Bahasa Inggris',6,'1001200020190015'),
(52,'Seni Budaya dan keterampilan',6,'1105200020190003'),
(53,'Agama',6,'0701199320160005'),
(54,'Pendidikan Jasmani dan Olahraga',6,'0902199920190008');

/*Table structure for table `tb_siswa` */

DROP TABLE IF EXISTS `tb_siswa`;

CREATE TABLE `tb_siswa` (
  `nis` varchar(12) NOT NULL,
  `nama_siswa` varchar(25) NOT NULL,
  `alamat_siswa` varchar(15) NOT NULL,
  `tgl_lahir_siswa` date NOT NULL,
  `id_kelas` varchar(3) NOT NULL,
  PRIMARY KEY (`nis`),
  KEY `id_kelas` (`id_kelas`),
  CONSTRAINT `tb_siswa_ibfk_1` FOREIGN KEY (`id_kelas`) REFERENCES `tb_kelas` (`id_kelas`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_siswa` */

insert  into `tb_siswa`(`nis`,`nama_siswa`,`alamat_siswa`,`tgl_lahir_siswa`,`id_kelas`) values 
('010120120002','fajar candra wijaya','Bandung','2012-01-01','4A'),
('010120120009','Hestu Swasti','bandung','2012-01-01','4A'),
('010120130003','Nisa martilia','Bandung','2013-01-01','3B'),
('010220110006','Fidiyah Nurani','Bandung','2011-02-01','4A'),
('010320100001','Abdul malik sulaiman','Bandung','2011-03-01','5B'),
('010320100004','alfian suhendra','Bandung','2010-03-01','5A'),
('010420100002','adhinatya indra permana','bandung','2010-04-01','5A'),
('010420110004','fathurriza adnan','bandung','2011-04-01','4A'),
('010420130005','Rahma dewi','Bandung','2013-04-01','3B'),
('010520100009','derisa putri anjani','Bandung','2010-05-01','5A'),
('010520120004','desika dewi kunaini','Bandung','2012-05-05','4B'),
('010720090001','Abdul Ilyas Setiawan','Bandung','2009-07-01','6A'),
('010820120001','ahmad fadli','Bandung','2012-08-01','4B'),
('010820120005','Apipudin','Bandung','2012-05-01','4B'),
('011020140005','Dodi setiadi','Bandung ','2014-10-01','1A'),
('011120090010','Ridwal Ismail','Bandung','2009-11-01','6A'),
('011220100006','andre virgiantara','Bandung','2010-12-01','5A'),
('011220140008','Devi wulandary','Bandung','2014-12-01','2A'),
('020120090011','Nadya Dinda','Bandung','2009-12-02','6B'),
('020120100014','Faizal abizar','Bandung','2010-01-02','5B'),
('020120110002','Adji pangestu','Bandung','2011-01-02','5B'),
('020520140010','Patricia calista dewanty','Bandung','2014-05-02','2A'),
('030220110003','Anissya eka hendrayati','Bandung','2011-02-03','5B'),
('030320090010','Lin rusdiana','Bandung','2009-03-03','4A'),
('030620090009','Nadia deya','Bandung','2009-06-03','6B'),
('030620110013','Faisal rahmat','Bandung','2011-06-03','5B'),
('040320100004','Ario jamesbond achmadsyah','Bandung','2010-03-04','5B'),
('040320100012','Naufal irsaly zikri','Bandung','2010-03-04','6B'),
('040420140004','Abdi abigail','Bandung','2014-04-04','2B'),
('040720100006','arif firmanto','Bandung','2010-07-04','6A'),
('040920100006','Muhammad Indra','Bandung','2010-09-04','6B'),
('050220140012','Yadipia Ramadhan','Sumedang','2014-02-05','1A'),
('050620100010','Nadila Dilza','Bandung','2010-06-05','6B'),
('050620110005','Ario gustama pasya','Bandung','2011-06-05','5B'),
('060520110006','Ariq Radhitama ariasatya','Bandung','2011-05-06','5B'),
('060720120001','Ery saputra','bandung','2012-07-06','4A'),
('060720130002','Neli misjunia','Bandung','2013-07-06','3B'),
('060820120007','Erna yuliana','Bandung','2012-09-06','4B'),
('060920090003','Andreas Mahendra','Bandung','2009-09-06','6A'),
('061120090001','Hanafa hastana','Bandung','2009-11-06','6B'),
('061220140006','Ike mariska','Bandung','2014-12-06','2B'),
('070620090013','Reshad parandangi','Bandung','2009-06-07','6B'),
('070620100007','Catherine Sharon riris','Bandung','2010-06-07','5B'),
('071020150015','naufal Nurfalah','Bandung','2015-10-07','1A'),
('080420140006','Nisa Aprilia','Sumedang','2014-04-08','1A'),
('080420150010','Muhammad alex','Jakarta','2015-04-08','1B'),
('080820130006','Lyla kusuma atma','Bandung','2013-08-08','3A'),
('080920100008','Chesya Bintang caroline','Bandung','2010-09-08','5B'),
('080920150003','Diana Yuliana','Bandung','2015-09-08','1B'),
('081020140007','Darul nafisz','Bandung','2014-02-08','2A'),
('081220140009','Perdiansyah Syaputra','Bandung','2014-12-08','1A'),
('090520100005','Muhammad attariq','Bandung','2010-05-09','6B'),
('090620150002','Fikri Ahmad Rofiki','Sumedang','2015-06-09','1A'),
('090720150013','Indra Permana','Sumedang ','2015-07-09','1A'),
('090820130006','Sarifudin','Bandung','2013-08-09','3B'),
('091020100014','Rahadian aldi','Bandung','2010-10-09','6B'),
('091020110009','Natasya cindi','Bandung','2011-10-09','5B'),
('091220140003','Huda Hidayatullah ','Bandung','2014-12-09','1A'),
('100520120008','Hana Mita Revany','bandung','2012-05-10','4A'),
('100920120007','gilang gunakan argacahya','Bandung','2012-09-10','4A'),
('101020140005','ivan azhari faturahman','Bandung','2014-10-10','2B'),
('101120090004','Anisha Eka Fitriana','Bandung','2009-11-10','6A'),
('101120110010','Cindy thalia','Bandung','2011-11-10','5B'),
('110220100011','Ekida rehan firmansyah','Bandung','2010-02-11','5B'),
('110220130007','Selviani','Bandung','2013-02-11','3B'),
('110320100012','Erina nursyahfitri','Sumedang','2010-03-11','5B'),
('110420100005','anisa parahita','Bandung','2010-04-11','6A'),
('110620130012','Muhammad zulfadli','Bandung','2013-06-11','4B'),
('110720090015','verra rosedevi','bandung','2009-07-11','6A'),
('110720150008','Herald abdiel','Bandung','2015-07-11','1B'),
('110820140001','Susi Sinta','Bandung','2014-08-11','1A'),
('110920120005','feri lestari','bandung','2012-09-11','4A'),
('111120140007','Hasna Putri Nurendah','Sumedang','2014-11-11','1A'),
('111120140008','Husni Putri Nurendah','Sumedang','2014-11-11','1A'),
('120520090008','Murfid aufa','Bandung','2009-05-12','6B'),
('120520150011','Aulia Amelia','Cianjur','2015-05-12','1A'),
('121120100008','dedi hasim syafei','Bandung','2010-11-12','5A'),
('130320140001','Zainal Majdi','Bandung','2014-03-13','2A'),
('140120120009','Finianita miliwanti','Bandung','2012-01-14','4B'),
('140820090014','rahayu mikil pramesti','Bandung','2009-08-14','6A'),
('140920140010','Amriyana Mushfirah','Bandung','2014-09-14','1A'),
('141020100001','angger rinanda kusuma','bandung','2010-10-14','5A'),
('141020100010','Desi Utami ','Bandung','2010-10-14','5A'),
('141020130001','Muhammad imam','Bandung','2013-10-14','3B'),
('141020130010','Muhammad zainul jafar','Bandung','2013-10-14','3A'),
('150120130010','Wendi tuliono','Bandung','2013-01-15','3B'),
('150220100005','andre alpiansyah','Bandung','2010-02-15','5A'),
('150920130004','Imroni hasbi','Bandung','2013-09-15','3A'),
('151020140009','Gina septia wati','Bandung','2014-10-15','2B'),
('160720150016','Yusuf Jamal','Sumedang','2015-07-16','1A'),
('160820140002','Muhamamd rosidin','Bandung','2014-08-16','2B'),
('161220130002','Heri febrian','Bandung','2013-12-16','3A'),
('170220140007','Adellia putri','Bandung','2014-02-17','2B'),
('170720150004','Ahmad Taufik','Bandung','2015-07-17','1A'),
('171220100012','yunita trisnawati','Bandung','2010-12-17','6A'),
('180420090007','Rahmandito susilo','Bandung','2009-04-18','6B'),
('180520130005','Junnata asmir','Bandung','2013-05-18','3A'),
('180620090004','Karina cahyantari','Bandung','2009-06-18','6B'),
('180620150002','Eka ariani saputri','Bandung','2015-06-18','1B'),
('180720120003','farhan amri ramadhan','bandung','2012-07-18','4A'),
('180720130004','Nurmadinah','Bandung','2013-07-18','3B'),
('180920140001','Wahyu maulana saputra','Bandung','2014-09-18','2B'),
('181020090007','dindah sekar oktaviaswi','Bandung','2009-10-18','6A'),
('181020140004','Jonathan saputra','Jakarta','2014-10-18','2A'),
('190120100002','Adlia Pramestya','Bandung','2010-01-19','6A'),
('190220140009','Ilham hidayatullah','Bandung','2014-02-19','2A'),
('190320140006','Selinda adellia putri','Bandung','2014-03-19','2A'),
('200620090003','Johannes felix','Bandung','2009-06-20','6B'),
('200720090013','zara septya karina','bandung','2009-07-20','6A'),
('200720110003','agus prasetyo','Bandung','2011-07-20','5A'),
('200920130008','Taufik rivaldi','Bandung','2013-09-20','3B'),
('200920140008','Maura maifirah','Bandung','2014-09-20','2B'),
('201020120003','anden yuharman','Bandung','2012-12-12','4B'),
('210420120013','Maryatu taibah','Bandung','2012-04-24','4B'),
('210520120008','Fery ahmad','Bandung','2012-05-21','4B'),
('210520150004','Ahmad fadilla','Bandung','2015-05-21','1B'),
('210720090015','Aldi setiawan','Bandung','2009-07-21','6B'),
('210720100007','arief abdurrahman ','Bandung','2010-07-21','5A'),
('210820120015','Izza mahendra','Bandung','2012-09-21','4B'),
('210820140005','Ahmad abdul sholeh','Bandung','2014-08-21','2A'),
('210920140010','Fauzan vrianda putra','Bandung','2014-09-21','2B'),
('211120120014','Jody fatdli','Bandung','2012-11-23','4B'),
('211220120010','Habibullah ','Bandung','2012-12-21','4B'),
('220120150007','Gracia christy rina','Bandung','2015-01-22','1B'),
('221220120011','Muhammad Sahibullah','Bandung','2012-12-22','4B'),
('221220150014','Aditya ','Cianjur','2015-12-22','1A'),
('230120100015','Glyceria ericha putri','Bandung','2010-01-23','5B'),
('230120130008','Muhammad Pathu abror','Aceh','2013-12-23','3A'),
('230220150006','Bramsta maheswara','Bandung','2015-02-23','1B'),
('230520130009','Titin priana','Bandung','2013-05-23','3B'),
('230820140002','Wandi irawan','Bandung','2014-08-23','2A'),
('240120150001','Petra saputra','Bandung','2015-01-24','1B'),
('241220100009','reza eko putranto','Bandung','2010-12-24','6A'),
('250320130007','Muhammad azizul ','Bandung','2013-03-25','3A'),
('250420150005','Ainur navida','Bandung','2015-04-25','1B'),
('260420150009','Stefani abigail','Jakarta','2015-04-26','1B'),
('270820130009','Muhammad ripaldi','Bandung','2013-08-27','3A'),
('280220090011','puput ardiyana asnitasari','Bandung','2009-02-28','6A'),
('281120120006','Diki sanjaya','Bandung','2012-11-28','4B'),
('290220120002','ahmad hadiansani','Bandung','2012-10-02','4B'),
('300320130001','Hendry saputra','Bandung','2013-03-30','3A'),
('300420090008','rafi adbul majid','Bandung','2009-04-30','6A'),
('300620140003','Alex herman','Jakarta','2014-06-30','2A'),
('300820130003','Hidayah','Bandung','2013-08-31','3A'),
('301220090002','Jiyi malika ','Bandung','2009-12-30','6B'),
('310520150003','Natasyah stefani putri','Bandung','2015-05-31','2B'),
('310720090007','dizta aprilia ristiani','Bandung','2009-07-31','6A');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
