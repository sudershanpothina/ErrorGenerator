package com.darshan.errorgenerator;

import java.util.Date;

/**
 * The type Error.
 */
public class Error {
    private String name;
    private String description;
    private Date date;

    /**
     * Instantiates a new Error.
     *
     * @param name        the name
     * @param description the description
     */
    public Error(String name, String description, Date date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
