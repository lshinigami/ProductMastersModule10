package com.example.demo.module12.service;

import com.example.demo.module12.model.FlowerMapper;
import com.example.demo.module12.model.dto.CategoryDto;
import com.example.demo.module12.model.entity.Category;
import com.example.demo.module12.model.exception.CategoryNotFoundException;
import com.example.demo.module12.repository.CategoryRepository;
import com.example.demo.module12.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final FlowerMapper mapper;

    @Override
    public CategoryDto getCategoryDtoById(Integer id) {
        return mapper.fromEntityToDto(getCategoryById(id));
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepository
                .findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Category is not found"));
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream().map(mapper::fromEntityToDto).toList();
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = Category.builder()
                .name(categoryDto.getName())
                .build();
        category = categoryRepository.save(category);
        return mapper.fromEntityToDto(category);
    }
}
