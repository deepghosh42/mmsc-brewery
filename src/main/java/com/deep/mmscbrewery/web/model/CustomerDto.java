package com.deep.mmscbrewery.web.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private UUID customerId;
    private String customerName;

    public static CustomerDtoBuilder builder() {
        return new CustomerDtoBuilder();
    }


    public static class CustomerDtoBuilder {
        private UUID customerId;
        private String customerName;

        CustomerDtoBuilder() {
        }

        public CustomerDtoBuilder customerId(UUID customerId) {
            this.customerId = customerId;
            return this;
        }

        public CustomerDtoBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerDto build() {
            return new CustomerDto(customerId, customerName);
        }

        public String toString() {
            return "CustomerDto.CustomerDtoBuilder(customerId=" + this.customerId + ", customerName=" + this.customerName + ")";
        }
    }
}
