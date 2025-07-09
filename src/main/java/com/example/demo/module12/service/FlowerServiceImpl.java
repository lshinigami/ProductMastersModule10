package com.example.demo.module12.service;

import com.example.demo.module12.model.FlowerMapper;
import com.example.demo.module12.model.dto.FlowerDto;
import com.example.demo.module12.model.entity.Flower;
import com.example.demo.module12.model.exception.FlowerNotFoundException;
import com.example.demo.module12.repository.FlowerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlowerServiceImpl implements FlowerService {

    private final FlowerRepository flowerRepository;
    private final FlowerMapper mapper;
    private final CategoryService categoryService;

    @Override
    public List<FlowerDto> getAllFlowers() {
        List<Flower> flowers = flowerRepository.findAll();
        return flowers.stream()
                .map(mapper::fromEntityToDto)
                .toList();
    }

    @Override
    public FlowerDto getFlowerById(Integer id) {
        Flower flower = flowerRepository.findById(id).orElseThrow(() -> new FlowerNotFoundException("Flower is not exists"));
        return mapper.fromEntityToDto(flower);
    }

    @Override
    public FlowerDto createFlower(FlowerDto flowerDto) {
        Flower flower = Flower.builder()
                .name(flowerDto.getName())
                .price(flowerDto.getPrice())
                .size(flowerDto.getSize())
                .category(categoryService.getCategoryById(flowerDto.getCategory().getId()))
                .build();
        flower = flowerRepository.save(flower);
        return mapper.fromEntityToDto(flower);
    }


}
