package Sem6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Notebook {

    private String name;
    private int amountRAM;
    private String operatingSystem;
    private int price;
    private String model;
    private Double diagonal;
    private int amountHDD;


    Notebook(String name, int amountRAM, String operatingSystem, int price, String model, double diagonal, int amountHDD) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.model = model;
        this.diagonal = diagonal;
        this.amountHDD = amountHDD;

    }

    @Override
    public String toString() {
        return  "(" + name + ") " + ("|")+
                " Модель: " + model + ("|") +
                " Объем опeративной памяти в ГБ: " + amountRAM + ("|")+
                " Объем ЖД в ГБ: " + amountHDD + ("|")+
                " Операционная система: " + operatingSystem  + ("|")+
                " Цена: " + price + ("|")+
                " Диагональ: " + diagonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getamountHDD() {
        return amountHDD;
    }

    public int getAmountRAM() {
        return amountRAM;
    }


    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }
    
    public void setamountHDD(int amountHDD) {
        this.amountHDD = amountHDD;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

}