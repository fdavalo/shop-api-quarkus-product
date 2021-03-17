package com.api.mapping;

import org.mapstruct.Mapper;
import com.api.config.MappingConfig;
import com.api.domain.Product;
import com.api.domain.dto.ProductDto;
import com.api.domain.Memory;
import com.api.domain.dto.MemoryDto;
import com.api.domain.Image;
import com.api.domain.dto.ImageDto;
import com.api.domain.ImagePath;
import com.api.domain.dto.ImagePathDto;

/**
 * Performs mapping between {@link Product} entity and respective data transfer object {@link ProductDto}
 *
 */
@Mapper(config = MappingConfig.class)
public interface ProductMapper {
    /**
     * Maps {@link Product} entity to {@link ProductDto}
     *
     * @param product entity to be mapped
     * @return mapped dto
     */
    ProductDto toResource(Product product);

    /**
     * Maps {@link ProductDto} to {@link Product} entity
     *
     * @param productDto to be mapped
     * @return mapped entity
     */
    Product fromResource(ProductDto productDto);

    /**
     * Maps {@link Memory} entity to {@link MemoryDto}
     *
     * @param memory entity to be mapped
     * @return mapped dto
     */
    MemoryDto toResource(Memory memory);

    /**
     * Maps {@link MemoryDto} to {@link Memory} entity
     *
     * @param memoryDto to be mapped
     * @return mapped entity
     */
    Memory fromResource(MemoryDto memoryDto);    

    /**
     * Maps {@link Image} entity to {@link ImageDto}
     *
     * @param image entity to be mapped
     * @return mapped dto
     */
    ImageDto toResource(Image image);

    /**
     * Maps {@link ImageDto} to {@link Image} entity
     *
     * @param imageDto to be mapped
     * @return mapped entity
     */
    Image fromResource(ImageDto imageDto);  
    
    /**
     * Maps {@link ImagePath} entity to {@link ImagePathDto}
     *
     * @param imagePath entity to be mapped
     * @return mapped dto
     */
    ImagePathDto toResource(ImagePath imagePath);

    /**
     * Maps {@link ImagePathDto} to {@link ImagePath} entity
     *
     * @param imagePathDto to be mapped
     * @return mapped entity
     */
    ImagePath fromResource(ImagePathDto imagePathDto);    

}