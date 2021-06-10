package com.rwdz.context;

import com.rwdz.coordinate.Vector;
import com.rwdz.coordinate.Vector2;

import java.io.File;

/**
 * @author 章可政
 * @date 2021/6/10 22:28
 * 图层上下文，主页存储图层的数据
 */
public class LayerContext extends Context{

    /**
     * 地图
     */
    private File map;

    /**
     * 原点
     */
    private Vector origin=new Vector2(0,0);

    /**
     * 比例尺
     */
    private Double scale=0.01;
}
