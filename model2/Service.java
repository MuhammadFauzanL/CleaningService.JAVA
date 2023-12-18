package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Service {
    private String idService;
    private Customer customer;
    private Vendor vendor;
    private int total;
    private LocalDate tanggal;
    private ArrayList<serviceOrder> serviceOrders;



    /**
     * @return String return the idPenjualan
     */
    public String getIdService() {
        return idService;
    }

    /**
     * @param idPenjualan the idPenjualan to set
     */
    public Service setIdService(String idService) {
        this.idService = idService;
        return this;
    }

    /**
     * @return Pembeli return the pembeli
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param pembeli the pembeli to set
     */
    public Service setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * @return Penjual return the penjual
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * @param penjual the penjual to set
     */
    public Service setPenjual(Vendor vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * @return int return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public Service setTotal(int total) {
        this.total = total;
        return this;
    }

    /**
     * @return LocalDate return the tanggal
     */
    public LocalDate getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public Service setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }


    /**
     * @return ArrayList<DetilPenjualan> return the detilPenjualans
     */
    public ArrayList<serviceOrder> getServiceOrders() {
        return serviceOrders;
    }

    /**
     * @param detilPenjualans the detilPenjualans to set
     */
    public Service setDetilPenjualans(ArrayList<serviceOrder> serviceOrders) {
        this.serviceOrders = serviceOrders;
        return this;
    }

}