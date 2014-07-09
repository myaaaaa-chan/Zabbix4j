package com.zabbix4j.mediatype;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MediaTypeGetRequest extends ZabbixApiRequest {
    public MediaTypeGetRequest() {
        setMethod("mediatype.get");
    }

    private Params params = new Params();

    public class Params extends GetRequestCommonParams {

        private List<Integer> mediatypeids;
        private List<Integer> mediaids;
        private List<Integer> userids;
        private String selectUsers;

        public void addMediaTypeId(Integer id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
        }

        public void addMediaId(Integer id) {
            mediaids = ZbxListUtils.add(mediaids, id);
        }

        public void addUserId(Integer id) {
            userids = ZbxListUtils.add(userids, id);
        }

        /**
         * Gets mediatypeids.
         *
         * @return Value of mediatypeids.
         */
        public List<Integer> getMediatypeids() {
            return mediatypeids;
        }

        /**
         * Sets new mediatypeids.
         *
         * @param mediatypeids New value of mediatypeids.
         */
        public void setMediatypeids(List<Integer> mediatypeids) {
            this.mediatypeids = mediatypeids;
        }

        /**
         * Gets selectUsers.
         *
         * @return Value of selectUsers.
         */
        public String getSelectUsers() {
            return selectUsers;
        }

        /**
         * Sets new selectUsers.
         *
         * @param selectUsers New value of selectUsers.
         */
        public void setSelectUsers(String selectUsers) {
            this.selectUsers = selectUsers;
        }

        /**
         * Gets userids.
         *
         * @return Value of userids.
         */
        public List<Integer> getUserids() {
            return userids;
        }

        /**
         * Sets new userids.
         *
         * @param userids New value of userids.
         */
        public void setUserids(List<Integer> userids) {
            this.userids = userids;
        }

        /**
         * Gets mediaids.
         *
         * @return Value of mediaids.
         */
        public List<Integer> getMediaids() {
            return mediaids;
        }

        /**
         * Sets new mediaids.
         *
         * @param mediaids New value of mediaids.
         */
        public void setMediaids(List<Integer> mediaids) {
            this.mediaids = mediaids;
        }
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
}
