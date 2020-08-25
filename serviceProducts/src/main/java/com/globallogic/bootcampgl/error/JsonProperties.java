package com.globallogic.bootcampgl.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JsonProperties {
	private String message;
	private Integer status_code;
	private String uri;
}