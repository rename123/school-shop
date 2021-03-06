package cn.reminis.o2o.service.impl;

import cn.reminis.o2o.cache.JedisUtil;
import cn.reminis.o2o.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sun
 * @date 2020-08-02 22:40
 * @description
 */
@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    private JedisUtil.Keys jedisKeys;

    @Override
    public void removeFromCache(String keyPrefix) {
        Set<String> keys = jedisKeys.keys(keyPrefix + "*");
        for (String key : keys) {
            jedisKeys.del(key);
        }
    }
}
