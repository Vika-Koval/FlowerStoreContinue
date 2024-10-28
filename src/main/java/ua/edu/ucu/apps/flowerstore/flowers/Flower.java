package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Flower extends Item{
    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower otherFlower) {
        this.price = otherFlower.price;
        this.sepalLength = otherFlower.sepalLength;
        this.color = otherFlower.color;
        this.flowerType = otherFlower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public Flower() {
    }
}

