package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "restaurant")
public class RestaurantEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<MealsEntity> meals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantEntity restaurantEntity = (RestaurantEntity) o;
        return Objects.equals(id, restaurantEntity.id) &&
                Objects.equals(name, restaurantEntity.name) &&
                Objects.equals(description, restaurantEntity.description) &&
                Objects.equals(image, restaurantEntity.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, image);
    }

    @Override
    public String toString() {
        return "RestaurantEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description=" + description +
                ", image=" + image +
                '}';
    }
}
