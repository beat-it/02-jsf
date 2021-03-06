package org.beat.it.frontend.dto.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.beat.it.frontend.dto.ImageDTO;

import java.io.Serializable;

/**
 * @author Martin Petruna
 */
@Data
@AllArgsConstructor
public class CartItemDTO implements Serializable {

    private String productId;
    private String name;
    private ImageDTO image;
    private Integer quantity;
    private Double price;
    private String currency = "EUR";
    private Double totalPrice;
}
