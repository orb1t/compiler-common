/*
 * Copyright 2013 Alexander Shabanov - http://alexshabanov.com.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alexshabanov.compiler.common.source;

/**
 * Represents errors when certain source could not be accessed.
 *
 * @author Alexander Shabanov
 */
public final class SourceAccessException extends RuntimeException {
    public SourceAccessException() {
    }

    public SourceAccessException(String message) {
        super(message);
    }

    public SourceAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public SourceAccessException(Throwable cause) {
        super(cause);
    }
}
