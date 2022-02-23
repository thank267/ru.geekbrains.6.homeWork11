package com.geekbrains.spring.web.api.exceptions;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Модель ошибки")
public class AppError {
    @Schema(description = "Код ошибки", required = true, example = "404")
    private String code;

    @Schema(description = "Сообщение ошибки", required = true, example = "Продукт не найден id: 100")
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AppError() {
    }

    public AppError(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
