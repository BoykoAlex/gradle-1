/*
 * Copyright 2017 the original author or authors.
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
package org.gradle.api.internal.java;

import com.google.common.collect.ImmutableSet;
import org.gradle.api.component.ComponentWithVariants;
import org.gradle.api.component.SoftwareComponent;
import org.gradle.api.internal.component.SoftwareComponentInternal;
import org.gradle.api.internal.component.UsageContext;

import javax.inject.Inject;
import java.util.Set;

public class ComponentWithVariantsAdapter implements SoftwareComponentInternal, ComponentWithVariants {
    private final SoftwareComponentInternal delegate;

    @Inject
    public ComponentWithVariantsAdapter(SoftwareComponentInternal delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getName() {
        return delegate.getName();
    }

    @Override
    public Set<? extends UsageContext> getUsages() {
        return delegate.getUsages();
    }

    @Override
    public Set<? extends SoftwareComponent> getVariants() {
        return ImmutableSet.of();
    }
}
