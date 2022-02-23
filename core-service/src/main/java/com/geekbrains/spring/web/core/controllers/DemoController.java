package com.geekbrains.spring.web.core.controllers;

import com.geekbrains.spring.web.api.dto.StringResponse;
import com.geekbrains.spring.web.core.integrations.CartServiceIntegration;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
@Tag(name = "Демонстрационный контроллер", description = "Демонстрационные методы")
public class DemoController {
    private final CartServiceIntegration cartServiceIntegration;

    @GetMapping
    @Operation(
            summary = "Тестирование получения корзины с 'username' 1",
            responses = {
                    @ApiResponse(
                            description = "Успешный ответ", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = StringResponse.class))
                    )
            }
    )
    public StringResponse demo() {
        cartServiceIntegration.getUserCart("1");
        return new StringResponse("OK");
    }
}
