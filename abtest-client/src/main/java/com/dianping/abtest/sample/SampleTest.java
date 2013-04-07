package com.dianping.abtest.sample;

import com.dianping.abtest.ABTestCase;
import com.dianping.abtest.ABTestId;
import com.dianping.abtest.ABTestManager;

public class SampleTest {
    public static ABTestCase m_case1 = ABTestManager.getTest(MyABTestId.CASE1);

    public void usage() {
        // some initialization for case 1

        if (m_case1.isGroupA()) {
            // Cat.logMetric(...);
        } else if (m_case1.isGroupB()) {
            // Cat.logMetric(...);
        } else {
            // Cat.logMetric(...);
        }

        // some cleanup for case 1
    }

    public static enum MyABTestId implements

    ABTestId {
        CASE1(1001);

        private int m_id;

        private MyABTestId(int id) {
            m_id = id;
        }

        @Override
        public int getId() {
            return m_id;
        }
    }
}
