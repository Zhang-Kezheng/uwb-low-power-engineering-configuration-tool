package com.rwdz.context;

import com.rwdz.station.AOAStation;
import com.rwdz.station.GeneralStation;
import com.rwdz.station.ReferenceStation;
import com.rwdz.station.SyncStation;

import java.util.List;

/**
 * @author 章可政
 * @date 2021/6/10 23:18
 * 基站上下文
 */
public class StationContext {
    /**
     * 普通站列表
     */
    private List<GeneralStation> generalStations;

    /**
     * 参考站列表
     */
    private List<ReferenceStation> referenceStations;

    /**
     * AOA基站列表
     */
    private List<AOAStation> aoaStations;

    /**
     * 同步站列表
     */
    private List<SyncStation> syncStations;
}
