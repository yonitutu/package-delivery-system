package com.example.package_delivery_system.services;

import com.example.package_delivery_system.data.dtos.packageDtos.CreatePackageDto;
import com.example.package_delivery_system.data.dtos.packageDtos.PackageResponseDto;

public interface PackageService {

    PackageResponseDto addPackage(CreatePackageDto createPackageDto);


}