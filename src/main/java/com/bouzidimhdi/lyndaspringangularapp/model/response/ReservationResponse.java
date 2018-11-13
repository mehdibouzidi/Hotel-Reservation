package com.bouzidimhdi.lyndaspringangularapp.model.response;

import com.bouzidimhdi.lyndaspringangularapp.model.Links;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationResponse {

    private Long id;
    private Integer roomNumber;
    private Integer price;
    private Links links;

    public ReservationResponse(){

    }

    public ReservationResponse(Integer roomNumber, Integer price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }
}
