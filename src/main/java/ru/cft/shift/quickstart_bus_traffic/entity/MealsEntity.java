package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;
import java.util.Objects;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "meal")

public class MealsEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String descrption;

    @Column(name = "value")
    private double value;

    @Column(name = "image")
    private String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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
        MealsEntity mealsEntity = (MealsEntity) o;
        return Objects.equals(id, mealsEntity.id) &&
                Objects.equals(name, mealsEntity.name) &&
                Objects.equals(descrption, mealsEntity.descrption) &&
                Objects.equals(value, mealsEntity.value)&&
                Objects.equals(image, mealsEntity.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, descrption, value, image);
    }

    @Override
    public String toString() {
        return "MealsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description=" + descrption +
                ", value='" + value + '\'' +
                ", image='" + image +
                '}';
    }
}
