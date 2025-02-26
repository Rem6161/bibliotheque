package com.example.bibliotheque.entities;



import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;




@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;
    private LocalDate dateCreation;

    private boolean enabled;

    protected BaseEntity() {
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets version.
     *
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * Get date creation
     *
     * @return the date creation
     */
    public LocalDate getDateCreation() {
        return dateCreation;
    }

    /**
     * set date creation
     *
     * @param dateCreation the creation date
     */
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * Event on pre persist
     */
    @PrePersist
    public void prePersistDate() {
        if (dateCreation == null) {
            setDateCreation(LocalDate.now());
        }
    }

    /**
     * Event on pre update
     */
    @PreUpdate
    public void preUpdateDate() {
        if (dateCreation == null) {
            setDateCreation(getDateCreation());
        }
    }



}