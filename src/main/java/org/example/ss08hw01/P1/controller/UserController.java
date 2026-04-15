package org.example.ss08hw01.P1.controller;

import jakarta.validation.Valid;
import org.example.ss08hw01.P1.dto.AddressDTO;
import org.example.ss08hw01.P1.model.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class UserController {

    @PostMapping("/update")
    public ResponseEntity<String> updateAddress(@Valid @RequestBody AddressDTO addressDto) {
        return ResponseEntity.ok("Cập nhật địa chỉ thành công!");
    }
}
