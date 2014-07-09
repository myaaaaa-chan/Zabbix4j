package com.zabbix4j.media;

import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

import java.util.List;

/**
 * @author Suguru Yajima
 */
public class MediaGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public MediaGetRequest() {
        setMethod("usermedia.get");
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

    public class Params extends GetRequestCommonParams {

        private List<Integer> mediaids;
        private List<Integer> usrgrpids;
        private List<Integer> userids;
        private List<Integer> mediatypeids;

        public void addMediaId(Integer id) {
            mediaids = ZbxListUtils.add(mediaids, id);
        }

        public void addUsrGroupId(Integer id) {
            usrgrpids = ZbxListUtils.add(usrgrpids, id);
        }

        public void addUserId(Integer id) {
            userids = ZbxListUtils.add(userids, id);
        }

        public void addMediaTypeId(Integer id) {
            mediatypeids = ZbxListUtils.add(mediatypeids, id);
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
         * Gets usrgrpids.
         *
         * @return Value of usrgrpids.
         */
        public List<Integer> getUsrgrpids() {
            return usrgrpids;
        }

        /**
         * Sets new usrgrpids.
         *
         * @param usrgrpids New value of usrgrpids.
         */
        public void setUsrgrpids(List<Integer> usrgrpids) {
            this.usrgrpids = usrgrpids;
        }
    }
}
