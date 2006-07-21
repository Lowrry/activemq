/*
 * Copyright 2005-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.store.jdbc;

import org.apache.activemq.Service;

/**
 * Represents some kind of lock service to ensure that a broker is the only master
 * 
 * @version $Revision: $
 */
public interface DatabaseLocker extends Service {

    /**
     * Used by a timer to keep alive the lock.
     * If the method returns false the broker should be terminated
     */
    public boolean keepAlive();
    
}
