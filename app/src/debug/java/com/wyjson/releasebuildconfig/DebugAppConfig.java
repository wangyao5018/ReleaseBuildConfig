package com.wyjson.releasebuildconfig;

import com.wyjson.releasebuildconfig.constant.ReleaseAppConfig;

/**
 * 应用开发配置
 *
 * @author Wyjson
 * @version 1
 * @date 2019-10-28 15:24
 */
public class DebugAppConfig extends ReleaseAppConfig {

    @Override
    public String getBuildType() {
        return "开发版-Debug";
    }

    @Override
    public String getApiUrl() {
        return "https://dev-api.url.com";
    }

    @Override
    public String getApiUserUrl() {
        return "https://dev-user-api.url.com";
    }

    @Override
    public String getWebAppUrl() {
        return "https://dev.url.com";
    }
}