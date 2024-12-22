package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/cloudvendor")
public class CloudVendorApiService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
//        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxxxx");
        System.out.println("Phương thức 1 chạy");
        System.out.println(cloudVendor);
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        System.out.println("cloudVendor");
        System.out.println(cloudVendor.getVendorName());

        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created";
    }
}
