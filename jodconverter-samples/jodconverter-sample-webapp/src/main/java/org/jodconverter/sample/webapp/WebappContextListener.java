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

package org.jodconverter.sample.webapp;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.jodconverter.core.office.OfficeException;

/** Web context listener. */
@SuppressWarnings("PMD")
public class WebappContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(final ServletContextEvent event) {

    try {
      WebappContext.init(event.getServletContext());
    } catch (OfficeException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void contextDestroyed(final ServletContextEvent event) {
    try {
      WebappContext.destroy(event.getServletContext());
    } catch (OfficeException e) {
      throw new RuntimeException(e);
    }
  }
}
