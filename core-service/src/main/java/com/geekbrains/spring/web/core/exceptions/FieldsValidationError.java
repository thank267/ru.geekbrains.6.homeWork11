package com.geekbrains.spring.web.core.exceptions;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@Schema(description = "Модель ошибки валидации")
public class FieldsValidationError {

    @Schema(description = "Список ошибок валидации", required = true, example = "Цена продукта не может быть меньше 1   ")
    private List<String> errorFieldsMessages;

    public FieldsValidationError(List<String> errorFieldsMessages) {
        this.errorFieldsMessages = errorFieldsMessages;
    }
}
