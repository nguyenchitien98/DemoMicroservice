# 📌 DemoMicroservice

## 📖 Giới thiệu
Project nhỏ dành cho luyện tập microservice

## 🚀 Tính năng chính
Eureka Server – Dùng để đăng ký và tìm kiếm các service.
Service A – Gọi đến Service B thông qua Eureka.
Service B – Trả về dữ liệu cho Service A.
API Gateway – Định tuyến request đến các service.

# Clone repository
git clone https://github.com/nguyenchitien98/DemoMicroservice.git

# Cài đặt dependencies và JDK 21

# Chạy dự án
mvn spring-boot:run -f eureka-server
mvn spring-boot:run -f service-b
mvn spring-boot:run -f service-a
mvn spring-boot:run -f api-gateway
