package com.api.resources;

import com.api.domain.Product;
import com.api.domain.dto.ProductDto;
import com.api.mapping.ProductMapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import javax.transaction.Transactional;


/**
 * Endpoint for {@link Product}-related functionality
 *
 */
@Path("/products")
@Produces("application/json")
@Consumes("application/json")
@Transactional
public class ProductResource {
    @Inject
    ProductMapper productMapper;

    @GET
    @Path("/{id}")
    public Response find(@PathParam("id") Long id) {
        return Product.findById(id)
                .map(u -> Response.ok(productMapper.toResource(u)))
                .orElseGet(() -> Response.status(NOT_FOUND))
                .build();        
    }

    @GET
    public Response findAll() {
        Stream<Product> stream = null;
        try {
            stream = Product.<Product>findAll().stream();
            return Response.ok(stream.map(u -> productMapper.toResource(u)).collect(Collectors.toList())).build();
        }
        finally {
            if (stream != null) try {stream.close();} catch (Exception e) {}
        }
  }

    @POST
    public Response create(ProductDto productDto) {
        Product product = productMapper.fromResource(productDto);
        product.persistAndFlush();
        return Response.ok(productMapper.toResource(product)).build();        
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
                return Product.findById(id)
                .map(u -> { u.delete(); return Response.ok(); })
                .orElseGet(() -> Response.status(NOT_FOUND))
                .build();                
    }
}
