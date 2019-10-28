package com.wyjson.releasebuildconfig.constant;

import com.wyjson.releasebuildconfig.BuildConfig;

/**
 * 应用常量
 *
 * @author Wyjson
 * @version 1
 * @date 2019-10-28 14:39
 */
public interface AppConstant {

    String BUILD_TYPE = BuildConfig.AppConfig.getBuildType();

    /**
     * 通用api
     */
    String API_URL = BuildConfig.AppConfig.getApiUrl();

    /**
     * 用户api
     */
    String API_USER_URL = BuildConfig.AppConfig.getApiUserUrl();

    /**
     * bas web url
     */
    String BASE_WEB_URL = BuildConfig.AppConfig.getBaseWebUrl();

    /**
     * 商城
     */
    String SHOP_URL = BASE_WEB_URL + "/shop";

    /**
     * 订单详细
     */
    String ORDER_DETAIL_URL = BASE_WEB_URL + "/orders/%s";

    /**
     * 收藏
     */
    String FAVOUR_URL = BASE_WEB_URL + "/favours";
}
