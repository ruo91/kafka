/**
 *
 *
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kafka.metrics

import java.util.Properties

/**
 * Base trait for reporter MBeans. If a client wants to expose these JMX
 * operations on a custom reporter (that implements
 * [[kafka.metrics.KafkaMetricsReporter]]), the custom reporter needs to
 * additionally implement an MBean trait that extends this trait so that the
 * registered MBean is compliant with the standard MBean convention.
 */
trait KafkaMetricsReporterMBean {
  def startReporter(pollingPeriodInSeconds: Long)
  def stopReporter()

  /**
   *
   * @return The name with which the MBean will be registered.
   */
  def getMBeanName: String
}


trait KafkaMetricsReporter {
  def init(props: Properties)
}
