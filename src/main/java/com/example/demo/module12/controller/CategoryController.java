package com.example.demo.module12.controller;

import com.example.demo.module12.model.dto.CategoryDto;
import com.example.demo.module12.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/all")
    public List<CategoryDto> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping()
    public CategoryDto createCategory(@RequestBody CategoryDto categoryDto) {
        return  categoryService.createCategory(categoryDto);
    }
}
