package com.geekbrains.spring.web.core.properties;

import lombok.Data;

@Data
public class TimeOut {
	private Integer connect;
	private Integer read;
	private Integer write;
}
