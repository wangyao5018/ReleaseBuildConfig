package com.wyjson.releasebuildconfig;

import com.wyjson.releasebuildconfig.constant.ReleaseAppConfig;

/**
 * 应用Beta配置
 *
 * @author Wyjson
 * @version 1
 * @date 2019-10-28 15:24
 */
public class SandboxAppConfig extends ReleaseAppConfig {
    @Override
    public String getApiUrl() {
        return "https://sandbox-api.url.com";
    }

    @Override
    public String getApiUserUrl() {
        return "https://sandbox-user-api.url.com";
    }

    @Override
    public String getBaseWebUrl() {
        return "https://sandbox.url.com";
    }
}