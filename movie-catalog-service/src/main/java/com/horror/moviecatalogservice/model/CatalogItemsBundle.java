package com.horror.moviecatalogservice.model;

import java.util.List;

public class CatalogItemsBundle {

    List<CatalogItem> catalogItems;

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }

    public void setCatalogItems(List<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }
}
