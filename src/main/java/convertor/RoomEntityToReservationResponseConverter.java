package convertor;

import com.bouzidimhdi.lyndaspringangularapp.entity.RoomEntity;
import com.bouzidimhdi.lyndaspringangularapp.model.Links;
import com.bouzidimhdi.lyndaspringangularapp.model.Self;
import com.bouzidimhdi.lyndaspringangularapp.model.response.ReservationResponse;
import com.bouzidimhdi.lyndaspringangularapp.rest.ResourceConstants;
import org.springframework.core.convert.converter.Converter;



public class RoomEntityToReservationResponseConverter implements Converter<RoomEntity, ReservationResponse>{

    @Override
    public ReservationResponse convert(RoomEntity source) {
        // TODO Auto-generated method stub

        ReservationResponse reservationResponse = new ReservationResponse();
        reservationResponse.setRoomNumber(source.getRoomNumber());
        reservationResponse.setPrice( Integer.valueOf(source.getPrice()) );

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
        links.setSelf(self);

        reservationResponse.setLinks(links);

        return reservationResponse;
    }



}

/*

public class RoomEntityToReservationResponseConverter implements Converter<RoomEntity, ReservationResponse> {


    @Override
    public ReservationResponse convert(RoomEntity source) {
        // TODO Auto-generated method stub

        ReservationResponse reservationResponse = new ReservationResponse();
        reservationResponse.setRoomNumber(source.getRoomNumber());
        reservationResponse.setPrice( Integer.valueOf(source.getPrice()) );

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
        links.setSelf(self);

        reservationResponse.setLinks(links);

        return reservationResponse;
    }

}
*/
