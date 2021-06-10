package com.rwdz.station;

import com.rwdz.coordinate.Vector2;
import lombok.Data;

/**
 * @author 章可政
 * @date 2021/6/10 22:47
 */
@Data
public abstract class Station {
    protected int id;

    protected String name;

    protected StationType stationType;

    protected Vector2 vector2=Vector2.ZERO;

    protected float height;

}
