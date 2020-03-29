package cn.jiang.station.platform.service.redis.service;

public interface RedisService {
    /**
     * 插入数据
     *
     * @param key
     * @param value
     * @param seconds
     */
    public void put(String key, Object value, long seconds);

    /**
     * 获取数据
     * @param key
     * @return
     */
    public Object get(String key);

}
