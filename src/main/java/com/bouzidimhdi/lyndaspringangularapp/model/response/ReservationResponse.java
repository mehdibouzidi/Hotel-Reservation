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
        super();
    }

    public ReservationResponse(Integer roomNumber, Integer price) {
        super();
        this.roomNumber = roomNumber;
        this.price = price;
    }
}
