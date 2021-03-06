/*
 * Copyright (c) 2019 Georg Felbinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.gfelbing.konfig.examples.host

import de.gfelbing.konfig.core.definition.KonfigDeclaration.string
import de.gfelbing.konfig.core.definition.KonfigDeclaration.required
import de.gfelbing.konfig.core.source.KonfigurationSource

object HostBasedConfigDeclaration {
    val valueA = string("value", "a").required()
    val valueB = string("value", "b").required()

    fun load(source: KonfigurationSource) = HostBasedConfig(
            valueA = source[valueA],
            valueB = source[valueB]
    )
}