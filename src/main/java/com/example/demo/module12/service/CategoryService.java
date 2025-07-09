package com.example.demo.module12.service;

import com.example.demo.module12.model.dto.CategoryDto;
import com.example.demo.module12.model.entity.Category;

import java.util.List;

public interface CategoryService {
    CategoryDto getCategoryDtoById(Integer id);

    Category getCategoryById(Integer id);

    List<CategoryDto> getAllCategories();

    CategoryDto createCategory(CategoryDto categoryDto);
}
