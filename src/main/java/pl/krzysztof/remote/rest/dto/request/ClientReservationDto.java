package pl.krzysztof.remote.rest.dto.request;

public class ClientReservationDto {
    private String name;
    private String address;
    private String phone;
    private Integer floor;

    public ClientReservationDto() {
    }

    public ClientReservationDto(String name, String address, String phone, Integer floor) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
