package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order")
public class OrderEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<MealsEntity> meals;

    @Column(name = "time")
    private String time;

    @Column(name = "count")
    private int count;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "name")
    private String name;

    @Column(name = "roomNumber")
    private int roomNumber;

    public void setMeals(Set<MealsEntity> meals) {
        this.meals = meals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return count == that.count &&
                Objects.equals(id, that.id) &&
                Objects.equals(meals, that.meals) &&
                Objects.equals(time, that.time)&&
                Objects.equals(phone,that.phone)&&
                Objects.equals(name,that.name)&&
                Objects.equals(roomNumber,that.roomNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meals, time, count, phone, name, roomNumber);
    }

    public Set<MealsEntity> getMeals() {
        return meals;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
