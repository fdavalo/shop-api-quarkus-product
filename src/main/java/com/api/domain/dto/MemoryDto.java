package com.api.domain.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
@RegisterForReflection
public class MemoryDto {
    private int size;
    private int price;
}