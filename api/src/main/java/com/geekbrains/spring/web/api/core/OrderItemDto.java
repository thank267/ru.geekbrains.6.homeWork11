package com.geekbrains.spring.web.api.core;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

@Schema(description = "Модель одной позиции заказа")
public class OrderItemDto {

    @Schema(description = "ID одной позиции заказа (ID продукта)", required = true, example = "1")
    private Long productId;

    @Schema(description = "Название одной позиции заказа (Название продукта)", required = true, maxLength = 255, minLength = 3, example = "Коробка конфет")
    private String productTitle;

    @Schema(description = "Количество заказанных позиций", required = true, example = "10")
    private int quantity;

    @Schema(description = "Цена одной позиции заказа", required = true, example = "120.00")
    private BigDecimal pricePerProduct;

    @Schema(description = "Цена заказанных   позиций", required = true, example = "1200.00")
    private BigDecimal price;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPricePerProduct() {
        return pricePerProduct;
    }

    public void setPricePerProduct(BigDecimal pricePerProduct) {
        this.pricePerProduct = pricePerProduct;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OrderItemDto() {
    }

    public OrderItemDto(Long productId, String productTitle, int quantity, BigDecimal pricePerProduct, BigDecimal price) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.quantity = quantity;
        this.pricePerProduct = pricePerProduct;
        this.price = price;
    }
}
