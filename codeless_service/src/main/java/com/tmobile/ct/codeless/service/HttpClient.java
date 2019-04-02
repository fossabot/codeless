/*******************************************************************************
 * * Copyright 2018 T Mobile, Inc. or its affiliates. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License.  You may obtain a copy
 *  * of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 *  * License for the specific language governing permissions and limitations under
 *  * the License.
 ******************************************************************************/
package com.tmobile.ct.codeless.service;

import com.tmobile.ct.codeless.service.httpclient.Headers;

/**
 * The Interface HttpClient.
 *
 * @author Rob Graff
 */
public interface HttpClient {

	/**
	 * Call.
	 *
	 * @param operation the operation
	 * @return the http response
	 */
	HttpResponse call(HttpRequest operation);
	
	/**
	 * Call.
	 *
	 * @return the http response
	 */
	HttpResponse call();

	/**
	 * Builds the.
	 *
	 * @param operation the operation
	 */
	void build(HttpRequest operation);

	/**
	 * Invoke request modifiers.
	 */
	void invokeRequestModifiers();
	
	
}
