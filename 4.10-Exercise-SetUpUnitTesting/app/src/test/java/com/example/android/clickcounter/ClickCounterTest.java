package com.example.android.clickcounter;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by justinmae on 4/21/16.
 */
public class ClickCounterTest {

    private ClickCounter mClickCounter;

    @Before
    public void setUpCounter() {
        mClickCounter = new ClickCounter();
    }

    @Test
    public void verifyInitialCount() {
        Assert.assertEquals(mClickCounter.getCount(), 0);
    }

    @Test
    public void verifyIncrementMethod() {
        int previousValue = mClickCounter.getCount();
        mClickCounter.increment();
        int postValue = mClickCounter.getCount();
        Assert.assertEquals(postValue, previousValue + 1);
    }
}
