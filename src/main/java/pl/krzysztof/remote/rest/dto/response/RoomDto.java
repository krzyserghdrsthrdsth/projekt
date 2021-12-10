package pl.krzysztof.remote.rest.dto.response;

import pl.krzysztof.domain.model.RoomType;

import java.math.BigDecimal;

public class RoomDto {
    private Integer Id;
    private RoomType room;
    private BigDecimal price;

    public RoomDto() {
    }

    public RoomDto(Integer id, RoomType room, BigDecimal price) {
        this.Id = id;
        this.room = room;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public RoomType getRoom() {
        return room;
    }

    public void setRoom(RoomType size) {
        this.room = room;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {this.price = price;}
}
