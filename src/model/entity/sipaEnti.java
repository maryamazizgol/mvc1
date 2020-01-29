package model.entity;

public class sipaEnti {
    private Long id;
    private String name;
    private String car ;
    private Long price;

    public Long getId() {
        return id;
    }

    public sipaEnti setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public sipaEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getCar() {
        return car;
    }

    public sipaEnti setCar(String car) {
        this.car = car;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public sipaEnti setPrice(Long price) {
        this.price = price;
        return this;
    }
}
