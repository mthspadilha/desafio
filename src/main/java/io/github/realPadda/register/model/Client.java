package io.github.realPadda.register.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column
    private String nameClient;
    @Column(unique = true)
    private String cpfClient;

    //Foreign Keys
    @ManyToOne
    @JoinColumn(name="id_city")
    private City city;

    @OneToMany(mappedBy = "client")
    private Set<Adress> adresses = new HashSet<>();

    @OneToMany(mappedBy ="client")
    private Set<Phone> phones = new HashSet<>();
    //--------------

    public Client(){}

    public Client(String nameClient, String cpfClient, City city, Adress adresses, Phone phones){
        this.nameClient = nameClient;
        this.cpfClient = cpfClient;
        this.city = city;

    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getCpfClient() {
        return cpfClient;
    }

    public void setCpfClient(String cpfClient) {
        this.cpfClient = cpfClient;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(Set<Adress> adresses) {
        this.adresses = adresses;
    }



    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Long getCitie(){
        return city.getId();
    }
}

