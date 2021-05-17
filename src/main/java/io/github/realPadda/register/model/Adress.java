package io.github.realPadda.register.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Adress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String descAdress;
    private String zipCode;
    private Boolean status;

    //Foreign Key client-adress//
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;


    public Adress(){}

    public Adress(String descAdress, String zipCode){
        this.descAdress = descAdress;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescAdress() {
        return descAdress;
    }

    public void setDescAdress(String descAdress) {
        this.descAdress = descAdress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "Adress{"+
                ", id=" + Id +'\'' +
                ", descAdress" + descAdress + '\'' +
                ", zipCode" + zipCode + '\''+
                '}';
    }

}
