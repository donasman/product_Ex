package com.study.product.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SearchProductRespDto {
	private int prodictId;
	private String productName;
	private int productPrice;
	private String productSize;
}
