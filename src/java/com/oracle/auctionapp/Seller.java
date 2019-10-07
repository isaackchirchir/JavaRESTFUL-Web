/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.auctionapp;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@XmlRootElement
public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    private String Email;

    /**
     * Get the value of Email
     *
     * @return the value of Email
     */
    public String getEmail() {
        return Email;
    }

    private String LastName ;

    /**
     * Get the value of Last Name
     *
     * @return the value of Last Name
     */
    public String getLastName() {
        return LastName;
    }

    private String FirstName;

    /**
     * Get the value of FirstName
     *
     * @return the value of FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Set the value of FirstName
     *
     * @param FirstName new value of FirstName
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Set the value of Last Name
     *
     * @param Last Name new value of Last Name
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Set the value of Email
     *
     * @param Email new value of Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seller)) {
            return false;
        }
        Seller other = (Seller) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oracle.auctionapp.Seller[ id=" + id + " ]";
    }
    
}
