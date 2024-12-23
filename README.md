- Download jdk 21

# Lý thuyết

- https://kungfutech.edu.vn/bai-viet/spring-boot/restful-api-rest-controller-request-body-path-variable
- @RestController là một ký hiệu tiện lợi hơn trong việc kết hợp @Controller và @ResponseBody
- Chúng ta có thể ký hiệu các controllers cổ điển với ký hiệu @Controller. Nó là một đặc tả đơn giản của class @Component, nó cho phép chúng ta tự động phát hiện các class được thực hiện thông qua việc quét các class.
- Hiển nhiên chúng ta sử dụng @Controller kết hợp với @RequestMapping cho các phương thức xử lý (handling) request.
- @RestController là một phiên bản đặc biệt của controller. Nó bao gồm @Controller và @ResponseBody. Mỗi phương thức xử lý request của class controller sẽ tự động tuần tự hoá đối tượng trả về vào HttpResponse.


- @RestController là một chú thích quan trọng trong Spring Boot. Khác với @Controller, nó không trả về một template mà thay vào đó trả về dữ liệu dưới dạng JSON.
- Khi bạn xây dựng các API, thông tin từ phía client thường được gửi trong phần Body của request dưới dạng JSON.
- Spring Boot sẽ tự động chuyển đổi chuỗi JSON trong request thành một đối tượng Java. Bạn chỉ cần sử dụng chú thích @RequestBody để cho Spring Boot biết bạn muốn chuyển đổi JSON thành đối tượng Java.