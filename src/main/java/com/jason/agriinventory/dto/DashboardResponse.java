package com.jason.agriinventory.dto;

public class DashboardResponse {

    private long totalProducts;
    private long lowStockProducts;

    public DashboardResponse(long totalProducts, long lowStockProducts) {
        this.totalProducts = totalProducts;
        this.lowStockProducts = lowStockProducts;
    }

    public long getTotalProducts() {
        return totalProducts;
    }

    public long getLowStockProducts() {
        return lowStockProducts;
    }
}