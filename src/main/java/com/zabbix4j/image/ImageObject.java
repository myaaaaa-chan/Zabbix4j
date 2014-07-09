package com.zabbix4j.image;

/**
 * @author Suguru Yajima
 */
public class ImageObject {

    private Integer imageid;
    private String name;
    private Integer imagetype;

    public static enum IMAGE_TYPE {
        ICON(1),BACKGROUND_IMAGE(2);
        public int value;
        private IMAGE_TYPE(int value) {
            this.value = value;
        }
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets imageid.
     *
     * @return Value of imageid.
     */
    public Integer getImageid() {
        return imageid;
    }

    /**
     * Sets new imagetype.
     *
     * @param imagetype New value of imagetype.
     */
    public void setImagetype(Integer imagetype) {
        this.imagetype = imagetype;
    }

    /**
     * Gets imagetype.
     *
     * @return Value of imagetype.
     */
    public Integer getImagetype() {
        return imagetype;
    }

    /**
     * Sets new imageid.
     *
     * @param imageid New value of imageid.
     */
    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }
}
