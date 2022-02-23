package com.geekbrains.spring.web.api.core;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Модель контактной информации заказа")
public class OrderDetailsDto {

    @Schema(description = "Адрес доставки заказа", example = "Вишневая, 20")
    private String address;

    @Schema(description = "Телефон для связи с покупателем", example = "+7 111 111-11-11")
    private String phone;

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

    public OrderDetailsDto() {
    }

    public OrderDetailsDto(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }
}
