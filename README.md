# IoC-DI-Spring-Bean

Dự án mẫu sử dụng **Java Spring Boot** để minh họa các **khái niệm IoC, Dependency Injection (DI), và Spring Bean** trong môn học _Lập trình Java nâng cao_.

---

## 📌 Mục tiêu đề tài

- Giải thích và minh họa **IoC (Inversion of Control)** – kỹ thuật tách biệt việc tạo và quản lý đối tượng.
- Áp dụng **DI (Dependency Injection)** để tự động tiêm đối tượng vào các lớp cần dùng.
- Tạo và sử dụng **Spring Bean** bằng cả 2 cách:
  - Tự động với `@Component`, `@Service`, `@Controller`
  - Thủ công với `@Configuration` và `@Bean`

---

## 🗂 Cấu trúc thư mục chính

```css
spring-ioc-demo/
├── controller/ → Web controller dùng @Controller
├── service/ → Interface & Implementation của service
├── model/ → Định nghĩa lớp Lecturer
├── config/ → Lớp AppConfig định nghĩa Bean thủ công
├── templates/ → View Thymeleaf (HTML)
├── static/ → CSS/JS (nếu có)
├── application.properties
├── SpringIocDemoApplication.java
└── pom.xml
```

---

## 🚀 Cách chạy project

### 1. Clone về máy

```bash
git clone https://github.com/yourusername/spring-ioc-demo.git
cd spring-ioc-demo
```

## 2. Build project
```bash
mvn clean install
```

### 3. Chạy project
```bash
mvn spring-boot:run
```

### 4. Truy cập trình duyệt
```url
http://localhost:8080/lecturers
```

---

## 📚 Kiến thức áp dụng
### ✅ Inversion of Control (IoC)
Spring sẽ chịu trách nhiệm khởi tạo và quản lý vòng đời của các Bean, thay vì để lập trình viên tự tạo.

### ✅ Dependency Injection (DI)
- Constructor Injection:
LecturerController nhận LecturerService qua constructor.

```java
public LecturerController(LecturerService lecturerService) {
    this.lecturerService = lecturerService;
}
```

- Spring tự động inject Bean phù hợp.

### ✅ Spring Bean
- Cách 1: Tự động tạo Bean

```java
@Service
public class LecturerServiceImpl implements LecturerService {
    ...
}
```

- Cách 2: Tạo Bean thủ công

```java
@Configuration
public class AppConfig {
    @Bean
    public LecturerService lecturerService() {
        return new LecturerServiceImpl();
    }
}
```

---

## 🖼 Giao diện demo
Giao diện đơn giản dùng Thymeleaf hiển thị danh sách giảng viên.

```less
Danh sách giảng viên:

- Nguyễn Văn A – Công nghệ phần mềm
- Trần Thị B – Khoa học máy tính
```

---

## 📦 Yêu cầu môi trường
- Java 17 trở lên
- Maven 3.8+
- Spring Boot 3.3.2
- Trình duyệt hỗ trợ UTF-8

---

## 🔧 Mở rộng thêm
- Thêm chức năng thêm giảng viên bằng form HTML
- Kết nối với database thật (JPA + H2 hoặc MySQL)
- Dùng field injection hoặc setter injection để so sánh
- Giao diện HTML + CSS Bootstrap đẹp hơn

---

## 🧑‍🎓 Tác giả
- 📘 Đề tài: Khái niệm IoC, DI và Spring Bean
- 👨‍🏫 Môn học: Lập trình Java nâng cao
- 🧑‍💻 Sinh viên: Hoàng Nghĩa Minh Bảo
- 🏫 Trường: Trường Đại học Đà Lạt

---

## 📝 Giấy phép
Dự án được phát hành theo giấy phép MIT. Xem chi tiết tại LICENSE.

---
