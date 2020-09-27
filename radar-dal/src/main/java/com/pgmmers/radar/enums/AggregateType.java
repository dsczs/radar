package com.pgmmers.radar.enums;

/**
 * 
 * 统计类型.
 * 
 * @author feihu.wang
 * @version Revision 1.0.0
 * @since：2016年8月19日
 *
 */
public class AggregateType {

    // 总数
    public static final int COUNT = 1;

    // 不同项总数
    public static final int DISTINCT_COUNT = 2;

    // 和
    public static final int SUM = 3;

    // 平均值
    public static final int AVERAGE = 4;

    // 最大值
    public static final int MAX = 5;

    // 最小值
    public static final int MIN = 6;
    
    /**
     * 标准差
     */
    public static final int SD = 7;
    
    /**
     * 方差
     */
    public static final int VARIANCE = 8;
    
    /**
     * 偏离率
     */
    public static final int DEVIATION = 9;
    
    /**
     * 中位数
     */
    public static final int MEDIAN = 10;
    
}
