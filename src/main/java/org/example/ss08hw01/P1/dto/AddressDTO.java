package org.example.ss08hw01.P1.dto;

import jakarta.validation.constraints.NotBlank;

public class AddressDTO {
    @NotBlank(message = "Tên người nhận không được để trống")
    private String receiverName;

    @NotBlank(message = "Địa chỉ chi tiết không được để trống")
    private String detailedAddress;

    // getters, setters...
}
