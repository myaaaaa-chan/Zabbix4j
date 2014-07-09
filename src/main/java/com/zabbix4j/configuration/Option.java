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

import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * Created by Suguru Yajima on 2014/05/24.
 */
public class Option {

    private List<Integer> groups;
    private List<Integer> hosts;
    private List<Integer> images;
    private List<Integer> maps;
    private List<Integer> screens;

    private List<Integer> templates;

    public Option() {
    }

    public List<Integer> getHosts() {
        return hosts;
    }

    public void setHosts(List<Integer> hosts) {
        this.hosts = hosts;
    }

    public void addGroupId(Integer id) {
        groups = ZbxListUtils.add(groups, id);

    }

    public void addHostId(Integer id) {
        hosts = ZbxListUtils.add(hosts, id);

    }

    public void addImaged(Integer id) {
        images = ZbxListUtils.add(images, id);

    }

    public List<Integer> getGroups() {
        return groups;
    }

    public void setGroups(List<Integer> groups) {
        this.groups = groups;
    }

    public List<Integer> getImages() {
        return images;
    }

    public void setImages(List<Integer> images) {
        this.images = images;
    }

    public List<Integer> getMaps() {
        return maps;
    }

    public void setMaps(List<Integer> maps) {
        this.maps = maps;
    }

    public List<Integer> getScreens() {
        return screens;
    }

    public void setScreens(List<Integer> screens) {
        this.screens = screens;
    }

    public List<Integer> getTemplates() {
        return templates;
    }

    public void setTemplates(List<Integer> templates) {
        this.templates = templates;
    }

    public void addMapId(Integer id) {
        maps = ZbxListUtils.add(maps, id);

    }

    public void addScreenId(Integer id) {
        screens = ZbxListUtils.add(screens, id);

    }

    public void addTemplateId(Integer id) {
        templates = ZbxListUtils.add(templates, id);

    }


}
