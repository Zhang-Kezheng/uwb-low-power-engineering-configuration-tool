package com.rwdz.station;

import com.sun.org.apache.regexp.internal.RE;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 章可政
 * @date 2021/6/10 23:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ReferenceStation extends Station{

    private ReferenceStation referenceStation;

    private SyncStation syncStation;
}
