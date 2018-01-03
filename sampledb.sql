-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2018-01-03 03:21:55
-- 服务器版本： 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sampledb`
--

-- --------------------------------------------------------

--
-- 表的结构 `t_login_log`
--

CREATE TABLE `t_login_log` (
  `login_log_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `ip` varchar(23) NOT NULL,
  `login_datetime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `t_login_log`
--

INSERT INTO `t_login_log` (`login_log_id`, `user_id`, `ip`, `login_datetime`) VALUES
(1, 1, '127.0.0.1', '2017-12-31 01:30:31'),
(2, 1, '127.0.0.1', '2017-12-31 01:31:00'),
(3, 1, '127.0.0.1', '2017-12-31 01:31:12'),
(4, 1, '0:0:0:0:0:0:0:1', '2017-12-31 01:32:00'),
(5, 1, '0:0:0:0:0:0:0:1', '2017-12-31 01:40:51'),
(6, 1, '0:0:0:0:0:0:0:1', '2017-12-31 01:40:55'),
(7, 1, '0:0:0:0:0:0:0:1', '2017-12-31 01:44:00'),
(8, 1, '0:0:0:0:0:0:0:1', '2017-12-31 01:44:44'),
(9, 1, '0:0:0:0:0:0:0:1', '2017-12-31 01:49:56'),
(10, 1, '0:0:0:0:0:0:0:1', '2017-12-31 02:06:51'),
(11, 1, '127.0.0.1', '2017-12-31 02:20:33'),
(12, 1, '127.0.0.1', '2017-12-31 02:23:13'),
(13, 1, '0:0:0:0:0:0:0:1', '2017-12-31 02:23:41'),
(14, 1, '127.0.0.1', '2017-12-31 17:33:49'),
(15, 1, '127.0.0.1', '2017-12-31 17:34:09'),
(16, 1, '127.0.0.1', '2017-12-31 17:35:11'),
(17, 1, '0:0:0:0:0:0:0:1', '2017-12-31 17:47:26'),
(18, 1, '0:0:0:0:0:0:0:1', '2018-01-02 14:25:23'),
(19, 1, '0:0:0:0:0:0:0:1', '2018-01-02 14:25:26'),
(20, 1, '0:0:0:0:0:0:0:1', '2018-01-02 14:30:07'),
(21, 1, '0:0:0:0:0:0:0:1', '2018-01-02 14:32:57'),
(22, 1, '0:0:0:0:0:0:0:1', '2018-01-03 09:06:50'),
(23, 1, '0:0:0:0:0:0:0:1', '2018-01-03 09:07:34'),
(24, 1, '0:0:0:0:0:0:0:1', '2018-01-03 09:25:19');

-- --------------------------------------------------------

--
-- 表的结构 `t_resume`
--

CREATE TABLE `t_resume` (
  `id` int(11) NOT NULL COMMENT '自增id',
  `email` varchar(60) NOT NULL COMMENT '邮件地址',
  `detail` varchar(255) NOT NULL COMMENT '简历url地址',
  `userid` int(11) NOT NULL COMMENT '用户id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='简历表';

--
-- 转存表中的数据 `t_resume`
--

INSERT INTO `t_resume` (`id`, `email`, `detail`, `userid`) VALUES
(3, '这是一个邮箱', '这是一个url', 1);

-- --------------------------------------------------------

--
-- 表的结构 `t_user`
--

CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(30) NOT NULL,
  `credits` int(11) NOT NULL,
  `password` varchar(32) NOT NULL,
  `last_visit` datetime NOT NULL,
  `last_ip` varchar(23) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `t_user`
--

INSERT INTO `t_user` (`user_id`, `user_name`, `credits`, `password`, `last_visit`, `last_ip`) VALUES
(1, 'admin', 105, '21232F297A57A5A743894A0E4A801FC3', '2018-01-03 09:25:19', '0:0:0:0:0:0:0:1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_login_log`
--
ALTER TABLE `t_login_log`
  ADD PRIMARY KEY (`login_log_id`);

--
-- Indexes for table `t_resume`
--
ALTER TABLE `t_resume`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `t_user`
--
ALTER TABLE `t_user`
  ADD PRIMARY KEY (`user_id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `t_login_log`
--
ALTER TABLE `t_login_log`
  MODIFY `login_log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- 使用表AUTO_INCREMENT `t_resume`
--
ALTER TABLE `t_resume`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id', AUTO_INCREMENT=4;
--
-- 使用表AUTO_INCREMENT `t_user`
--
ALTER TABLE `t_user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
