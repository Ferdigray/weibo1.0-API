package org.nefu.softlab.weiboAPI.biz.service;

import java.util.List;
import java.util.Map;

/**
 * Created by Jiaxu_Zou on 2018-4-13
 *
 * 爬虫监控相关的业务逻辑
 */
public interface SpiderService {

    /**
     * 获取Ippool的相关信息
     * @return
     */
    Map getIppoolData();

    /**
     * 获取爬虫的状态信息
     * @return
     */
    Map getStatus();

    /**
     * 获取七天内的数据量
     * @return
     */
    List getSevenday();

    /**
     * 获取内存占用情况
     * @return
     */
    List<Map<String, Object>> getMemoryStatus();

    /**
     * 获取当日数据的增量
     * @return
     */
    List<Map<String, Object>> getTodayIncreasement();


}
