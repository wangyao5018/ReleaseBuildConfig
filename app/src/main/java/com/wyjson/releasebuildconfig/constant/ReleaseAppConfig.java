package com.wyjson.releasebuildconfig.constant;

/**
 * 应用线上配置
 *
 * @author Wyjson
 * @version 1
 * @date 2019-10-28 15:21
 */
public class ReleaseAppConfig extends AppConfig {

    @Override
    public String getBuildType() {
        return "正式版-Release";
    }

    @Override
    public String getApiUrl() {
        return "https://api.url.com";
    }

    @Override
    public String getApiUserUrl() {
        return "https://user-api.url.com";
    }

    @Override
    public String getWebAppUrl() {
        return "https://url.com";
    }
}
