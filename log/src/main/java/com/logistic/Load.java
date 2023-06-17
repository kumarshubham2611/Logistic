package com.logistic;

public class Load {
    private String loadId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private int weight;
    private String comment;
    private String shipperId;
    private String date;

    public Load(String loadId, LoadRequest loadRequest) {
        this.loadId = loadId;
        this.loadingPoint = loadRequest.getLoadingPoint();
        this.unloadingPoint = loadRequest.getUnloadingPoint();
        this.productType = loadRequest.getProductType();
        this.truckType = loadRequest.getTruckType();
        this.noOfTrucks = loadRequest.getNoOfTrucks();
        this.weight = loadRequest.getWeight();
        this.comment = loadRequest.getComment();
        this.shipperId = loadRequest.getShipperId();
        this.date = loadRequest.getDate();
    }

    public String getLoadId() {
        return loadId;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public int getWeight() {
        return weight;
    }

    public String getComment() {
        return comment;
    }

    public String getShipperId() {
        return shipperId;
    }

    public String getDate() {
        return date;
    }

    public void updateLoad(LoadRequest loadRequest) {
        this.loadingPoint = loadRequest.getLoadingPoint();
        this.unloadingPoint = loadRequest.getUnloadingPoint();
        this.productType = loadRequest.getProductType();
        this.truckType = loadRequest.getTruckType();
        this.noOfTrucks = loadRequest.getNoOfTrucks();
        this.weight = loadRequest.getWeight();
        this.comment = loadRequest.getComment();
        this.date = loadRequest.getDate();
    }
}
