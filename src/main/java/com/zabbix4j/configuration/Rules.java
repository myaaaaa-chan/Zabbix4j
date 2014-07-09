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

package com.zabbix4j.configuration;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class Rules {
    private Applications applications = new Applications();
    private Applications discoveryRules = new Applications();
    private Applications graphs = new Applications();
    private Applications groups = new Applications();
    private Applications hosts = new Applications();
    private Applications images = new Applications();
    private Applications items = new Applications();
    private Applications maps = new Applications();
    private Applications screens = new Applications();
    private Applications templateLinkage = new Applications();
    private Applications templates = new Applications();
    private Applications templateScreens = new Applications();
    private Applications triggers = new Applications();

    public Rules() {
    }

    public Applications getApplications() {
        return applications;
    }

    public void setApplications(Applications applications) {
        this.applications = applications;
    }

    public Applications getDiscoveryRules() {
        return discoveryRules;
    }

    public void setDiscoveryRules(Applications discoveryRules) {
        this.discoveryRules = discoveryRules;
    }

    public Applications getGraphs() {
        return graphs;
    }

    public void setGraphs(Applications graphs) {
        this.graphs = graphs;
    }

    public Applications getGroups() {
        return groups;
    }

    public void setGroups(Applications groups) {
        this.groups = groups;
    }

    public Applications getHosts() {
        return hosts;
    }

    public void setHosts(Applications hosts) {
        this.hosts = hosts;
    }

    public Applications getImages() {
        return images;
    }

    public void setImages(Applications images) {
        this.images = images;
    }

    public Applications getItems() {
        return items;
    }

    public void setItems(Applications items) {
        this.items = items;
    }

    public Applications getMaps() {
        return maps;
    }

    public void setMaps(Applications maps) {
        this.maps = maps;
    }

    public Applications getScreens() {
        return screens;
    }

    public void setScreens(Applications screens) {
        this.screens = screens;
    }

    public Applications getTemplateLinkage() {
        return templateLinkage;
    }

    public void setTemplateLinkage(Applications templateLinkage) {
        this.templateLinkage = templateLinkage;
    }

    public Applications getTemplates() {
        return templates;
    }

    public void setTemplates(Applications templates) {
        this.templates = templates;
    }

    public Applications getTemplateScreens() {
        return templateScreens;
    }

    public void setTemplateScreens(Applications templateScreens) {
        this.templateScreens = templateScreens;
    }

    public Applications getTriggers() {
        return triggers;
    }

    public void setTriggers(Applications triggers) {
        this.triggers = triggers;
    }

    public class Applications {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class discoveryRules {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class graphs {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class groups {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class hosts {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class images {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class items {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class maps {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class screens {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class templateLinkage {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class templates {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class templateScreens {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }

    public class triggers {
        private Boolean createMissing = false;
        private Boolean updateExisting = false;

        public Boolean getCreateMissing() {
            return createMissing;
        }

        public void setCreateMissing(Boolean createMissing) {
            this.createMissing = createMissing;
        }

        public Boolean getUpdateExisting() {
            return updateExisting;
        }

        public void setUpdateExisting(Boolean updateExisting) {
            this.updateExisting = updateExisting;
        }
    }
}
