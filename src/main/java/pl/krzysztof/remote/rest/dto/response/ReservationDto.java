package pl.krzysztof.remote.rest.dto.response;

import pl.krzysztof.domain.model.ReservationStatusType;
import pl.krzysztof.remote.rest.dto.request.ClientReservationDto;
import pl.krzysztof.remote.rest.dto.request.HotelReservationDto;

import java.util.List;

public class ReservationDto {

    private Integer id;
    private ReservationStatusType status;
    private List<HotelReservationDto> pizzas;
    private ClientReservationDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<HotelReservationDto> getHotels() {
        return hotels;
    }

    public void setPizzas(List<HotelReservationDto> hotels) {
        this.pizzas = pizzas;
    }

    public ClientReservationDto getPerson() {
        return person;
    }

    public void setPerson(ClientReservationDto person) {
        this.person = person;
    }
}
