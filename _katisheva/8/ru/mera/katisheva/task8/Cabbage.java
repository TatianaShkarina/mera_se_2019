package ru.mera.katisheva.task8;

class Cabbage implements Vegetables {
    private long count;
    private String title="Cabbage";
    private long quantity;
    private String producingCountry;

    Cabbage(long count, long quantity, String producingCountry){
        this.count=count;
        this.quantity=quantity;
        this.producingCountry=producingCountry;
    }

    @Override
    public String getProducingCountry() {
        return producingCountry;
    }

    @Override
    public long getCount() {
        return count;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public long getQuantity() {
        return quantity;
    }

    public void increaseQuantityByOne() {
        quantity++;
    }
    @Override
    public String toString() {
        return title+", count: "+count+"rub., quantity: "+quantity+"boxes, producing country: "+producingCountry;
    }
}
