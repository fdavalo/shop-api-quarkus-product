package com.api.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Data
@RegisterForReflection
public class ImagePath {

    private String img;
}
