package com.dianping.abtest.spi;

import com.dianping.abtest.Context;

/**
 * 
 * @author damon.zhu
 *
 */
public interface TrafficFilter {
	
	public boolean filter(Context context);

}
