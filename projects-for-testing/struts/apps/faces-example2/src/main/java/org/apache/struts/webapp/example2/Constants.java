/*
 * $Id: Constants.java 471754 2006-11-06 14:55:09Z husted $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.apache.struts.webapp.example2;


/**
 * Manifest constants for the example application.
 *
 * @author Craig R. McClanahan
 * @version $Rev: 471754 $ $Date: 2006-11-06 15:55:09 +0100 (Lun, 06 nov 2006) $
 */

public final class Constants {


    /**
     * The package name for this application.
     */
    public static final String Package = "org.apache.struts.webapp.example";


    /**
     * The application scope attribute under which our user database
     * is stored.
     */
    public static final String DATABASE_KEY = "database";


    /**
     * The session scope attribute under which the Subscription object
     * currently selected by our logged-in User is stored.
     */
    public static final String SUBSCRIPTION_KEY = "subscription";


    /**
     * The session scope attribute under which the User object
     * for the currently logged in user is stored.
     */
    public static final String USER_KEY = "user";


}