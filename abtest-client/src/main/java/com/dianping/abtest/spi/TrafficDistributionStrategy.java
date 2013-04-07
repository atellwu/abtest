/**
 * Project: abtest-client
 * 
 * File Created at 2013-4-2
 * $Id$
 * 
 * Copyright 2013 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.abtest.spi;

/**
 * TODO Comment of Strategy
 * 
 * @author wukezhu
 */
public interface TrafficDistributionStrategy {

    Group trafficDistribute(Context context);

}
