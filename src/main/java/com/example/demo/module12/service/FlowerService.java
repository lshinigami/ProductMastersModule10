package com.example.demo.module12.service;


import com.example.demo.module12.model.dto.FlowerDto;

import java.util.List;

public interface FlowerService {
    List<FlowerDto> getAllFlowers();

    FlowerDto getFlowerById(Integer id);

    FlowerDto createFlower(FlowerDto flower);
}
