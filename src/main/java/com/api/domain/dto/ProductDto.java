package com.api.domain.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
@RegisterForReflection
public class ProductDto {
    private Long id;
    private String name;
    private List<ImageDto> image;
    private List<MemoryDto> memory;
    private String display;
    private String waterResistant;
    private String camera;
    private String frontCamera;
    private String futures;
    private String processor;
    private String charging;
}
