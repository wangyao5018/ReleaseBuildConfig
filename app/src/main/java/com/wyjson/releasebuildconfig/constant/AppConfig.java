package com.wyjson.releasebuildconfig.constant;

/**
 * @author Wyjson
 * @version 1
 * @date 2019-10-28 15:13
 */
public abstract class AppConfig {

    public abstract String getBuildType();

    /**
     * 通用api
     */
    public abstract String getApiUrl();

    /**
     * 用户api
     */
    public abstract String getApiUserUrl();

    /**
     * bas web url
     */
    public abstract String getBaseWebUrl();

}
