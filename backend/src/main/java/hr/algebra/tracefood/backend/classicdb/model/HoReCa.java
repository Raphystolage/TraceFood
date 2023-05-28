package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

@Entity
@Table(name="HoReCa")
public class HoReCa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private HoReCaType type;
    private String address;

    public HoReCa() {}
    public HoReCa(Long id, HoReCaType type, String address) {
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public Long getId() {
        return id;
    }
    public HoReCaType getType() {
        return type;
    }
    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setType(HoReCaType type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
