package com.wohr.orderservice.dto;

import com.wohr.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {

        private List<OrderLineItemsDto> orderLineItemsDtoList;
}
