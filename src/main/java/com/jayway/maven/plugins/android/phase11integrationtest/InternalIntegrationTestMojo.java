/*
 * Copyright (C) 2009 Jayway AB
 * Copyright (C) 2007-2008 JVending Masa
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
package com.jayway.maven.plugins.android.phase11integrationtest;

import com.jayway.maven.plugins.android.standalonemojos.AbstractPlatformTestMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * <p>Internal. Do not use.</p>
 * <p>Called automatically when the lifecycle reaches phase <code>integration-test</code>. Figures out whether to
 * call goals in this phase, and calls them.</p>
 *
 * @goal internal-integration-test
 * @phase integration-test
 * @author hugo.josefson@jayway.com
 */
public class InternalIntegrationTestMojo extends AbstractPlatformTestMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        if (isEnableIntegrationTest()){
            platformTest();
        }
    }

}