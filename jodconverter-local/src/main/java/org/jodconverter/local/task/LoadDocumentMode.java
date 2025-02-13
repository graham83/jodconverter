/*
 * Copyright 2004 - 2012 Mirko Nasato and contributors
 *           2016 - 2020 Simon Braconnier and contributors
 *
 * This file is part of JODConverter - Java OpenDocument Converter.
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

package org.jodconverter.local.task;

/** Represents how a document is loaded/stored when converting a document. */
public enum LoadDocumentMode {

  /**
   * When using this mode, it is assumed that the OO instance responsible for the conversion is able
   * to read the file from the disk, and thus the file being converted will be sent as a stream to
   * the OO instance. This mode provides the best performance.
   */
  LOCAL,

  /**
   * When using this mode, the file being converted will be sent as a stream to the OO instance. Use
   * this mode when the OO instance responsible for the conversion is running on another server or
   * in a docker container.
   */
  REMOTE,

  /**
   * When using this mode, JODConverter will auto-detect which mode should be used to open a
   * document. When the task is executed using an {@link
   * org.jodconverter.local.office.ExternalOfficeManager}, the {@link #REMOTE} mode is used.
   * Otherwise, the {@link #LOCAL} mode is used.
   */
  AUTO
}
