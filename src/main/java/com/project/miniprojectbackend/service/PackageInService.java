package com.project.miniprojectbackend.service;

import com.project.miniprojectbackend.core.PackageIn;
import com.project.miniprojectbackend.core.Recipient;
import com.project.miniprojectbackend.repository.PackageInRepository;
import com.project.miniprojectbackend.repository.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageInService {
    @Autowired
    PackageInRepository packageInRepository;

    @Autowired
    RecipientRepository recipientRepository;

    public PackageIn addBooking(PackageIn packageIn) {
        Recipient recipient = new Recipient();
        recipient.setRecipient(packageIn.getRecipient());

        packageIn.setStatus("No Pickup");
        packageIn.setDate("null");
        return packageInRepository.save(packageIn);
    }

    public List<PackageIn> showAllBooking() {
        return packageInRepository.findAll();
    }
}