package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;


// @RestController là một chú thích quan trọng trong Spring Boot. Khác với @Controller, nó không trả về một template mà thay vào đó trả về dữ liệu dưới dạng JSON.
// Các đối tượng được trả về sẽ tự động được Spring Boot chuyển đổi thành JSON. Bạn có thể trả về nhiều loại đối tượng như List, Map, và nó sẽ được chuyển đổi một cách tự động. Spring Boot sử dụng Jackson converter mặc định để thực hiện việc này. Nếu bạn muốn tùy chỉnh kiểu dữ liệu trả về, bạn có thể sử dụng đối tượng ResponseEntity.

@RestController
@RequestMapping(value="/cloudvendor")
public class CloudVendorApiService {
    // GetMapping => Phương thức get
    // GetMapping("{vendorId}") tức là {vendorId} sẽ được append vào url gốc => /cloudvendor/{vendorId}
    // @PathVariable (name = "vendorId") sẽ cho ta lấy giá trị {vendorId} trong url /cloudvendor/{vendorId} và parse nó sang kiểu string
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable(name = "vendorId") String vendorId) {
//        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxxxx");
        System.out.println("Phương thức 1 chạy");
        System.out.println(vendorId);
        return cloudVendor;
    }

    // RequestBody sẽ tự động chuyển đổi kiểu dữ liệu gửi lên (có thể dạng JSON) sang kiểu dữ liệu object của JAVA, khi đó các properties của json phải cùng tên với các project properties trong object của java
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        System.out.println("cloudVendor");
        System.out.println(cloudVendor.getVendorName());

        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable(name="vendorId") String vendorId) {
        System.out.println("vendorId = ");
        System.out.println(vendorId);
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}
