/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Update Access Key Request Marshaller
 */
public class UpdateAccessKeyRequestMarshaller implements Marshaller<Request<UpdateAccessKeyRequest>, UpdateAccessKeyRequest> {

    public Request<UpdateAccessKeyRequest> marshall(UpdateAccessKeyRequest updateAccessKeyRequest) {
        Request<UpdateAccessKeyRequest> request = new DefaultRequest<UpdateAccessKeyRequest>(updateAccessKeyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "UpdateAccessKey");
        request.addParameter("Version", "2010-05-08");
        if (updateAccessKeyRequest != null) {
            if (updateAccessKeyRequest.getUserName() != null) {
                request.addParameter("UserName", StringUtils.fromString(updateAccessKeyRequest.getUserName()));
            }
        }
        if (updateAccessKeyRequest != null) {
            if (updateAccessKeyRequest.getAccessKeyId() != null) {
                request.addParameter("AccessKeyId", StringUtils.fromString(updateAccessKeyRequest.getAccessKeyId()));
            }
        }
        if (updateAccessKeyRequest != null) {
            if (updateAccessKeyRequest.getStatus() != null) {
                request.addParameter("Status", StringUtils.fromString(updateAccessKeyRequest.getStatus()));
            }
        }


        return request;
    }
}
