/*
 * Copyright (C) 2016-2020 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.stream.alpakka.pravega

import io.pravega.client.stream.{EventPointer, Position}

class PravegaEvent[+A](val message: A, val position: Position, val eventPointer: EventPointer)
