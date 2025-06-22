# 企业信息管理系统

这是一个基于Java Spring Boot和原生JavaScript的全栈Web应用，用于管理企业中的部门、员工和员工工作经历信息。

## 技术栈

### 后端
- Spring Boot
- MyBatis
- MySQL
- Maven

### 前端
- 原生 HTML, CSS, JavaScript
- Fetch API (用于前后端异步通信)

## 如何运行

1.  **数据库准备**:
    -   请先在您的MySQL数据库中创建一个新的数据库（例如 `my_db`）。
    -   将项目根目录下的 `database.sql` (请先将 database.sql 文件导入到您的MySQL中) 文件导入到您创建的数据库中。

2.  **修改后端配置**:
    -   打开 `src/main/resources/application.properties` 文件。
    -   根据您的数据库设置，修改以下几项：
        - `spring.datasource.url` (修改数据库名)
        - `spring.datasource.username`
        - `spring.datasource.password`

3.  **运行后端**:
    -   使用 IntelliJ IDEA 或其他IDE导入本项目（作为Maven项目）。
    -   找到 `src/main/java/com/example/demo/DemoApplication.java` 文件，直接运行 `main` 方法。
    -   当控制台显示 "Tomcat started on port 8080" 时，表示后端已成功启动。

4.  **访问前端**:
    -   打开浏览器，访问地址：`http://localhost:8080`
    -   即可看到应用界面并进行操作。

## 功能列表
-   部门信息的增、删、改、查
-   员工信息的增、删、改、查
-   员工工作经历的增、删、改、查