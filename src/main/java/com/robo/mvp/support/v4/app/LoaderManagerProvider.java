/**
 * Copyright (c) 2016 Robo Creative - https://robo-creative.github.io.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.robo.mvp.support.v4.app;

import android.support.v4.app.LoaderManager;

/**
 * Provides access to {@link android.support.v4.app.LoaderManager LoaderManager}
 * .
 * 
 * @author robo-admin
 * 
 */
public interface LoaderManagerProvider {

	LoaderManager getLoaderManager();
}
