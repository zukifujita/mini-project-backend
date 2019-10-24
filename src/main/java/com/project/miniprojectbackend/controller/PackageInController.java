package com.project.miniprojectbackend.controller;

import com.project.miniprojectbackend.core.PackageIn;
import com.project.miniprojectbackend.service.PackageInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class PackageInController {
    @Autowired
    PackageInService packageInService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public PackageIn addBooking(@RequestBody PackageIn packageIn) {
        return packageInService.addBooking(packageIn);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<PackageIn> showAllBooking() {
        return packageInService.showAllBooking();
    }
}
