package com.geekbrains.spring.web.api.core;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.List;

@Schema(description = "Модель заказа")
public class OrderDto {

    @Schema(description = "ID заказа", required = true, example = "1")
    private Long id;

    @Schema(description = "Имя пользователя, сделавшего заказ", required = true, maxLength = 255, minLength = 3, example = "Bob")
    private String username;

    @Schema(description = "Список позиций заказа", required = true, example = "[{\"productId\":1,\"productTitle\":\"Коробка конфет\", \"quantity\":10, \"pricePerProduct\":120, \"price\":1200}]")
    private List<OrderItemDto> items;

    @Schema(description = "Цена заказа", required = true, example = "1200.00")
    private BigDecimal totalPrice;

    @Schema(description = "Адрес доставки заказа", example = "Вишневая, 20")
    private String address;

    @Schema(description = "Телефон для связи с покупателем", example = "+7 111 111-11-11")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDto> items) {
        this.items = items;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OrderDto() {
    }

    public OrderDto(Long id, String username, List<OrderItemDto> items, BigDecimal totalPrice, String address, String phone) {
        this.id = id;
        this.username = username;
        this.items = items;
        this.totalPrice = totalPrice;
        this.address = address;
        this.phone = phone;
    }
}
