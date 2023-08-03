package com.api.parking.control.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT2")
public class ParkingSpotModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)//ID automatico
    private UUID id;//arquitetura  identificadore distribuidas

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber; //numero vaga
    @Column(nullable = false, unique = true, length = 7)
    private  String licensePlateCar;//Numero placa carro
    @Column(nullable = false, length = 70)
    private String brandCar;//Marca carro
    @Column(nullable = false, length = 70)
    private String modelCar;//Modelo carro
    @Column(nullable = false, length = 70)
    private String colorCar;//Cor carro
    @Column(nullable = false)
    private LocalDateTime registrationDate;//Data registro inicial
    @Column(nullable = false, length = 130)
    private  String responsibleName;//Nome responsavel
    @Column(nullable = false, length = 30)
    private String apartment;//numero Apartamento
    @Column(nullable = false, length = 30)
    private String block;//Numero bloco ou torre

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
