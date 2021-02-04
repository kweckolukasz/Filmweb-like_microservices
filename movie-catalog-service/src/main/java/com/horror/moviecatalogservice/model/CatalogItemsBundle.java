package com.horror.moviecatalogservice.model;

import java.util.List;

public class CatalogItemsBundle {

    private List<CatalogItemUserAndAvScores> catalogItems;

    public List<CatalogItemUserAndAvScores> getCatalogItems() {
        return catalogItems;
    }

    public void setCatalogItems(List<CatalogItemUserAndAvScores> catalogItems) {
        this.catalogItems = catalogItems;
    }
}
