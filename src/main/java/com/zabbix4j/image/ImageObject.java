/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
