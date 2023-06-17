package com.logistic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Load {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private int weight;
    private String comment;
    private String shipperId;
    private String date;

    // Constructors, getters, and setters

    public Load() {
    }
    
    

    public Load(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
                int weight, String comment, String shipperId, String date) {
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId;
        this.date = date;
    }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getLoadingPoint() {
		return loadingPoint;
	}



	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}



	public String getUnloadingPoint() {
		return unloadingPoint;
	}



	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}



	public String getProductType() {
		return productType;
	}



	public void setProductType(String productType) {
		this.productType = productType;
	}



	public String getTruckType() {
		return truckType;
	}



	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}



	public int getNoOfTrucks() {
		return noOfTrucks;
	}



	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getShipperId() {
		return shipperId;
	}



	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}

   
    
}
