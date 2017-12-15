/*
 * Copyright 2014 Red Hat, Inc. and others
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */
package io.vertx.core.http.impl;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
/**
 * List of all frame types.
 */
public enum FrameType {
  CONTINUATION,
  TEXT,
  BINARY,
  CLOSE,
  PING,
  PONG,
}
