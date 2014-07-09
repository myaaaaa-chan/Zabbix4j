package com.zabbix4j.map;

import com.zabbix4j.ZabbixApiRequest;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MapUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public MapUpdateRequest() {
        setMethod("map.update");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends MapObject {

        private List<MapLinkObject> links;
        private List<MapElementObject> selements;
        private List<MapURLObject> urls;

        /**
         * Gets links.
         *
         * @return Value of links.
         */
        public List<MapLinkObject> getLinks() {
            return links;
        }

        /**
         * Sets new links.
         *
         * @param links New value of links.
         */
        public void setLinks(List<MapLinkObject> links) {
            this.links = links;
        }

        /**
         * Gets selements.
         *
         * @return Value of selements.
         */
        public List<MapElementObject> getSelements() {
            return selements;
        }

        /**
         * Sets new selements.
         *
         * @param selements New value of selements.
         */
        public void setSelements(List<MapElementObject> selements) {
            this.selements = selements;
        }

        /**
         * Gets urls.
         *
         * @return Value of urls.
         */
        public List<MapURLObject> getUrls() {
            return urls;
        }

        /**
         * Sets new urls.
         *
         * @param urls New value of urls.
         */
        public void setUrls(List<MapURLObject> urls) {
            this.urls = urls;
        }
    }
}
