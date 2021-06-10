package com.rwdz.context;

import java.util.List;

/**
 * @author 章可政
 * @date 2021/6/10 22:24
 * 项目上下文，主页用于存储每个项目的数据
 */
public class ProjectContext extends Context{
    /**
     * 项目文件路径
     */
    private String path;
    /**
     * 图层上下文列表
     */
    private List<LayerContext> layerContexts;
}
