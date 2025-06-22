create database my_db;
use my_db;
CREATE TABLE dept (
    id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT '部门ID',
    name VARCHAR(10) NOT NULL UNIQUE COMMENT '部门名称（2-10字符）',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后操作时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE emp (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '员工ID',
    username VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名(2-20字母)',
    password VARCHAR(64) DEFAULT '123456' COMMENT '密码',
    name VARCHAR(10) NOT NULL COMMENT '姓名(2-10汉字)',
    gender TINYINT COMMENT '性别，1:男，2:女',
    phone CHAR(11) NOT NULL COMMENT '手机号(11位)',
    position TINYINT COMMENT '职位，1:班主任，2:讲师，3:学工主管，4:教研主管，5:咨询师',
    salary INT COMMENT '薪资',
    image VARCHAR(255) COMMENT '头像路径',
    hire_date DATE COMMENT '入职日期',
    dept_id INT COMMENT '部门ID',
    create_time DATETIME COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后操作时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工信息表';



CREATE TABLE emp_expr (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '经历ID',
    emp_id INT COMMENT '员工ID',
    start_date DATE COMMENT '开始日期',
    end_date DATE COMMENT '结束日期(可为空表示至今)',
    company VARCHAR(50) COMMENT '公司名称',
    position VARCHAR(20) COMMENT '担任职位',
    description VARCHAR(200) COMMENT '工作描述',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工工作经历表';


INSERT INTO dept (name) VALUES
('教学部'), ('学工部'), ('教研部'), ('市场部'), ('人事部'),
('财务部'), ('技术部'), ('后勤部'), ('招生部'), ('就业部'),
('国际部'), ('网络部'), ('宣传部'), ('保卫部'), ('行政部');



INSERT INTO emp (username, password, name, gender, phone, position, salary, hire_date, dept_id, create_time) VALUES
('zhangsan', 'e10adc3949ba59abbe56e057f20f883e', '张三', 1, '13800138001', 1, 8000, '2020-01-15', 1, '2020-01-15 09:00:00'),
('lisi', 'e10adc3949ba59abbe56e057f20f883e', '李四', 1, '13800138002', 2, 10000, '2019-05-20', 2, '2019-05-20 09:00:00'),
('wangwu', 'e10adc3949ba59abbe56e057f20f883e', '王五', 1, '13800138003', 3, 12000, '2018-03-10', 3, '2018-03-10 09:00:00'),
('zhaoliu', 'e10adc3949ba59abbe56e057f20f883e', '赵六', 1, '13800138004', 4, 15000, '2021-07-22', 4, '2021-07-22 09:00:00'),
('qianqi', 'e10adc3949ba59abbe56e057f20f883e', '钱七', 2, '13800138005', 5, 9000, '2022-02-18', 5, '2022-02-18 09:00:00'),
('sunba', 'e10adc3949ba59abbe56e057f20f883e', '孙八', 2, '13800138006', 1, 8500, '2020-11-30', 6, '2020-11-30 09:00:00'),
('zhoujiu', 'e10adc3949ba59abbe56e057f20f883e', '周九', 2, '13800138007', 2, 11000, '2019-09-15', 7, '2019-09-15 09:00:00'),
('wushi', 'e10adc3949ba59abbe56e057f20f883e', '吴十', 1, '13800138008', 3, 13000, '2021-04-05', 8, '2021-04-05 09:00:00'),
('zheng11', 'e10adc3949ba59abbe56e057f20f883e', '郑十一', 1, '13800138009', 4, 16000, '2018-12-12', 9, '2018-12-12 09:00:00'),
('wang12', 'e10adc3949ba59abbe56e057f20f883e', '王十二', 2, '13800138010', 5, 9500, '2022-03-01', 10, '2022-03-01 09:00:00'),
('li13', 'e10adc3949ba59abbe56e057f20f883e', '李十三', 2, '13800138011', 1, 8200, '2020-08-25', 11, '2020-08-25 09:00:00'),
('zhao14', 'e10adc3949ba59abbe56e057f20f883e', '赵十四', 1, '13800138012', 2, 10500, '2019-11-11', 12, '2019-11-11 09:00:00'),
('qian15', 'e10adc3949ba59abbe56e057f20f883e', '钱十五', 1, '13800138013', 3, 12500, '2021-06-30', 13, '2021-06-30 09:00:00'),
('sun16', 'e10adc3949ba59abbe56e057f20f883e', '孙十六', 2, '13800138014', 4, 15500, '2018-07-07', 14, '2018-07-07 09:00:00'),
('zhou17', 'e10adc3949ba59abbe56e057f20f883e', '周十七', 2, '13800138015', 5, 9800, '2022-01-20', 15, '2022-01-20 09:00:00');

INSERT INTO emp_expr (emp_id, start_date, end_date, company, position, description) VALUES
(1, '2015-06-01', '2018-12-31', '第一教育', '教师', '负责初中数学教学'),
(1, '2019-01-01', NULL, '第二中学', '班主任', '负责班级管理和数学教学'),
(2, '2016-03-15', '2019-05-10', '未来教育', '讲师', '教授英语课程'),
(3, '2014-07-01', '2018-02-28', '精英培训', '教学主管', '管理教学团队'),
(4, '2017-09-01', '2021-06-30', '智慧教育', '教研员', '负责课程开发'),
(5, '2018-05-20', NULL, '启航教育', '咨询师', '学生学业规划'),
(6, '2016-11-01', '2020-10-31', '博学教育', '教师', '物理课程教学'),
(7, '2015-08-15', '2019-08-14', '明德学院', '讲师', '语文教学'),
(8, '2017-03-01', NULL, '育才学校', '学工主任', '学生管理工作'),
(9, '2013-09-01', '2018-11-30', '卓越教育', '教研主管', '教学研究'),
(10, '2019-07-01', NULL, '成才教育', '咨询顾问', '招生咨询'),
(11, '2015-02-01', '2020-07-31', '希望教育', '教师', '化学教学'),
(12, '2016-09-01', NULL, '明日之星', '高级讲师', '数学教学'),
(13, '2014-11-01', '2021-05-31', '博雅教育', '教学总监', '全面管理教学'),
(14, '2017-01-15', NULL, '优学教育', '教研组长', '教研工作'),
(15, '2018-08-01', '2022-01-19', '领航教育', '咨询经理', '管理咨询团队');