package com.zabbix4j.map;

import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MapCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public MapCreateRequest() {
        setMethod("map.create");
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

        public void addMapLink(MapLinkObject obj) {
            links = ZbxListUtils.add(links, obj);
        }

        public void addMapElement(MapElementObject obj) {
            selements = ZbxListUtils.add(selements, obj);
        }

        public void addMapURL(MapURLObject obj) {
            urls = ZbxListUtils.add(urls, obj);
        }

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
