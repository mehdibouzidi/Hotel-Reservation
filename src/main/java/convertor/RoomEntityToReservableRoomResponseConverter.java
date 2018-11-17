package convertor;

import com.bouzidimhdi.lyndaspringangularapp.entity.RoomEntity;
import com.bouzidimhdi.lyndaspringangularapp.model.Links;
import com.bouzidimhdi.lyndaspringangularapp.model.Self;
import com.bouzidimhdi.lyndaspringangularapp.model.response.ReservableRoomResponse;
import com.bouzidimhdi.lyndaspringangularapp.rest.ResourceConstants;
import org.springframework.core.convert.converter.Converter;



public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse>{

    @Override
    public ReservableRoomResponse convert(RoomEntity source) {
        // TODO Auto-generated method stub

        ReservableRoomResponse reservableRoomResponse = new ReservableRoomResponse();
        reservableRoomResponse.setRoomNumber(source.getRoomNumber());
        reservableRoomResponse.setPrice( Integer.valueOf(source.getPrice()) );

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
        links.setSelf(self);

        reservableRoomResponse.setLinks(links);

        return reservableRoomResponse;
    }



}

/*

public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservableRoomResponse> {


    @Override
    public ReservableRoomResponse convert(RoomEntity source) {
        // TODO Auto-generated method stub

        ReservableRoomResponse ReservableRoomResponse = new ReservableRoomResponse();
        ReservableRoomResponse.setRoomNumber(source.getRoomNumber());
        ReservableRoomResponse.setPrice( Integer.valueOf(source.getPrice()) );

        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
        links.setSelf(self);

        ReservableRoomResponse.setLinks(links);

        return ReservableRoomResponse;
    }

}
*/
