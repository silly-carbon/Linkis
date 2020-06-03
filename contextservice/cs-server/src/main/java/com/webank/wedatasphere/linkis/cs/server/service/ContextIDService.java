/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.linkis.cs.server.service;

import com.webank.wedatasphere.linkis.cs.common.entity.source.ContextID;
import com.webank.wedatasphere.linkis.cs.common.exception.CSErrorException;

/**
 * Created by patinousward on 2020/2/18.
 */
public abstract class ContextIDService extends AbstractService {

    public abstract String createContextID(ContextID contextID) throws CSErrorException;

    public abstract ContextID getContextID(String id) throws CSErrorException;

    public abstract void updateContextID(ContextID contextID) throws CSErrorException;

    public abstract void resetContextID(String id) throws CSErrorException;

    public abstract void removeContextID(String id) throws CSErrorException;
}