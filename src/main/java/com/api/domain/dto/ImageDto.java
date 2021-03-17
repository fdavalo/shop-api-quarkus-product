package com.api.domain.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
@RegisterForReflection
public class ImageDto {
    private String phoneColor;
    private String color;
    private List<ImagePathDto> path;
}
