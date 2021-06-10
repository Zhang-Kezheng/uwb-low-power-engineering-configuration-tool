package com.rwdz.station;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 章可政
 * @date 2021/6/10 23:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GeneralStation extends Station{
    private ReferenceStation referenceStation;

    private SyncStation syncStation;
}
