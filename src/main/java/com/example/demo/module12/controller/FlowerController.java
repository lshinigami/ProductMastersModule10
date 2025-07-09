package com.example.demo.module12.controller;

import com.example.demo.module12.model.dto.FlowerDto;
import com.example.demo.module12.service.FlowerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")
@RequiredArgsConstructor
public class FlowerController {
    private final FlowerService flowerService;

    @GetMapping()
    public List<FlowerDto> getFlowers() {
        return flowerService.getAllFlowers();
    }

    @GetMapping("/{id}")
    public FlowerDto getFlowerById(@PathVariable Integer id) {
        return flowerService.getFlowerById(id);
    }

    @PostMapping()
    public FlowerDto createFlower(@RequestBody FlowerDto flower) {
        return flowerService.createFlower(flower);
    }
}
