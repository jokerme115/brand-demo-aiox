/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MariaDB
 Source Server Version : 100605 (10.6.5-MariaDB)
 Source Host           : localhost:3306
 Source Schema         : school

 Target Server Type    : MariaDB
 Target Server Version : 100605 (10.6.5-MariaDB)
 File Encoding         : 65001

 Date: 20/01/2023 16:12:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_brand
-- ----------------------------
DROP TABLE IF EXISTS `tb_brand`;
CREATE TABLE `tb_brand`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `company_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `ordered` int(11) NULL DEFAULT NULL,
  `description` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 101 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_brand
-- ----------------------------
INSERT INTO `tb_brand` VALUES (1, 'Evelyn Wilson', 'Dai Kee Telecommunication Limited', 468, 'x34ws4mXOX', 0);
INSERT INTO `tb_brand` VALUES (2, 'Kaneko Hikaru', 'Tian Toy Company Limited', 408, '7W7LuX5ZHR', 0);
INSERT INTO `tb_brand` VALUES (3, 'Yung Ming Sze', 'Hao Kee Company Limited', 30, 'i7TRpiulpo', 1);
INSERT INTO `tb_brand` VALUES (4, 'Stephen Medina', 'Ling Ling Industrial Limited', 160, 'g3Sr8iMB7Q', 0);
INSERT INTO `tb_brand` VALUES (5, 'Wang Zhiyuan', 'Peggy Logistic LLC', 194, '1XPmo85tVY', 0);
INSERT INTO `tb_brand` VALUES (6, 'Huang Yuning', 'Grant Engineering LLC', 399, 'MHWAObATIt', 1);
INSERT INTO `tb_brand` VALUES (7, 'Fujita Hana', 'Lau\'s Limited', 661, 'wlPVvbOC6v', 1);
INSERT INTO `tb_brand` VALUES (8, 'Tan Lan', 'Scott\'s Inc.', 262, 'gpKD2zpLFi', 1);
INSERT INTO `tb_brand` VALUES (9, 'Tam Yun Fat', 'Cai Kee Development & Trading Company Limited', 758, '7InaXTQzu7', 1);
INSERT INTO `tb_brand` VALUES (10, 'Fujii Hazuki', 'Rebecca Toy LLC', 977, 'HUoEKOylXS', 0);
INSERT INTO `tb_brand` VALUES (11, 'Zhou Yuning', 'Yin Kee Limited', 568, 'aDNz9RHO1C', 1);
INSERT INTO `tb_brand` VALUES (12, 'Takahashi Airi', 'Takahashi Telecommunication Corporation', 238, 'Fn7SIfIvRL', 1);
INSERT INTO `tb_brand` VALUES (13, 'Wang Xiaoming', 'Raymond Software Inc.', 183, 'w7vwr0OOGa', 1);
INSERT INTO `tb_brand` VALUES (14, 'Lu Zitao', 'Ota Corporation', 20, 'TmY7YwvQXG', 1);
INSERT INTO `tb_brand` VALUES (15, 'Deng Xiaoming', 'Olson Communications Inc.', 46, '2iQdYlEZYT', 0);
INSERT INTO `tb_brand` VALUES (16, 'Xiao Anqi', 'Dorothy Consultants LLC', 375, 'ns9kYTtleB', 1);
INSERT INTO `tb_brand` VALUES (17, 'Diana Russell', 'Aoi Food Corporation', 698, 'HvOIUc0jMu', 0);
INSERT INTO `tb_brand` VALUES (18, 'Ku Ching Wan', 'Richardson Brothers LLC', 781, 'pT59TjznmB', 0);
INSERT INTO `tb_brand` VALUES (19, 'Ku Sum Wing', 'Zhennan Telecommunication Company Limited', 778, '6E3JgV9Gn4', 1);
INSERT INTO `tb_brand` VALUES (20, 'Ito Mitsuki', 'Rita Inc.', 227, 'mvSZRzWKpB', 1);
INSERT INTO `tb_brand` VALUES (21, 'Fu Rui', 'Murphy Inc.', 136, 'vplb9fu06D', 1);
INSERT INTO `tb_brand` VALUES (22, 'Yokoyama Ikki', 'Jialun Trading Company Limited', 183, 'tMPW4zEzm1', 1);
INSERT INTO `tb_brand` VALUES (23, 'Yan Ziyi', 'Rui Telecommunication Company Limited', 6, 'O0UR2D4lqz', 1);
INSERT INTO `tb_brand` VALUES (24, 'Luo Zhennan', 'Lan Company Limited', 68, 'DN7OkQ3hv9', 1);
INSERT INTO `tb_brand` VALUES (25, 'Rose Lopez', 'Cox\'s Inc.', 393, 'TtM4Mq5Olz', 0);
INSERT INTO `tb_brand` VALUES (26, 'Lui Wing Suen', 'Virginia Electronic Inc.', 752, 'AthKQcdfGS', 1);
INSERT INTO `tb_brand` VALUES (27, 'Kobayashi Ryota', 'Saito Logistic Corporation', 394, 'HQZlZ7yBlz', 0);
INSERT INTO `tb_brand` VALUES (28, 'Maeda Kenta', 'Hui\'s Limited', 140, 'YDnYuRMVIU', 0);
INSERT INTO `tb_brand` VALUES (29, 'Xiong Xiuying', 'Patrick Inc.', 183, 'iRFkkwJ05j', 0);
INSERT INTO `tb_brand` VALUES (30, 'Cheng Jialun', 'Ling Ling Limited', 4, 'YHWsztRmVO', 1);
INSERT INTO `tb_brand` VALUES (31, 'Mao Ziyi', 'Hana Corporation', 652, 'OxQXO0Bcl0', 1);
INSERT INTO `tb_brand` VALUES (32, 'Abe Nanami', 'Powell\'s Software LLC', 815, 'XzoPJnZfXm', 1);
INSERT INTO `tb_brand` VALUES (33, 'Ann Graham', 'Lopez\'s Technology LLC', 525, 'PBfeIQTOYW', 0);
INSERT INTO `tb_brand` VALUES (34, 'Abe Riku', 'Gao Food Company Limited', 984, 'Grvla9ELe2', 0);
INSERT INTO `tb_brand` VALUES (35, 'Lin Yunxi', 'Seiko Electronic Corporation', 882, 'p7lpJ9jF5Z', 0);
INSERT INTO `tb_brand` VALUES (36, 'Takahashi Mitsuki', 'Xiaoming Company Limited', 844, 'mYO7nYYM5b', 1);
INSERT INTO `tb_brand` VALUES (37, 'Peggy Sullivan', 'Ayato Corporation', 151, 'LDhzXTzlxB', 1);
INSERT INTO `tb_brand` VALUES (38, 'Morita Ikki', 'On Na Telecommunication Limited', 326, 'DvsSV4g7YQ', 1);
INSERT INTO `tb_brand` VALUES (39, 'Song Zhiyuan', 'Bryant Inc.', 649, 'l5dZ84pkuu', 0);
INSERT INTO `tb_brand` VALUES (40, 'Fu Xiuying', 'Ferguson Brothers LLC', 730, '9s0SdgDkvx', 1);
INSERT INTO `tb_brand` VALUES (41, 'Charlotte Barnes', 'Yung\'s Limited', 215, 'WR9vqNV21X', 1);
INSERT INTO `tb_brand` VALUES (42, 'Randy Ford', 'Victor Pharmaceutical Inc.', 254, '2MZNjuQ4tZ', 1);
INSERT INTO `tb_brand` VALUES (43, 'Martha Mills', 'Ren Communications Corporation', 969, 'G6hRoGZEou', 1);
INSERT INTO `tb_brand` VALUES (44, 'Tracy Jordan', 'Ren Kee Company Limited', 376, 'ZfDDyd9kTk', 0);
INSERT INTO `tb_brand` VALUES (45, 'Clifford Torres', 'Yun Fat Telecommunication Limited', 898, 'ChmMggh7Xz', 1);
INSERT INTO `tb_brand` VALUES (46, 'Miyamoto Ren', 'Xiuying Food Company Limited', 739, 'blIJ09sIGW', 1);
INSERT INTO `tb_brand` VALUES (47, 'Liang Jiehong', 'Sau Man Logistic Limited', 925, 'kT8AHQXjBA', 1);
INSERT INTO `tb_brand` VALUES (48, 'Ng Kwok Ming', 'Dixon\'s Software LLC', 705, '6UNdBYqmmy', 0);
INSERT INTO `tb_brand` VALUES (49, 'George Myers', 'Elizabeth LLC', 491, '4APtixMDRA', 1);
INSERT INTO `tb_brand` VALUES (50, 'Ye Zhiyuan', 'Myers Brothers Inc.', 289, 'wkvexyez3E', 0);
INSERT INTO `tb_brand` VALUES (51, 'Yung Ling Ling', 'Uchida Corporation', 489, '27YbzvoLBZ', 1);
INSERT INTO `tb_brand` VALUES (52, 'Koon Wai Man', 'Chan\'s Limited', 366, 'YVHvEafd36', 0);
INSERT INTO `tb_brand` VALUES (53, 'Pang Kwok Ming', 'Jiehong Food Company Limited', 253, 'fGMggSMtd4', 1);
INSERT INTO `tb_brand` VALUES (54, 'Yamazaki Hazuki', 'Kasumi Toy Corporation', 322, '6sIFgOGEIG', 0);
INSERT INTO `tb_brand` VALUES (55, 'Tao Lan', 'Zitao Telecommunication Company Limited', 20, 'NI6wJNvftV', 0);
INSERT INTO `tb_brand` VALUES (56, 'Gong Zhiyuan', 'Xiaoming Company Limited', 962, 'CnKmAGinnm', 0);
INSERT INTO `tb_brand` VALUES (57, 'Wu Yunxi', 'Wei Company Limited', 518, 'g6Npi8JEp4', 0);
INSERT INTO `tb_brand` VALUES (58, 'Jiang Shihan', 'Itsuki Corporation', 715, 'ZWoOlgboBO', 0);
INSERT INTO `tb_brand` VALUES (59, 'Lo Wing Fat', 'Shihan Engineering Company Limited', 452, 'X5zQFoG7oC', 1);
INSERT INTO `tb_brand` VALUES (60, 'Tang Ting Fung', 'Tin Wing Limited', 120, 'tmUU3YK5PZ', 1);
INSERT INTO `tb_brand` VALUES (61, 'Tracy Freeman', 'Momoka Pharmaceutical Corporation', 121, 'tEHDDVggXg', 0);
INSERT INTO `tb_brand` VALUES (62, 'Luo Rui', 'Allen Trading Inc.', 536, 'V3sE9Q160H', 1);
INSERT INTO `tb_brand` VALUES (63, 'Tao Lai Yan', 'Yue\'s Logistic Limited', 626, 'CH2NaCM6cS', 0);
INSERT INTO `tb_brand` VALUES (64, 'Maeda Ayano', 'Rui Network Systems Company Limited', 816, 'wYSYs9eqCk', 0);
INSERT INTO `tb_brand` VALUES (65, 'Kong Shihan', 'Gordon Inc.', 23, 'A5bOjRhoPI', 0);
INSERT INTO `tb_brand` VALUES (66, 'Kong Wai Man', 'Deborah LLC', 390, 'IuU6tcLELj', 0);
INSERT INTO `tb_brand` VALUES (67, 'Hayashi Aoshi', 'Chun Yu Network Systems Limited', 429, 'i8BYswYztU', 1);
INSERT INTO `tb_brand` VALUES (68, 'Bradley Fisher', 'Jialun Communications Company Limited', 86, '9ylJl5os0r', 0);
INSERT INTO `tb_brand` VALUES (69, 'Miyazaki Momoe', 'Ka Fai Telecommunication Limited', 494, '1pzADU4qll', 1);
INSERT INTO `tb_brand` VALUES (70, 'Iwasaki Daichi', 'Yuna Corporation', 890, 'Aw8RlDY7cI', 1);
INSERT INTO `tb_brand` VALUES (71, 'Fujita Tsubasa', 'Earl LLC', 445, 'lOFkczehPU', 1);
INSERT INTO `tb_brand` VALUES (72, 'Siu Wing Kuen', 'Joseph Engineering LLC', 379, '0xBN43C1I1', 0);
INSERT INTO `tb_brand` VALUES (73, 'Tang Jialun', 'Ming Sze Consultants Limited', 310, 'g0EYp5XIgE', 0);
INSERT INTO `tb_brand` VALUES (74, 'Lillian Jones', 'Kam Kee Development & Trading Limited', 78, '2EKMW9aHrC', 1);
INSERT INTO `tb_brand` VALUES (75, 'Chung Chiu Wai', 'Sanchez\'s Electronic Inc.', 946, 'nM7fuKAnWx', 1);
INSERT INTO `tb_brand` VALUES (76, 'Yin Ling Ling', 'Stevens\'s Inc.', 341, 'S7PQfbX7NG', 0);
INSERT INTO `tb_brand` VALUES (77, 'Ishida Miu', 'Tang Kee Trading Company Limited', 903, '9ajqaRgVg3', 1);
INSERT INTO `tb_brand` VALUES (78, 'Hasegawa Akina', 'Ziyi Telecommunication Company Limited', 177, '45irA6ZayN', 1);
INSERT INTO `tb_brand` VALUES (79, 'Man Ka Ling', 'Yau\'s Electronic Limited', 490, 'rZ2C9rwhJT', 0);
INSERT INTO `tb_brand` VALUES (80, 'Sano Sakura', 'Fat Communications Limited', 830, '596WAqSwNX', 1);
INSERT INTO `tb_brand` VALUES (81, 'Yan Ziyi', 'Jiang Telecommunication Company Limited', 712, 'vZNm3IWajP', 1);
INSERT INTO `tb_brand` VALUES (82, 'Ren Yunxi', 'Tony Telecommunication LLC', 46, 'QrMv1xtJ1R', 0);
INSERT INTO `tb_brand` VALUES (83, 'Wang Zitao', 'Weaver Brothers Inc.', 8, '8JrdUt9jXF', 1);
INSERT INTO `tb_brand` VALUES (84, 'Kato Airi', 'Kong Trading Company Limited', 535, 'rfgORPhMCL', 0);
INSERT INTO `tb_brand` VALUES (85, 'Joseph Johnson', 'Ogawa Corporation', 445, 'Oo1mo7xbca', 0);
INSERT INTO `tb_brand` VALUES (86, 'Yamamoto Aoshi', 'Takahashi Corporation', 523, '5h1xUn5wUy', 1);
INSERT INTO `tb_brand` VALUES (87, 'Judith Ramos', 'Man Kee Electronic Limited', 184, 'IJpZAp2wI1', 1);
INSERT INTO `tb_brand` VALUES (88, 'Zhou Rui', 'Yu Company Limited', 398, 'bmw9uSjpkj', 1);
INSERT INTO `tb_brand` VALUES (89, 'Hsuan Wing Kuen', 'Ota Corporation', 736, 'OqNAvaa6Me', 1);
INSERT INTO `tb_brand` VALUES (90, 'Sheh Chung Yin', 'Lik Sun Limited', 48, 'wMYEXxzgOG', 1);
INSERT INTO `tb_brand` VALUES (91, 'Yuen Sze Kwan', 'Ayato Corporation', 144, 'xyGlL1V23S', 0);
INSERT INTO `tb_brand` VALUES (92, 'Che Hiu Tung', 'Kasumi Corporation', 660, 'zpMam8VvrI', 0);
INSERT INTO `tb_brand` VALUES (93, 'He Lan', 'Yuen Kee Limited', 398, 'eLu1ZteyDc', 1);
INSERT INTO `tb_brand` VALUES (94, 'Murata Nanami', 'Yuna Toy Corporation', 552, 'ds0unVqdgd', 1);
INSERT INTO `tb_brand` VALUES (95, 'Shimada Misaki', 'Mak\'s Network Systems Limited', 495, 'JTZc6DIxPt', 0);
INSERT INTO `tb_brand` VALUES (96, 'Paul Hunt', 'Yuen\'s Property Limited', 516, 'xHYEgao5pd', 0);
INSERT INTO `tb_brand` VALUES (97, 'Yuen Ling Ling', 'Momoka Electronic Corporation', 638, '0w0SlomIrz', 1);
INSERT INTO `tb_brand` VALUES (98, 'Mo Chung Yin', 'Xia Kee Company Limited', 148, 'SIECug02PQ', 0);
INSERT INTO `tb_brand` VALUES (99, 'Meng On Kay', 'Akina Food Corporation', 25, 'DKEeuhGqNS', 0);
INSERT INTO `tb_brand` VALUES (100, 'Meng Zitao', 'Sylvia LLC', 333, 'R9bsv0nL7H', 1);

SET FOREIGN_KEY_CHECKS = 1;
