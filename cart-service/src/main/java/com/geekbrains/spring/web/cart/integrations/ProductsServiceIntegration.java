package com.geekbrains.spring.web.cart.integrations;

import com.geekbrains.spring.web.api.core.ProductDto;
import com.geekbrains.spring.web.api.exceptions.AppError;
import com.geekbrains.spring.web.api.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductsServiceIntegration {
    private final WebClient productServiceWebClient;

    public Optional<ProductDto> findById(Long id) {
        ProductDto productDto = productServiceWebClient.get().uri("/api/v1/products/" + id).retrieve().onStatus(HttpStatus::is4xxClientError, clientResponse -> clientResponse.bodyToMono(AppError.class).map(body -> new ResourceNotFoundException(body.getMessage()))).onStatus(HttpStatus::is5xxServerError, clientResponse -> clientResponse.bodyToMono(AppError.class).map(body -> new HttpServerErrorException(HttpStatus.GATEWAY_TIMEOUT, body.getMessage()))).bodyToMono(ProductDto.class).block();
        return Optional.ofNullable(productDto);
    }
}
