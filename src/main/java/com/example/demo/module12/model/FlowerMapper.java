package com.example.demo.module12.model;

import com.example.demo.module12.model.dto.CategoryDto;
import com.example.demo.module12.model.dto.FlowerDto;
import com.example.demo.module12.model.entity.Category;
import com.example.demo.module12.model.entity.Flower;
import org.springframework.stereotype.Component;

@Component
public class FlowerMapper {

    public FlowerDto fromEntityToDto(Flower flower) {
        return FlowerDto.builder()
                .id(flower.getId())
                .name(flower.getName())
                .price(flower.getPrice())
                .size(flower.getSize())
                .category(fromEntityToDto(flower.getCategory()))
                .build();
    }

    public CategoryDto fromEntityToDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

}
