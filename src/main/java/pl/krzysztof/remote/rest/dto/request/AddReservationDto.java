package pl.krzysztof.remote.rest.dto.request;

import java.util.List;

public class AddReservationDto {
    private List<HotelReservationDto> rooms;
    private ClientOrderDto person;

    public AddOrderDto() {
    }

    public AddOrderDto(List<HotelReservationDto> rooms, ClientOrderDto person) {
        this.rooms = rooms;
        this.person = person;
    }

    public List<HotelReservationDto> getPizzas() {
        return rooms;
    }

    public void setPizzas(List<HotelReservationDto> pizzas) {
        this.rooms = rooms;
    }

    public ClientOrderDto getPerson() {
        return person;
    }

    public void setPerson(ClientOrderDto person) {
        this.person = person;
    }
}
