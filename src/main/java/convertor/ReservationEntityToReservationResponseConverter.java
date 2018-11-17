package convertor;

import com.bouzidimhdi.lyndaspringangularapp.entity.ReservationEntity;
import com.bouzidimhdi.lyndaspringangularapp.model.response.ReservationResponse;
import org.springframework.core.convert.converter.Converter;

public class ReservationEntityToReservationResponseConverter implements Converter<ReservationEntity, ReservationResponse> {

    @Override
    public ReservationResponse convert(ReservationEntity source) {
        ReservationResponse reservationResponse = new ReservationResponse();
        reservationResponse.setCheckin(source.getCheckin());
        reservationResponse.setCheckout(source.getCheckout());

        return reservationResponse;
    }
}
