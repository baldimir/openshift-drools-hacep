/*
 * Copyright 2019 Red Hat
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

package org.kie.remote;

import java.io.Closeable;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

import org.kie.remote.impl.RemoteKieSessionImpl;

public interface RemoteKieSession extends Closeable, RemoteEntryPoint, RemoteStatefulSession, UpdatableSession {

    RemoteEntryPoint getEntryPoint(String name);

    static RemoteKieSession create(Properties configuration) {
        return new RemoteKieSessionImpl( configuration );
    }

    static RemoteKieSession create(Properties configuration, TopicsConfig envConfig) {
        return new RemoteKieSessionImpl( configuration, envConfig );
    }

    CompletableFuture<String> getKJarGAV();

    CompletableFuture<Boolean> updateKJarGAV(String kjar);

}
