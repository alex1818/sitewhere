/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.mongodb.device;

import com.mongodb.DBObject;
import com.sitewhere.spi.SiteWhereException;

/**
 * Interface for buffer used for saving device events.
 * 
 * @author Derek
 */
public interface IDeviceEventBuffer {

    /**
     * Start buffer lifecycle.
     * 
     * @throws SiteWhereException
     */
    public void start() throws SiteWhereException;

    /**
     * Stop buffer lifecycle.
     * 
     * @throws SiteWhereException
     */
    public void stop() throws SiteWhereException;

    /**
     * Add a {@link DBObject} to the queue.
     * 
     * @param put
     * @throws SiteWhereException
     */
    public void add(DBObject put) throws SiteWhereException;
}