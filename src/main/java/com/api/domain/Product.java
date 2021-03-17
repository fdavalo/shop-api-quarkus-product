package com.api.domain;

import io.quarkiverse.hibernate.types.json.JsonBinaryType;
import io.quarkiverse.hibernate.types.json.JsonType;
import io.quarkiverse.hibernate.types.json.JsonTypes;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.transaction.Transactional;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import java.util.Optional;

/**
 * Product entity
 *
 */
@Data
@RegisterForReflection
@TypeDef(name = JsonTypes.JSON, typeClass = JsonType.class)
@TypeDef(name = JsonTypes.JSON_BIN, typeClass = JsonBinaryType.class)
@Entity
@Transactional
public class Product extends PanacheEntityBase {

    @Id
    @Column(name = "id")
    public Long id;

    private String name;

    @Type(type = JsonTypes.JSON_BIN)
    @Column(name = "image", columnDefinition = JsonTypes.JSON_BIN)
    private List<Image> image;

    @Type(type = JsonTypes.JSON_BIN)
    @Column(name = "memory", columnDefinition = JsonTypes.JSON_BIN)
    private List<Memory> memory;

    private String display;
    private String waterResistant;
    private String camera;
    private String frontCamera;
    private String futures;
    private String processor;
    private String charging;

    public static Optional<Product> findById(Long id) {
        return Optional.ofNullable(find("id", id).firstResult());
    }        
}
